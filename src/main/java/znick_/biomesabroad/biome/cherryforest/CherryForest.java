package znick_.biomesabroad.biome.cherryforest;

import java.awt.Color;

import net.minecraft.world.biome.BiomeDecorator;
import net.minecraftforge.common.BiomeDictionary.Type;
import znick_.biomesabroad.biome.BaseBiome;
import znick_.biomesabroad.registry.BiomesAbroadBlocks;

public class CherryForest extends BaseBiome {
	
	public CherryForest() {
		super(BiomeDecorator.class, Type.FOREST);
		this.setBiomeName("Cherry Forest");

		this.heightVariation = 0.0F;
		this.enableSnow = false;
		this.setBlocks(BiomesAbroadBlocks.blockCherryGrass, BiomesAbroadBlocks.blockCherryDirt);
		this.theBiomeDecorator.treesPerChunk = 8;
		
		this.addFlower(BiomesAbroadBlocks.plantCherryGrass, BiomesAbroadBlocks.blockCherryGrass, 64);
	}

	@Override
	public int getBiomeFoliageColor(int x, int y, int z) {
		float hue = 300/360;
		float sat = 0.3f;
		float bright = 1;
		return Color.HSBtoRGB(hue, sat, bright);
    }

}
