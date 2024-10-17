/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.addie.aitplus.item.YellowJellyBabiesItem;
import net.addie.aitplus.item.TheMightyJellyBabiesItem;
import net.addie.aitplus.item.TakeMeToTrenzalorItem;
import net.addie.aitplus.item.TakeMeToSkaroItem;
import net.addie.aitplus.item.TakeMeToGallifreyItem;
import net.addie.aitplus.item.StainedRoundelBlueprintItem;
import net.addie.aitplus.item.RetroRoundelBlueprintItem;
import net.addie.aitplus.item.RedJellyBabiesItem;
import net.addie.aitplus.item.RawDalekaniumItem;
import net.addie.aitplus.item.QuartzRoundelBlueprintItem;
import net.addie.aitplus.item.PurpleJellyBabiesItem;
import net.addie.aitplus.item.PinkJellyBabiesItem;
import net.addie.aitplus.item.OrangeJellyBabiesItem;
import net.addie.aitplus.item.MagentaJellyBabiesItem;
import net.addie.aitplus.item.LimejellyBabiesItem;
import net.addie.aitplus.item.LightBlueJellyBabiesItem;
import net.addie.aitplus.item.LedBlueprintItem;
import net.addie.aitplus.item.JammieDodgersItem;
import net.addie.aitplus.item.IceBlueRoundelBlueprintItem;
import net.addie.aitplus.item.GreenJellyBabiesItem;
import net.addie.aitplus.item.FishFingersItem;
import net.addie.aitplus.item.FishFingersAndCustardItem;
import net.addie.aitplus.item.DalekaniumSwordItem;
import net.addie.aitplus.item.DalekaniumShovelItem;
import net.addie.aitplus.item.DalekaniumPickaxeItem;
import net.addie.aitplus.item.DalekaniumNuggetItem;
import net.addie.aitplus.item.DalekaniumIngotItem;
import net.addie.aitplus.item.DalekaniumHoeItem;
import net.addie.aitplus.item.DalekaniumAxeItem;
import net.addie.aitplus.item.DalekaniumArmorItem;
import net.addie.aitplus.item.CyanJellyBabiesItem;
import net.addie.aitplus.item.CustardItem;
import net.addie.aitplus.item.CreativeTabItemItem;
import net.addie.aitplus.item.BrachackiBlueprintItem;
import net.addie.aitplus.item.BowlRoundelBlueprintItem;
import net.addie.aitplus.item.BlueprintItem;
import net.addie.aitplus.item.BlueJellyBabiesItem;
import net.addie.aitplus.item.BlackJellyBabiesItem;
import net.addie.aitplus.AitplusMod;

public class AitplusModItems {
	public static Item TRENZALORIAN_STONE;
	public static Item TRENZALORIAN_STONE_STAIRS;
	public static Item TRENZALORIAN_STONE_SLAB;
	public static Item TRENZALORIAN_STONE_WALL;
	public static Item THALMA_LOG;
	public static Item THALMA_WOOD;
	public static Item STRIPPED_THALMA_LOG;
	public static Item STRIPPED_THALMA_WOOD;
	public static Item THALMA_PLANKS;
	public static Item THALMA_STAIRS;
	public static Item THALMA_SLAB;
	public static Item THALMA_FENCE;
	public static Item THALMA_FENCE_GATE;
	public static Item THALMA_DOOR;
	public static Item THALMA_TRAPDOOR;
	public static Item THALMA_BUTTON;
	public static Item THALMA_PRESSURE_PLATE;
	public static Item THALMA_LEAVES;
	public static Item MALDOR_LOG;
	public static Item MALDOR_WOOD;
	public static Item STRIPPED_MALDOR_LOG;
	public static Item STRIPPED_MALDOR_WOOD;
	public static Item MALDOR_PLANKS;
	public static Item MALDOR_STAIRS;
	public static Item MALDOR_SLAB;
	public static Item MALDOR_TRAP_DOOR;
	public static Item MALDOR_DOOR;
	public static Item MALDOR_PRESSURE_PLATE;
	public static Item MALDOR_BUTTON;
	public static Item MALDOR_FENCE;
	public static Item MALDOR_FENCE_GATE;
	public static Item MALDOR_LEAVES;
	public static Item METAL_GRATE;
	public static Item METAL_GRATE_STAIRS;
	public static Item METAL_GRATE_SLAB;
	public static Item METAL_GRATE_WALL;
	public static Item DALEKANIUM_ORE;
	public static Item BLOCK_OF_DALEKANIUM;
	public static Item BLOCK_OF_RAW_DALEKANIUM;
	public static Item DALEKANIUM_INGOT;
	public static Item DALEKANIUM_NUGGET;
	public static Item RAW_DALEKANIUM;
	public static Item DALEKANIUM_SWORD;
	public static Item DALEKANIUM_PICKAXE;
	public static Item DALEKANIUM_AXE;
	public static Item DALEKANIUM_SHOVEL;
	public static Item DALEKANIUM_HOE;
	public static Item DALEKANIUM_ARMOR_HELMET;
	public static Item DALEKANIUM_ARMOR_CHESTPLATE;
	public static Item DALEKANIUM_ARMOR_LEGGINGS;
	public static Item DALEKANIUM_ARMOR_BOOTS;
	public static Item LED_ROUNDEL;
	public static Item ICE_BLUE_A;
	public static Item ICE_BLUE_B;
	public static Item BLOW_UP_A;
	public static Item BLOW_UP_B;
	public static Item BLOW_UP_C;
	public static Item BLOCK_OF_BRACHACKI;
	public static Item BRACHACKI_A;
	public static Item BRACHACKI_B;
	public static Item BRACHACKI_DOOR;
	public static Item RETRO_A;
	public static Item RETRO_B;
	public static Item RETRO_DOOR;
	public static Item QUARTZ_A;
	public static Item QUARTZ_B;
	public static Item QUARTZ_DOOR;
	public static Item STRIPPED_DARK_OAK_LOG_STAINED_ROUNDEL;
	public static Item STRIPPED_JUNGLE_LOG_STAINED_ROUNDEL;
	public static Item STRIPPED_SPRUCE_LOG_STAINED_ROUNDEL;
	public static Item STRIPPED_OAK_LOG_STAINED_ROUNDEL;
	public static Item STRIPPED_MANGROVE_LOG_STAINED_ROUNDEL;
	public static Item STRIPPED_WARPED_STEM_STAINED_ROUNDEL;
	public static Item STRIPPED_ACACIA_LOG_STAINED_ROUNDEL;
	public static Item STRIPPED_BAMBOO_BLOCK_STAINED_ROUNDEL;
	public static Item STRIPPED_CHERRY_LOG_STAINED_ROUNDEL;
	public static Item STRIPPED_BIRCH_LOG_STAINED_ROUNDEL;
	public static Item STRIPPED_CRIMSON_STEM_STAINED_ROUNDEL;
	public static Item STONE_BRICKS_STAINED_ROUNDEL;
	public static Item POLISHED_BLACKSTONE_STAINED_ROUNDEL;
	public static Item QUARTZ_BLOCK_STAINED_ROUNDEL;
	public static Item BOWL_A;
	public static Item BOWL_B;
	public static Item STONE_DOOR;
	public static Item ARKYTIOR;
	public static Item FLOWER_OF_REMEBERANCE;
	public static Item IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA;
	public static Item MOONLIGHT_BLOOM;
	public static Item RED_PETALED_ORCHID;
	public static Item SCHLENK_BLOSSOMS;
	public static Item YELLOW_JELLY_BABIES;
	public static Item RED_JELLY_BABIES;
	public static Item PURPLE_JELLY_BABIES;
	public static Item PINK_JELLY_BABIES;
	public static Item ORANGE_JELLY_BABIES;
	public static Item MAGENTA_JELLY_BABIES;
	public static Item LIMEJELLY_BABIES;
	public static Item LIGHT_BLUE_JELLY_BABIES;
	public static Item GREEN_JELLY_BABIES;
	public static Item CYAN_JELLY_BABIES;
	public static Item BLUE_JELLY_BABIES;
	public static Item BLACK_JELLY_BABIES;
	public static Item THE_MIGHTY_JELLY_BABIES;
	public static Item FISH_FINGERS;
	public static Item CUSTARD;
	public static Item FISH_FINGERS_AND_CUSTARD;
	public static Item JAMMIE_DODGERS;
	public static Item BLUEPRINT;
	public static Item LED_BLUEPRINT;
	public static Item STAINED_ROUNDEL_BLUEPRINT;
	public static Item QUARTZ_ROUNDEL_BLUEPRINT;
	public static Item BRACHACKI_BLUEPRINT;
	public static Item RETRO_ROUNDEL_BLUEPRINT;
	public static Item BOWL_ROUNDEL_BLUEPRINT;
	public static Item ICE_BLUE_ROUNDEL_BLUEPRINT;
	public static Item HAT_STAND;
	public static Item HAT_STAND_WHITE;
	public static Item STATUE_1;
	public static Item GRAMOPHONE;
	public static Item CANDLE_STAND;
	public static Item JUKEBOX_TOP;
	public static Item TOYOTA_BOOKSHELF;
	public static Item SEAL_OF_RASSILON;
	public static Item STREET_LAMP;
	public static Item VICTORIAN_CHAIR_SPAWN_EGG;
	public static Item OFFICE_CHAIR_SPAWN_EGG;
	public static Item FLUTTERWING_SPAWN_EGG;
	public static Item FLY_SPAWN_EGG;
	public static Item FLUBBLE_SPAWN_EGG;
	public static Item CLASSIC_DALEK_SPAWN_EGG;
	public static Item TIME_WAR_DALEK_SPAWN_EGG;
	public static Item IMPERIAL_DALEK_SPAWN_EGG;
	public static Item RENEGADE_DALEK_SPAWN_EGG;
	public static Item DAVAROS_SPAWN_EGG;
	public static Item TAKE_ME_TO_GALLIFREY;
	public static Item TAKE_ME_TO_TRENZALOR;
	public static Item TAKE_ME_TO_SKARO;
	public static Item CREATIVE_TAB_ITEM;
	public static Item LED_ROUNDEL_BLACK;
	public static Item LED_ROUNDEL_BLUE;
	public static Item LED_ROUNDEL_CYAN;
	public static Item LED_ROUNDEL_GRAY;
	public static Item LED_ROUNDEL_GREEN;
	public static Item LED_ROUNDEL_ORANGE;
	public static Item LED_ROUNDEL_PINK;
	public static Item LED_ROUNDEL_PURPLE;
	public static Item LED_ROUNDEL_RED;
	public static Item LED_ROUNDEL_YELLOW;
	public static Item ROUNDEL_TABLE;
	public static Item CANDEL_STAND_LIT;

	public static void load() {
		TRENZALORIAN_STONE = register("trenzalorian_stone", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE));
		TRENZALORIAN_STONE_STAIRS = register("trenzalorian_stone_stairs", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_STAIRS));
		TRENZALORIAN_STONE_SLAB = register("trenzalorian_stone_slab", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_SLAB));
		TRENZALORIAN_STONE_WALL = register("trenzalorian_stone_wall", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_WALL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_WALL));
		THALMA_LOG = register("thalma_log", new BlockItem(AitplusModBlocks.THALMA_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_LOG));
		THALMA_WOOD = register("thalma_wood", new BlockItem(AitplusModBlocks.THALMA_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_WOOD));
		STRIPPED_THALMA_LOG = register("stripped_thalma_log", new BlockItem(AitplusModBlocks.STRIPPED_THALMA_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_THALMA_LOG));
		STRIPPED_THALMA_WOOD = register("stripped_thalma_wood", new BlockItem(AitplusModBlocks.STRIPPED_THALMA_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_THALMA_WOOD));
		THALMA_PLANKS = register("thalma_planks", new BlockItem(AitplusModBlocks.THALMA_PLANKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_PLANKS));
		THALMA_STAIRS = register("thalma_stairs", new BlockItem(AitplusModBlocks.THALMA_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_STAIRS));
		THALMA_SLAB = register("thalma_slab", new BlockItem(AitplusModBlocks.THALMA_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_SLAB));
		THALMA_FENCE = register("thalma_fence", new BlockItem(AitplusModBlocks.THALMA_FENCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_FENCE));
		THALMA_FENCE_GATE = register("thalma_fence_gate", new BlockItem(AitplusModBlocks.THALMA_FENCE_GATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_FENCE_GATE));
		THALMA_DOOR = register("thalma_door", new BlockItem(AitplusModBlocks.THALMA_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_DOOR));
		THALMA_TRAPDOOR = register("thalma_trapdoor", new BlockItem(AitplusModBlocks.THALMA_TRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_TRAPDOOR));
		THALMA_BUTTON = register("thalma_button", new BlockItem(AitplusModBlocks.THALMA_BUTTON, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_BUTTON));
		THALMA_PRESSURE_PLATE = register("thalma_pressure_plate", new BlockItem(AitplusModBlocks.THALMA_PRESSURE_PLATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_PRESSURE_PLATE));
		THALMA_LEAVES = register("thalma_leaves", new BlockItem(AitplusModBlocks.THALMA_LEAVES, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_LEAVES));
		MALDOR_LOG = register("maldor_log", new BlockItem(AitplusModBlocks.MALDOR_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_LOG));
		MALDOR_WOOD = register("maldor_wood", new BlockItem(AitplusModBlocks.MALDOR_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_WOOD));
		STRIPPED_MALDOR_LOG = register("stripped_maldor_log", new BlockItem(AitplusModBlocks.STRIPPED_MALDOR_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_MALDOR_LOG));
		STRIPPED_MALDOR_WOOD = register("stripped_maldor_wood", new BlockItem(AitplusModBlocks.STRIPPED_MALDOR_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_MALDOR_WOOD));
		MALDOR_PLANKS = register("maldor_planks", new BlockItem(AitplusModBlocks.MALDOR_PLANKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_PLANKS));
		MALDOR_STAIRS = register("maldor_stairs", new BlockItem(AitplusModBlocks.MALDOR_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_STAIRS));
		MALDOR_SLAB = register("maldor_slab", new BlockItem(AitplusModBlocks.MALDOR_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_SLAB));
		MALDOR_TRAP_DOOR = register("maldor_trap_door", new BlockItem(AitplusModBlocks.MALDOR_TRAP_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_TRAP_DOOR));
		MALDOR_DOOR = register("maldor_door", new BlockItem(AitplusModBlocks.MALDOR_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_DOOR));
		MALDOR_PRESSURE_PLATE = register("maldor_pressure_plate", new BlockItem(AitplusModBlocks.MALDOR_PRESSURE_PLATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_PRESSURE_PLATE));
		MALDOR_BUTTON = register("maldor_button", new BlockItem(AitplusModBlocks.MALDOR_BUTTON, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_BUTTON));
		MALDOR_FENCE = register("maldor_fence", new BlockItem(AitplusModBlocks.MALDOR_FENCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_FENCE));
		MALDOR_FENCE_GATE = register("maldor_fence_gate", new BlockItem(AitplusModBlocks.MALDOR_FENCE_GATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_FENCE_GATE));
		MALDOR_LEAVES = register("maldor_leaves", new BlockItem(AitplusModBlocks.MALDOR_LEAVES, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MALDOR_LEAVES));
		METAL_GRATE = register("metal_grate", new BlockItem(AitplusModBlocks.METAL_GRATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(METAL_GRATE));
		METAL_GRATE_STAIRS = register("metal_grate_stairs", new BlockItem(AitplusModBlocks.METAL_GRATE_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(METAL_GRATE_STAIRS));
		METAL_GRATE_SLAB = register("metal_grate_slab", new BlockItem(AitplusModBlocks.METAL_GRATE_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(METAL_GRATE_SLAB));
		METAL_GRATE_WALL = register("metal_grate_wall", new BlockItem(AitplusModBlocks.METAL_GRATE_WALL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(METAL_GRATE_WALL));
		DALEKANIUM_ORE = register("dalekanium_ore", new BlockItem(AitplusModBlocks.DALEKANIUM_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(DALEKANIUM_ORE));
		BLOCK_OF_DALEKANIUM = register("block_of_dalekanium", new BlockItem(AitplusModBlocks.BLOCK_OF_DALEKANIUM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BLOCK_OF_DALEKANIUM));
		BLOCK_OF_RAW_DALEKANIUM = register("block_of_raw_dalekanium", new BlockItem(AitplusModBlocks.BLOCK_OF_RAW_DALEKANIUM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BLOCK_OF_RAW_DALEKANIUM));
		DALEKANIUM_INGOT = register("dalekanium_ingot", new DalekaniumIngotItem());
		DALEKANIUM_NUGGET = register("dalekanium_nugget", new DalekaniumNuggetItem());
		RAW_DALEKANIUM = register("raw_dalekanium", new RawDalekaniumItem());
		DALEKANIUM_SWORD = register("dalekanium_sword", new DalekaniumSwordItem());
		DALEKANIUM_PICKAXE = register("dalekanium_pickaxe", new DalekaniumPickaxeItem());
		DALEKANIUM_AXE = register("dalekanium_axe", new DalekaniumAxeItem());
		DALEKANIUM_SHOVEL = register("dalekanium_shovel", new DalekaniumShovelItem());
		DALEKANIUM_HOE = register("dalekanium_hoe", new DalekaniumHoeItem());
		DALEKANIUM_ARMOR_HELMET = register("dalekanium_armor_helmet", new DalekaniumArmorItem.Helmet());
		DALEKANIUM_ARMOR_CHESTPLATE = register("dalekanium_armor_chestplate", new DalekaniumArmorItem.Chestplate());
		DALEKANIUM_ARMOR_LEGGINGS = register("dalekanium_armor_leggings", new DalekaniumArmorItem.Leggings());
		DALEKANIUM_ARMOR_BOOTS = register("dalekanium_armor_boots", new DalekaniumArmorItem.Boots());
		LED_ROUNDEL = register("led_roundel", new BlockItem(AitplusModBlocks.LED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(LED_ROUNDEL));
		ICE_BLUE_A = register("ice_blue_a", new BlockItem(AitplusModBlocks.ICE_BLUE_A, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(ICE_BLUE_A));
		ICE_BLUE_B = register("ice_blue_b", new BlockItem(AitplusModBlocks.ICE_BLUE_B, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(ICE_BLUE_B));
		BLOW_UP_A = register("blow_up_a", new BlockItem(AitplusModBlocks.BLOW_UP_A, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BLOW_UP_A));
		BLOW_UP_B = register("blow_up_b", new BlockItem(AitplusModBlocks.BLOW_UP_B, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BLOW_UP_B));
		BLOW_UP_C = register("blow_up_c", new BlockItem(AitplusModBlocks.BLOW_UP_C, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BLOW_UP_C));
		BLOCK_OF_BRACHACKI = register("block_of_brachacki", new BlockItem(AitplusModBlocks.BLOCK_OF_BRACHACKI, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BLOCK_OF_BRACHACKI));
		BRACHACKI_A = register("brachacki_a", new BlockItem(AitplusModBlocks.BRACHACKI_A, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BRACHACKI_A));
		BRACHACKI_B = register("brachacki_b", new BlockItem(AitplusModBlocks.BRACHACKI_B, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BRACHACKI_B));
		BRACHACKI_DOOR = register("brachacki_door", new BlockItem(AitplusModBlocks.BRACHACKI_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BRACHACKI_DOOR));
		RETRO_A = register("retro_a", new BlockItem(AitplusModBlocks.RETRO_A, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(RETRO_A));
		RETRO_B = register("retro_b", new BlockItem(AitplusModBlocks.RETRO_B, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(RETRO_B));
		RETRO_DOOR = register("retro_door", new BlockItem(AitplusModBlocks.RETRO_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(RETRO_DOOR));
		QUARTZ_A = register("quartz_a", new BlockItem(AitplusModBlocks.QUARTZ_A, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(QUARTZ_A));
		QUARTZ_B = register("quartz_b", new BlockItem(AitplusModBlocks.QUARTZ_B, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(QUARTZ_B));
		QUARTZ_DOOR = register("quartz_door", new BlockItem(AitplusModBlocks.QUARTZ_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(QUARTZ_DOOR));
		STRIPPED_DARK_OAK_LOG_STAINED_ROUNDEL = register("stripped_dark_oak_log_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_DARK_OAK_LOG_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_DARK_OAK_LOG_STAINED_ROUNDEL));
		STRIPPED_JUNGLE_LOG_STAINED_ROUNDEL = register("stripped_jungle_log_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_JUNGLE_LOG_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_JUNGLE_LOG_STAINED_ROUNDEL));
		STRIPPED_SPRUCE_LOG_STAINED_ROUNDEL = register("stripped_spruce_log_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_SPRUCE_LOG_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_SPRUCE_LOG_STAINED_ROUNDEL));
		STRIPPED_OAK_LOG_STAINED_ROUNDEL = register("stripped_oak_log_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_OAK_LOG_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_OAK_LOG_STAINED_ROUNDEL));
		STRIPPED_MANGROVE_LOG_STAINED_ROUNDEL = register("stripped_mangrove_log_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_MANGROVE_LOG_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_MANGROVE_LOG_STAINED_ROUNDEL));
		STRIPPED_WARPED_STEM_STAINED_ROUNDEL = register("stripped_warped_stem_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_WARPED_STEM_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_WARPED_STEM_STAINED_ROUNDEL));
		STRIPPED_ACACIA_LOG_STAINED_ROUNDEL = register("stripped_acacia_log_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_ACACIA_LOG_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_ACACIA_LOG_STAINED_ROUNDEL));
		STRIPPED_BAMBOO_BLOCK_STAINED_ROUNDEL = register("stripped_bamboo_block_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_BAMBOO_BLOCK_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_BAMBOO_BLOCK_STAINED_ROUNDEL));
		STRIPPED_CHERRY_LOG_STAINED_ROUNDEL = register("stripped_cherry_log_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_CHERRY_LOG_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_CHERRY_LOG_STAINED_ROUNDEL));
		STRIPPED_BIRCH_LOG_STAINED_ROUNDEL = register("stripped_birch_log_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_BIRCH_LOG_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_BIRCH_LOG_STAINED_ROUNDEL));
		STRIPPED_CRIMSON_STEM_STAINED_ROUNDEL = register("stripped_crimson_stem_stained_roundel", new BlockItem(AitplusModBlocks.STRIPPED_CRIMSON_STEM_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_CRIMSON_STEM_STAINED_ROUNDEL));
		STONE_BRICKS_STAINED_ROUNDEL = register("stone_bricks_stained_roundel", new BlockItem(AitplusModBlocks.STONE_BRICKS_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STONE_BRICKS_STAINED_ROUNDEL));
		POLISHED_BLACKSTONE_STAINED_ROUNDEL = register("polished_blackstone_stained_roundel", new BlockItem(AitplusModBlocks.POLISHED_BLACKSTONE_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(POLISHED_BLACKSTONE_STAINED_ROUNDEL));
		QUARTZ_BLOCK_STAINED_ROUNDEL = register("quartz_block_stained_roundel", new BlockItem(AitplusModBlocks.QUARTZ_BLOCK_STAINED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(QUARTZ_BLOCK_STAINED_ROUNDEL));
		BOWL_A = register("bowl_a", new BlockItem(AitplusModBlocks.BOWL_A, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BOWL_A));
		BOWL_B = register("bowl_b", new BlockItem(AitplusModBlocks.BOWL_B, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BOWL_B));
		STONE_DOOR = register("stone_door", new BlockItem(AitplusModBlocks.STONE_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STONE_DOOR));
		ARKYTIOR = register("arkytior", new BlockItem(AitplusModBlocks.ARKYTIOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(ARKYTIOR));
		FLOWER_OF_REMEBERANCE = register("flower_of_remeberance", new BlockItem(AitplusModBlocks.FLOWER_OF_REMEBERANCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLOWER_OF_REMEBERANCE));
		IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA = register("iridescent_velvet_red_madevinia_aridosa", new BlockItem(AitplusModBlocks.IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA));
		MOONLIGHT_BLOOM = register("moonlight_bloom", new BlockItem(AitplusModBlocks.MOONLIGHT_BLOOM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MOONLIGHT_BLOOM));
		RED_PETALED_ORCHID = register("red_petaled_orchid", new BlockItem(AitplusModBlocks.RED_PETALED_ORCHID, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(RED_PETALED_ORCHID));
		SCHLENK_BLOSSOMS = register("schlenk_blossoms", new BlockItem(AitplusModBlocks.SCHLENK_BLOSSOMS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(SCHLENK_BLOSSOMS));
		YELLOW_JELLY_BABIES = register("yellow_jelly_babies", new YellowJellyBabiesItem());
		RED_JELLY_BABIES = register("red_jelly_babies", new RedJellyBabiesItem());
		PURPLE_JELLY_BABIES = register("purple_jelly_babies", new PurpleJellyBabiesItem());
		PINK_JELLY_BABIES = register("pink_jelly_babies", new PinkJellyBabiesItem());
		ORANGE_JELLY_BABIES = register("orange_jelly_babies", new OrangeJellyBabiesItem());
		MAGENTA_JELLY_BABIES = register("magenta_jelly_babies", new MagentaJellyBabiesItem());
		LIMEJELLY_BABIES = register("limejelly_babies", new LimejellyBabiesItem());
		LIGHT_BLUE_JELLY_BABIES = register("light_blue_jelly_babies", new LightBlueJellyBabiesItem());
		GREEN_JELLY_BABIES = register("green_jelly_babies", new GreenJellyBabiesItem());
		CYAN_JELLY_BABIES = register("cyan_jelly_babies", new CyanJellyBabiesItem());
		BLUE_JELLY_BABIES = register("blue_jelly_babies", new BlueJellyBabiesItem());
		BLACK_JELLY_BABIES = register("black_jelly_babies", new BlackJellyBabiesItem());
		THE_MIGHTY_JELLY_BABIES = register("the_mighty_jelly_babies", new TheMightyJellyBabiesItem());
		FISH_FINGERS = register("fish_fingers", new FishFingersItem());
		CUSTARD = register("custard", new CustardItem());
		FISH_FINGERS_AND_CUSTARD = register("fish_fingers_and_custard", new FishFingersAndCustardItem());
		JAMMIE_DODGERS = register("jammie_dodgers", new JammieDodgersItem());
		BLUEPRINT = register("blueprint", new BlueprintItem());
		LED_BLUEPRINT = register("led_blueprint", new LedBlueprintItem());
		STAINED_ROUNDEL_BLUEPRINT = register("stained_roundel_blueprint", new StainedRoundelBlueprintItem());
		QUARTZ_ROUNDEL_BLUEPRINT = register("quartz_roundel_blueprint", new QuartzRoundelBlueprintItem());
		BRACHACKI_BLUEPRINT = register("brachacki_blueprint", new BrachackiBlueprintItem());
		RETRO_ROUNDEL_BLUEPRINT = register("retro_roundel_blueprint", new RetroRoundelBlueprintItem());
		BOWL_ROUNDEL_BLUEPRINT = register("bowl_roundel_blueprint", new BowlRoundelBlueprintItem());
		ICE_BLUE_ROUNDEL_BLUEPRINT = register("ice_blue_roundel_blueprint", new IceBlueRoundelBlueprintItem());
		HAT_STAND = register("hat_stand", new BlockItem(AitplusModBlocks.HAT_STAND, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(HAT_STAND));
		HAT_STAND_WHITE = register("hat_stand_white", new BlockItem(AitplusModBlocks.HAT_STAND_WHITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(HAT_STAND_WHITE));
		STATUE_1 = register("statue_1", new BlockItem(AitplusModBlocks.STATUE_1, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STATUE_1));
		GRAMOPHONE = register("gramophone", new BlockItem(AitplusModBlocks.GRAMOPHONE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(GRAMOPHONE));
		CANDLE_STAND = register("candle_stand", new BlockItem(AitplusModBlocks.CANDLE_STAND, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CANDLE_STAND));
		JUKEBOX_TOP = register("jukebox_top", new BlockItem(AitplusModBlocks.JUKEBOX_TOP, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(JUKEBOX_TOP));
		TOYOTA_BOOKSHELF = register("toyota_bookshelf", new BlockItem(AitplusModBlocks.TOYOTA_BOOKSHELF, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TOYOTA_BOOKSHELF));
		SEAL_OF_RASSILON = register("seal_of_rassilon", new BlockItem(AitplusModBlocks.SEAL_OF_RASSILON, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(SEAL_OF_RASSILON));
		STREET_LAMP = register("street_lamp", new BlockItem(AitplusModBlocks.STREET_LAMP, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STREET_LAMP));
		VICTORIAN_CHAIR_SPAWN_EGG = register("victorian_chair_spawn_egg", new SpawnEggItem(AitplusModEntities.VICTORIAN_CHAIR, -1, -1, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(VICTORIAN_CHAIR_SPAWN_EGG));
		OFFICE_CHAIR_SPAWN_EGG = register("office_chair_spawn_egg", new SpawnEggItem(AitplusModEntities.OFFICE_CHAIR, -1, -1, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(OFFICE_CHAIR_SPAWN_EGG));
		FLUTTERWING_SPAWN_EGG = register("flutterwing_spawn_egg", new SpawnEggItem(AitplusModEntities.FLUTTERWING, -16764007, -15987700, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLUTTERWING_SPAWN_EGG));
		FLY_SPAWN_EGG = register("fly_spawn_egg", new SpawnEggItem(AitplusModEntities.FLY, -16448251, -9435899, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLY_SPAWN_EGG));
		FLUBBLE_SPAWN_EGG = register("flubble_spawn_egg", new SpawnEggItem(AitplusModEntities.FLUBBLE, -9268588, -7876402, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLUBBLE_SPAWN_EGG));
		CLASSIC_DALEK_SPAWN_EGG = register("classic_dalek_spawn_egg", new SpawnEggItem(AitplusModEntities.CLASSIC_DALEK, -3355444, -16737844, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CLASSIC_DALEK_SPAWN_EGG));
		TIME_WAR_DALEK_SPAWN_EGG = register("time_war_dalek_spawn_egg", new SpawnEggItem(AitplusModEntities.TIME_WAR_DALEK, -6982581, -2640283, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TIME_WAR_DALEK_SPAWN_EGG));
		IMPERIAL_DALEK_SPAWN_EGG = register("imperial_dalek_spawn_egg", new SpawnEggItem(AitplusModEntities.IMPERIAL_DALEK, -855310, -1527235, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(IMPERIAL_DALEK_SPAWN_EGG));
		RENEGADE_DALEK_SPAWN_EGG = register("renegade_dalek_spawn_egg", new SpawnEggItem(AitplusModEntities.RENEGADE_DALEK, -13421773, -16250872, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(RENEGADE_DALEK_SPAWN_EGG));
		DAVAROS_SPAWN_EGG = register("davaros_spawn_egg", new SpawnEggItem(AitplusModEntities.DAVAROS, -16053493, -14671840, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(DAVAROS_SPAWN_EGG));
		TAKE_ME_TO_GALLIFREY = register("take_me_to_gallifrey", new TakeMeToGallifreyItem());
		TAKE_ME_TO_TRENZALOR = register("take_me_to_trenzalor", new TakeMeToTrenzalorItem());
		TAKE_ME_TO_SKARO = register("take_me_to_skaro", new TakeMeToSkaroItem());
		CREATIVE_TAB_ITEM = register("creative_tab_item", new CreativeTabItemItem());
		LED_ROUNDEL_BLACK = register("led_roundel_black", new BlockItem(AitplusModBlocks.LED_ROUNDEL_BLACK, new Item.Properties()));
		LED_ROUNDEL_BLUE = register("led_roundel_blue", new BlockItem(AitplusModBlocks.LED_ROUNDEL_BLUE, new Item.Properties()));
		LED_ROUNDEL_CYAN = register("led_roundel_cyan", new BlockItem(AitplusModBlocks.LED_ROUNDEL_CYAN, new Item.Properties()));
		LED_ROUNDEL_GRAY = register("led_roundel_gray", new BlockItem(AitplusModBlocks.LED_ROUNDEL_GRAY, new Item.Properties()));
		LED_ROUNDEL_GREEN = register("led_roundel_green", new BlockItem(AitplusModBlocks.LED_ROUNDEL_GREEN, new Item.Properties()));
		LED_ROUNDEL_ORANGE = register("led_roundel_orange", new BlockItem(AitplusModBlocks.LED_ROUNDEL_ORANGE, new Item.Properties()));
		LED_ROUNDEL_PINK = register("led_roundel_pink", new BlockItem(AitplusModBlocks.LED_ROUNDEL_PINK, new Item.Properties()));
		LED_ROUNDEL_PURPLE = register("led_roundel_purple", new BlockItem(AitplusModBlocks.LED_ROUNDEL_PURPLE, new Item.Properties()));
		LED_ROUNDEL_RED = register("led_roundel_red", new BlockItem(AitplusModBlocks.LED_ROUNDEL_RED, new Item.Properties()));
		LED_ROUNDEL_YELLOW = register("led_roundel_yellow", new BlockItem(AitplusModBlocks.LED_ROUNDEL_YELLOW, new Item.Properties()));
		ROUNDEL_TABLE = register("roundel_table", new BlockItem(AitplusModBlocks.ROUNDEL_TABLE, new Item.Properties()));
		CANDEL_STAND_LIT = register("candel_stand_lit", new BlockItem(AitplusModBlocks.CANDEL_STAND_LIT, new Item.Properties()));
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(AitplusMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
