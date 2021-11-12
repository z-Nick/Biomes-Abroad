package znick_.biomesabroad.biome.pirateshores.deco;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ChestGenHooks;
import znick_.biomesabroad.biome.wasteland.Wasteland;
import znick_.biomesabroad.registry.BiomesAbroadBlocks;

public class BuriedTreasureGenerator extends WorldGenerator {

	public boolean generate(World world, Random rand, int x, int y, int z) {
		
		if (world.getBlock(x, y - 1, z) != null) {
			if (Blocks.wool.canPlaceBlockAt(world, x, y, z) && world.getBlock(x, y - 1, z) == Blocks.sand) {
				this.makeStructure(world, x, y - 1, z);
			}
		}

		return true;
	}

	public void makeStructure(World world, int x, int y, int z) {
		world.setBlock(x, y, z, Blocks.wool, 14, 3);
		
		world.setBlock(x + 1, y, z + 1, Blocks.wool, 14, 3);
		world.setBlock(x - 1, y, z + 1, Blocks.wool, 14, 3);
		world.setBlock(x + 1, y, z - 1, Blocks.wool, 14, 3);
		world.setBlock(x - 1, y, z - 1, Blocks.wool, 14, 3);
		
		world.setBlock(x + 2, y, z + 2, Blocks.wool, 14, 3);
		world.setBlock(x - 2, y, z + 2, Blocks.wool, 14, 3);
		world.setBlock(x + 2, y, z - 2, Blocks.wool, 14, 3);
		world.setBlock(x - 2, y, z - 2, Blocks.wool, 14, 3);
		
		world.setBlock(x, y - 1, z, Blocks.gold_block, 0, 3);
		world.setBlock(x + 1, y - 1, z, Blocks.gold_block, 0, 3);
		world.setBlock(x - 1, y - 1, z, Blocks.gold_block, 0, 3);
		world.setBlock(x, y - 1, z + 1, Blocks.gold_block, 0, 3);
		world.setBlock(x, y - 1, z - 1, Blocks.gold_block, 0, 3);
	}

}