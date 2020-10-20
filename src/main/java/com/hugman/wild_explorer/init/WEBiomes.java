package com.hugman.wild_explorer.init;

import com.hugman.dawn.api.creator.BiomeCreator;
import com.hugman.wild_explorer.WildExplorer;
import com.hugman.wild_explorer.init.config.WEConfig;
import com.hugman.wild_explorer.util.WEBiomeCreator;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class WEBiomes extends WEPack {
	public static final WEConfig.WorldGenerationCategory CONFIG = WildExplorer.CONFIG.worldGeneration;
	public static RegistryKey<Biome> PUMPKIN_PASTURES;
	public static RegistryKey<Biome> PINK_CHERRY_OAK_FOREST;
	public static RegistryKey<Biome> WHITE_CHERRY_OAK_FOREST;
	public static RegistryKey<Biome> TALL_CRIMSON_FOREST;
	public static RegistryKey<Biome> TALL_WARPED_FOREST;
	public static RegistryKey<Biome> TRITANOPIAN_GALLERY;
	public static RegistryKey<Biome> ACHROMATOPSIAN_GALLERY;
	public static RegistryKey<Biome> PROTANOPIAN_GALLERY;
	public static RegistryKey<Biome> DARK_AMARANTH_FOREST;
	public static RegistryKey<Biome> TALL_DARK_AMARANTH_FOREST;

	public static void init() {
		BiomeCreator.Builder pumpkinPasturesBuilder = new BiomeCreator.Builder("pumpkin_pastures", WEBiomeCreator.createPumpkinPastures());
		BiomeCreator.Builder pinkCherryOakForestBuilder = new BiomeCreator.Builder("pink_cherry_oak_forest", WEBiomeCreator.createCherryOakForest(true));
		BiomeCreator.Builder whiteCherryOakForestBuilder = new BiomeCreator.Builder("white_cherry_oak_forest", WEBiomeCreator.createCherryOakForest(false));
		BiomeCreator.Builder tallCrimsonForestBuilder = new BiomeCreator.Builder("tall_crimson_forest", WEBiomeCreator.createTallCrimsonForest());
		BiomeCreator.Builder tallWarpedForestBuilder = new BiomeCreator.Builder("tall_warped_forest", WEBiomeCreator.createTallWarpedForest());
		BiomeCreator.Builder tritanopianGalleryBuilder = new BiomeCreator.Builder("tritanopian_gallery", WEBiomeCreator.createGallery(WEBiomeCreator.createTritanopianGalleryGenerationSettings()));
		BiomeCreator.Builder achromatopsianGalleryBuilder = new BiomeCreator.Builder("achromatopsian_gallery", WEBiomeCreator.createGallery(WEBiomeCreator.createAchromatopsianGalleryGenerationSettings()));
		BiomeCreator.Builder protanopianGalleryBuilder = new BiomeCreator.Builder("protanopian_gallery", WEBiomeCreator.createGallery(WEBiomeCreator.createProtanopianGalleryGenerationSettings()));
		BiomeCreator.Builder darkAmaranthForestBuilder = new BiomeCreator.Builder("dark_amaranth_forest", WEBiomeCreator.createDarkAmaranthForest());
		BiomeCreator.Builder tallDarkAmaranthForestBuilder = new BiomeCreator.Builder("tall_dark_amaranth_forest", WEBiomeCreator.createDarkAmaranthForest());
		if(CONFIG.pumpkinPastures) {
			pumpkinPasturesBuilder.addToOverworldContinental(OverworldClimate.COOL, 1D);
		}
		if(CONFIG.pinkCherryOakForest) {
			pinkCherryOakForestBuilder.addToOverworldContinental(OverworldClimate.COOL, 1D);
		}
		if(CONFIG.whiteCherryOakForest) {
			whiteCherryOakForestBuilder.addToOverworldContinental(OverworldClimate.COOL, 1D);
		}
		if(CONFIG.tallCrimsonForest) {
			tallCrimsonForestBuilder.addToNether(0.4F, 0.0F, 0.1F, 0.0F, 0.0F);
		}
		if(CONFIG.tallWarpedForest) {
			tallWarpedForestBuilder.addToNether(0.0F, 0.5F, 0.1F, 0.0F, 0.375F);
		}
		if(CONFIG.tritanopianGallery) {
			tritanopianGalleryBuilder.addToNether(0.05F, 0.025F, 0.0F, 0.0F, 0.05F);
		}
		if(CONFIG.achromatopsianGallery) {
			achromatopsianGalleryBuilder.addToNether(0.1F, 0.05F, 0.0F, 0.0F, 0.025F);
		}
		if(CONFIG.protanopianGallery) {
			protanopianGalleryBuilder.addToNether(0.025F, 0.1F, 0.0F, 0.0F, 0.05F);
		}
		PUMPKIN_PASTURES = register(pumpkinPasturesBuilder);
		PINK_CHERRY_OAK_FOREST = register(pinkCherryOakForestBuilder);
		WHITE_CHERRY_OAK_FOREST = register(whiteCherryOakForestBuilder);
		TALL_CRIMSON_FOREST = register(tallCrimsonForestBuilder);
		TALL_WARPED_FOREST = register(tallWarpedForestBuilder);
		TRITANOPIAN_GALLERY = register(tritanopianGalleryBuilder);
		ACHROMATOPSIAN_GALLERY = register(achromatopsianGalleryBuilder);
		PROTANOPIAN_GALLERY = register(protanopianGalleryBuilder);
		DARK_AMARANTH_FOREST = register(darkAmaranthForestBuilder);
		TALL_DARK_AMARANTH_FOREST = register(tallDarkAmaranthForestBuilder);
	}
}
