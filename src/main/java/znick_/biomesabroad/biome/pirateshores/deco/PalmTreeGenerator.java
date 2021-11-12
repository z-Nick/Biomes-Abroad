package znick_.biomesabroad.biome.pirateshores.deco;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class PalmTreeGenerator extends WorldGenerator {

	public boolean generate(World world, Random rand, int x, int y, int z) {

		if (world.getBlock(x, y - 1, z) != null) {
			if (Blocks.log.canPlaceBlockAt(world, x, y, z) && world.getBlock(x, y - 1, z) == Blocks.sand) {
				this.makeTree(world, x, y, z, rand);
			}
		}

		return true;
	}

	public void makeTree(World world, int x, int y, int z, Random rand) {
		for (int i = 0; i < 2; i++) {
			world.setBlock(x, y + i, z, Blocks.log, 3, 3);
		}

		switch (rand.nextInt(4)) {
		case 0:
			for (int i = 0; i < 2; i++) {
				world.setBlock(x + 1, y + i + 2, z, Blocks.log, 3, 3);
			}

			for (int i = 0; i < 2; i++) {
				world.setBlock(x + 2, y + i + 4, z, Blocks.log, 3, 3);
			}

			x = x + 2;
			break;

		case 1:

			for (int i = 0; i < 2; i++) {
				world.setBlock(x - 1, y + i + 2, z, Blocks.log, 3, 3);
			}

			for (int i = 0; i < 2; i++) {
				world.setBlock(x - 2, y + i + 4, z, Blocks.log, 3, 3);
			}

			x = x - 2;
			break;

		case 2:

			for (int i = 0; i < 2; i++) {
				world.setBlock(x, y + i + 2, z + 1, Blocks.log, 3, 3);
			}

			for (int i = 0; i < 2; i++) {
				world.setBlock(x, y + i + 4, z + 2, Blocks.log, 3, 3);
			}

			z = z + 2;
			break;
			
		case 3:

			for (int i = 0; i < 2; i++) {
				world.setBlock(x, y + i + 2, z - 1, Blocks.log, 3, 3);
			}

			for (int i = 0; i < 2; i++) {
				world.setBlock(x, y + i + 4, z - 2, Blocks.log, 3, 3);
			}

			z = z - 2;
			break;
		}
		
		y = y + 6;

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				world.setBlock(x + i, y, z + j, Blocks.leaves, 3, 3);
			}
		}

		world.setBlock(x + 2, y, z, Blocks.leaves, 3, 3);
		world.setBlock(x + 3, y, z, Blocks.leaves, 3, 3);
		world.setBlock(x + 4, y - 1, z, Blocks.leaves, 3, 3);

		world.setBlock(x - 2, y, z, Blocks.leaves, 3, 3);
		world.setBlock(x - 3, y, z, Blocks.leaves, 3, 3);
		world.setBlock(x - 4, y - 1, z, Blocks.leaves, 3, 3);

		world.setBlock(x, y, z + 2, Blocks.leaves, 3, 3);
		world.setBlock(x, y, z + 3, Blocks.leaves, 3, 3);
		world.setBlock(x, y - 1, z + 4, Blocks.leaves, 3, 3);

		world.setBlock(x, y, z - 2, Blocks.leaves, 3, 3);
		world.setBlock(x, y, z - 3, Blocks.leaves, 3, 3);
		world.setBlock(x, y - 1, z - 4, Blocks.leaves, 3, 3);

		world.setBlock(x + 2, y, z + 2, Blocks.leaves, 3, 3);
		world.setBlock(x + 3, y - 1, z + 3, Blocks.leaves, 3, 3);

		world.setBlock(x - 2, y, z + 2, Blocks.leaves, 3, 3);
		world.setBlock(x - 3, y - 1, z + 3, Blocks.leaves, 3, 3);

		world.setBlock(x + 2, y, z - 2, Blocks.leaves, 3, 3);
		world.setBlock(x + 3, y - 1, z - 3, Blocks.leaves, 3, 3);

		world.setBlock(x - 2, y, z - 2, Blocks.leaves, 3, 3);
		world.setBlock(x - 3, y - 1, z - 3, Blocks.leaves, 3, 3);

		world.setBlock(x, y + 1, z, Blocks.leaves, 3, 3);
	}

}