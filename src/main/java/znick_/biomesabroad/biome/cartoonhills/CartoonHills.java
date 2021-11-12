package znick_.biomesabroad.biome.cartoonhills;

import net.minecraftforge.common.BiomeDictionary.Type;
import znick_.biomesabroad.biome.BaseBiome;
import znick_.biomesabroad.biome.cartoonhills.deco.CartoonTreeGenerator;
import znick_.biomesabroad.util.registry.BiomesAbroadBlocks;

public class CartoonHills extends BaseBiome {
	
	public CartoonHills() {
		super(CartoonHillsDecorator.class, Type.PLAINS);
		this.setBiomeName("Cartoon Hills");

		this.heightVariation = 0.5F;
		this.enableSnow = false;
		this.setBlocks(BiomesAbroadBlocks.CARTOON_GRASS, BiomesAbroadBlocks.CARTOON_DIRT);
		this.theBiomeDecorator.generateLakes = false;
		this.theBiomeDecorator.flowersPerChunk = 0;
		
		this.addStructure(new CartoonTreeGenerator(), 0.75F);
		this.addFlower(BiomesAbroadBlocks.CARTOON_GRASS_PLANT, BiomesAbroadBlocks.CARTOON_GRASS, 64);
	}

}
