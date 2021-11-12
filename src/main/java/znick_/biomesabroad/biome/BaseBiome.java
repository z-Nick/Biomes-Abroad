package znick_.biomesabroad.biome;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary.Type;

public class BaseBiome extends BiomeGenBase {
	
	private static volatile int nextID = 200;
	private static volatile Class<? extends BiomeDecorator> current;
	
	private final Type type;
	private final Map<WorldGenerator, Float> structures = new LinkedHashMap<WorldGenerator, Float>();
	
	public BaseBiome(Class<? extends BiomeDecorator> decorator, Type type) {
		super(getNextID(decorator), true);
		this.type = type;
	}
	
	@Override
	public BiomeDecorator createBiomeDecorator() {
        try {return this.getModdedBiomeDecorator(current.newInstance());}
        catch(InstantiationException e) {throw new RuntimeException(e);} 
        catch (IllegalAccessException e) {throw new RuntimeException(e);}
    }
	
	@Override
	public void decorate(World world, Random rand, int chunkX, int chunkZ) {
		super.decorate(world, rand, chunkX, chunkZ);
		
		for (Map.Entry<WorldGenerator, Float> entry : this.structures.entrySet()) {
			StructureGenerator.generateStructure(world, rand, chunkX, chunkZ, this.rootHeight, entry.getKey(), entry.getValue()); 
		}
	}
	
	public Type getType() {
		return this.type;
	}
	
	private static int getNextID(Class<? extends BiomeDecorator> clazz) {
		current = clazz;
		return nextID++;
	}
	
	protected void setBlocks(Block top, Block fill) {
		this.topBlock = top;
		this.fillerBlock = fill;
	}
	
	protected void addFlower(final Block toGenerate, final Block generateIn, float chance) {
		this.structures.put(new WorldGenerator() {
			@Override
			public boolean generate(World world, Random rand, int x, int y, int z) {
				if (world.getBlock(x, y - 1, z) != null) {
					if (toGenerate.canPlaceBlockAt(world, x, y, z) && world.getBlock(x, y - 1, z) == generateIn) {
						world.setBlock(x, y, z, toGenerate, 0, 3);
					}
				}
				return true;
			}
			
		}, chance);
	}
	
	protected void addStructure(WorldGenerator structure, float chance) {
		this.structures.put(structure, chance);
	}

}
