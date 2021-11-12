package znick_.biomesabroad.biome.cartoonhills.deco;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import znick_.biomesabroad.biome.wasteland.Wasteland;
import znick_.biomesabroad.util.registry.BiomesAbroadBlocks;

public class CartoonTreeGenerator extends WorldGenerator {

	public boolean generate(World world, Random rand, int x, int y, int z) {

		if (world.getBlock(x, y - 1, z) != null) {
			if (BiomesAbroadBlocks.CARTOON_LOG.canPlaceBlockAt(world, x, y, z) && world.getBlock(x, y - 1, z) == BiomesAbroadBlocks.CARTOON_GRASS) {
				this.makeTree(world, x, y, z);
			}
		}

		return true;
	}
	
	public void makeTree(World world, int x, int y, int z) {

		for (int i = 0; i < 5; i++) {
			world.setBlock(x, y + i, z, BiomesAbroadBlocks.CARTOON_LOG, 0, 3);
		}

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				world.setBlock(x + i, y + 5, z + j, BiomesAbroadBlocks.CARTOON_LEAVES, 0, 3);
			}
		}

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (!(i == 0 && j == 0))
					world.setBlock(x + i, y + 4, z + j, BiomesAbroadBlocks.CARTOON_LEAVES, 0, 3);
			}
		}

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (!(i == 0 && j == 0))
					world.setBlock(x + i, y + 3, z + j, BiomesAbroadBlocks.CARTOON_LEAVES, 0, 3);
			}
		}

	}

}