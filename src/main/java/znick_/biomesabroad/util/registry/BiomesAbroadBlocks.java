package znick_.biomesabroad.util.registry;

import java.lang.reflect.Field;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import znick_.biomesabroad.biome.mushroomforest.deco.block.MushroomStem;
import znick_.biomesabroad.biome.mushroomforest.deco.block.RedMushroomBlock;
import znick_.biomesabroad.block.BlockBase;
import znick_.biomesabroad.block.BlockFoliage;
import znick_.biomesabroad.block.SlabBase;
import znick_.biomesabroad.block.StairBase;

public final class BiomesAbroadBlocks {

	//Autumnal Forest
	
	//Wasteland
	public static final Block DEAD_GRASS = new BlockBase("blockDeadGrass", "ground/dead", 0.6F, Material.grass, Block.soundTypeGrass, 0, true, false);
	public static final Block TUMBLEWEED = new BlockBase("blockTumbleweed", "bush", 0.2F, Material.leaves, Block.soundTypeGrass, 0, false, false);
	public static final Block DEAD_LOG = new BlockBase("blockDeadLog", "tree/dead/log", 2.0F, Material.wood, Block.soundTypeWood, 0, true, true);
	public static final Block DEAD_LEAVES = new BlockBase("blockDeadLeaves", "tree/dead/leaves" , 0.2F, Material.leaves, Block.soundTypeGrass, 0, false, false);
	public static final Block DEAD_PLANKS = new BlockBase("blockDeadPlanks", "cosmetic/dead", 2.0F, Material.wood, Block.soundTypeWood, 0, true, false);
	public static final Block DEAD_PLANKS_SLAB = new SlabBase(BiomesAbroadBlocks.DEAD_PLANKS, "slabDeadPlanks","cosmetic/dead", "blockDeadPlanks", 2.0F);
	public static final Block DEAD_PLANKS_STAIRS = new StairBase(DEAD_PLANKS, "stairDeadPlanks");

	//Cartoon Hills
	public static final Block CARTOON_GRASS = new BlockBase("blockCartoonGrass", "ground/cartoon", 0.6F, Material.grass, Block.soundTypeGrass, 0, true, true);
	public static final Block CARTOON_DIRT = new BlockBase("blockCartoonDirt", "ground/cartoon", 0.6F, Material.grass, Block.soundTypeGrass, 0, true, false);
	public static final Block CARTOON_LOG = new BlockBase("blockCartoonLog", "tree/cartoon/log", 2.0F, Material.wood, Block.soundTypeWood, 0, true, true);
	public static final Block CARTOON_LEAVES = new BlockBase("blockCartoonLeaves", "tree/cartoon/leaves" , 0.2F, Material.leaves, Block.soundTypeGrass, 0, false, false);
	public static final Block CARTOON_GRASS_PLANT = new BlockFoliage(0, "foliage/cartoon", "plantCartoonGrass", BiomesAbroadBlocks.CARTOON_GRASS);
	public static final Block CARTOON_PLANKS = new BlockBase("blockCartoonPlanks", "cosmetic/cartoon", 2.0F, Material.wood, Block.soundTypeWood, 0, true, false);
	public static final Block CARTOON_PLANKS_SLAB = new SlabBase(BiomesAbroadBlocks.CARTOON_PLANKS, "slabCartoonPlanks","cosmetic/cartoon", "blockCartoonPlanks", 2.0F);
	public static final Block CARTOON_PLANKS_STAIRS = new StairBase(CARTOON_PLANKS, "stairCartoonPlanks");

	//Retro
	public static final Block RETRO_GRASS = new BlockBase("blockRetroGrass", "ground/retro", 0.6F, Material.grass, Block.soundTypeGrass, 0, true, true);
	public static final Block RETRO_DIRT = new BlockBase("blockRetroDirt", "ground/retro", 0.6F, Material.grass, Block.soundTypeGrass, 0, true, false);
	public static final Block SPACE_INVADER = new BlockFoliage(0, "foliage/retro", "plantSpaceInvader", BiomesAbroadBlocks.RETRO_GRASS);
	
	//Overgrown Mountains
	public static final Block OVERGROWN_STONE = new BlockBase("blockOvergrownStone", "ground/overgrown", 0.6F, Material.grass, Block.soundTypeGrass, 0, true, true);
	
	//Winter Wonderland
	public static final Block ICE_FLOWER = new BlockFoliage(0, "foliage/winter", "flowerIce", Blocks.snow);
	
	//Pirate Shores
	public static final Block DESERT_FAN = new BlockFoliage(0, "foliage/pirate", "plantDesertFan", Blocks.sand);
	
	//Starfield
	public static final Block STARGRASS = new BlockBase("blockStargrass", "ground/star", 0.6F, Material.grass, Block.soundTypeGrass, 0, true, true);
	public static final Block STARDIRT = new BlockBase("blockStardirt", "ground/star", 0.6F, Material.grass, Block.soundTypeGrass, 0, true, false);
	public static final Block STARFLOWER = new BlockFoliage(0, "foliage/star", "flowerStar", BiomesAbroadBlocks.STARGRASS);
	
	//Cherry Blossom Forest
	public static final Block CHERRY_GRASS = new BlockBase("blockCherryGrass", "ground/cherry", 0.6F, Material.grass, Block.soundTypeGrass, 0, true, true);
	public static final Block CHERRY_DIRT = new BlockBase("blockCherryDirt", "ground/cherry", 0.6F, Material.grass, Block.soundTypeGrass, 0, true, false);
	public static final Block CHERRY_GRASS_PLANT = new BlockFoliage(0, "foliage/cherry", "plantCherryGrass", BiomesAbroadBlocks.CHERRY_GRASS);
	
	//Mushroom Forest
	public static final Block MUSHROOM_STEM = new MushroomStem();
	public static final Block RED_MUSHROOM_BLOCK = new RedMushroomBlock();

	public static void init() {
		for (Field field : BiomesAbroadBlocks.class.getDeclaredFields()) {
			try {
				if (field.get(null) instanceof Block) {
					Block block = (Block) field.get(null);
					GameRegistry.registerBlock(block, block.getUnlocalizedName());
				}
			} 
			catch(Exception e) {throw new RuntimeException(e);}
		}
	}
	
}
