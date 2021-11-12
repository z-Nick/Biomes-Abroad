package znick_.biomesabroad.biome.mushroomforest.deco;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import znick_.biomesabroad.registry.BiomesAbroadBlocks;

public class MiniRedMushroomGenerator extends WorldGenerator {

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		if (world.getBlock(x, y - 1, z) != null) {
			if (BiomesAbroadBlocks.MUSHROOM_STEM.canPlaceBlockAt(world, x, y, z) && world.getBlock(x, y - 1, z) == Blocks.grass) {
				
				world.setBlock(x,     y,     z,     BiomesAbroadBlocks.MUSHROOM_STEM);
				world.setBlock(x,     y + 1, z,     BiomesAbroadBlocks.MUSHROOM_STEM);
				
				world.setBlock(x,     y + 2, z,     BiomesAbroadBlocks.RED_MUSHROOM_BLOCK);
				world.setBlock(x + 1, y + 1, z,     BiomesAbroadBlocks.RED_MUSHROOM_BLOCK);
				world.setBlock(x - 1, y + 1, z,     BiomesAbroadBlocks.RED_MUSHROOM_BLOCK);
				world.setBlock(x,     y + 1, z + 1, BiomesAbroadBlocks.RED_MUSHROOM_BLOCK);
				world.setBlock(x,     y + 1, z - 1, BiomesAbroadBlocks.RED_MUSHROOM_BLOCK);
				
				return true;
			}
		}
		return false;
	}

}