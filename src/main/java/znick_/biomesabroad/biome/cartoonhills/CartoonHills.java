package znick_.biomesabroad.biome.cartoonhills;

import net.minecraftforge.common.BiomeDictionary.Type;
import znick_.biomesabroad.biome.BaseBiome;
import znick_.biomesabroad.biome.cartoonhills.deco.CartoonTreeGenerator;
import znick_.biomesabroad.registry.BiomesAbroadBlocks;

public class CartoonHills extends BaseBiome {
	
	public CartoonHills() {
		super(CartoonHillsDecorator.class, Type.PLAINS);
		this.setBiomeName("Cartoon Hills");

		this.heightVariation = 0.5F;
		this.enableSnow = false;
		this.setBlocks(BiomesAbroadBlocks.blockCartoonGrass, BiomesAbroadBlocks.blockCartoonDirt);
		this.theBiomeDecorator.generateLakes = false;
		this.theBiomeDecorator.flowersPerChunk = 0;
		
		this.addStructure(new CartoonTreeGenerator(), 0.75F);
		this.addFlower(BiomesAbroadBlocks.plantCartoonGrass, BiomesAbroadBlocks.blockCartoonGrass, 64);
	}

}