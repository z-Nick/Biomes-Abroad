package znick_.biomesabroad.biome.wasteland;

import java.awt.Color;

import net.minecraftforge.common.BiomeDictionary.Type;
import znick_.biomesabroad.biome.BaseBiome;
import znick_.biomesabroad.biome.wasteland.deco.DeadTreeGenerator;
import znick_.biomesabroad.registry.BiomesAbroadBlocks;

public class Wasteland extends BaseBiome {
	
	public Wasteland() {
		super(DecoratorWasteland.class, Type.SANDY);
		this.setTemperatureRainfall(Float.MAX_VALUE, 0.0F);
		this.setBiomeName("Wasteland");

		this.setHeight(new Height(0, 0));
		this.setDisableRain();
		this.enableSnow = false;
		this.topBlock = BiomesAbroadBlocks.blockDeadGrass;
		this.waterColorMultiplier = (new Color(255, 128, 0)).getRGB();
		this.theBiomeDecorator.generateLakes = false;
		this.flowers.clear();
		
		this.addStructure(new DeadTreeGenerator(), 0.2F);
		this.addFlower(BiomesAbroadBlocks.blockTumbleweed, BiomesAbroadBlocks.blockDeadGrass, 1);
	}

	@Override
	public float getSpawningChance() {
		return 0;
	}

}
