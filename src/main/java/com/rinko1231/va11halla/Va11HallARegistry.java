package com.rinko1231.va11halla;


import com.rinko1231.va11halla.item.BlenderItem;
import com.rinko1231.va11halla.item.DrinkItem;
import com.rinko1231.va11halla.item.IngredientItem;
import com.rinko1231.va11halla.item.ToolItem;
import net.minecraft.world.item.Item;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Va11HallARegistry
{

    public static final DeferredRegister<Item> ITEMS_VANILLA = DeferredRegister.create(ForgeRegistries.ITEMS, Va11HallA.MODID);
    //Tool
    public static final RegistryObject<Item> SHAKE_POT = ITEMS_VANILLA.register("shake_pot", () -> new ToolItem(new ToolItem.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CYBER_BLENDER = ITEMS_VANILLA.register("cyber_blender", () -> new BlenderItem(new BlenderItem.Properties().stacksTo(1)));
    //Ingredients
    public static final RegistryObject<Item> NDL = ITEMS_VANILLA.register("ndl", () -> new IngredientItem(new IngredientItem.Properties()));
    public static final RegistryObject<Item> ADELHYDE = ITEMS_VANILLA.register("adelhyde", () -> new IngredientItem(new IngredientItem.Properties()));
    public static final RegistryObject<Item> BRONSON = ITEMS_VANILLA.register("bronson", () -> new IngredientItem(new IngredientItem.Properties()));
    public static final RegistryObject<Item> DELTA = ITEMS_VANILLA.register("delta", () -> new IngredientItem(new IngredientItem.Properties()));
    public static final RegistryObject<Item> FLANERGIDE = ITEMS_VANILLA.register("flanergide", () -> new IngredientItem(new IngredientItem.Properties()));
    public static final RegistryObject<Item> KARMOTRINE = ITEMS_VANILLA.register("karmotrine", () -> new IngredientItem(new IngredientItem.Properties()));
    public static final RegistryObject<Item> CRUSHED_ICE = ITEMS_VANILLA.register("crushed_ice", () -> new IngredientItem(new IngredientItem.Properties()));
    //Drinks
    public static final RegistryObject<Item> BAD_TOUCH = ITEMS_VANILLA.register("bad_touch", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> BLOOM_LIGHT = ITEMS_VANILLA.register("bloom_light", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> BLUE_FAIRY = ITEMS_VANILLA.register("blue_fairy", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> BRANDTINI = ITEMS_VANILLA.register("brandtini", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> CREVICE_SPIKE = ITEMS_VANILLA.register("crevice_spike", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> FLUFFY_DREAM = ITEMS_VANILLA.register("fluffy_dream", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> GRIZZLY_TEMPLE = ITEMS_VANILLA.register("grizzly_temple", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> GUT_PUNCH = ITEMS_VANILLA.register("gut_punch", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> MARS_BLAST = ITEMS_VANILLA.register("mars_blast", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> MERCURY_BLAST = ITEMS_VANILLA.register("mercury_blast", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> MOON_BLAST = ITEMS_VANILLA.register("moon_blast", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> PIANO_MAN = ITEMS_VANILLA.register("piano_man", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> PIANO_WOMAN = ITEMS_VANILLA.register("piano_woman", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> SPARKLE_STAR = ITEMS_VANILLA.register("sparkle_star", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> SUNSHINE_CLOUD = ITEMS_VANILLA.register("sunshine_cloud", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> SUPLEX = ITEMS_VANILLA.register("suplex", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    public static final RegistryObject<Item> ZEN_STAR = ITEMS_VANILLA.register("zen_star", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARD_DRINKS)));
    //Harder
    public static final RegistryObject<Item> ABSINTHE = ITEMS_VANILLA.register("absinthe", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARDER_DRINKS)));
    public static final RegistryObject<Item> BEER_207X = ITEMS_VANILLA.register("beer_207x", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARDER_DRINKS)));
    public static final RegistryObject<Item> COBALT_VELVET = ITEMS_VANILLA.register("cobalt_velvet", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARDER_DRINKS)));
    public static final RegistryObject<Item> FLAMING_MOAI = ITEMS_VANILLA.register("flaming_moai", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARDER_DRINKS)));
    public static final RegistryObject<Item> MULAN_TEA = ITEMS_VANILLA.register("mulan_tea", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARDER_DRINKS)));
    public static final RegistryObject<Item> PILE_DRIVER = ITEMS_VANILLA.register("pile_driver", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARDER_DRINKS)));

    //Hardest
    public static final RegistryObject<Item> A_FEDORA = ITEMS_VANILLA.register("a_fedora", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARDEST_DRINKS)));
    public static final RegistryObject<Item> CACIQUE = ITEMS_VANILLA.register("cacique", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARDEST_DRINKS)));
    public static final RegistryObject<Item> FRINGE_WAVER = ITEMS_VANILLA.register("fringe_waver", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.HARDEST_DRINKS)));

    //Soft
    public static final RegistryObject<Item> BLEEDING_JANE = ITEMS_VANILLA.register("bleeding_jane", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.SOFT_DRINKS)));
    public static final RegistryObject<Item> SUGAR_RUSH = ITEMS_VANILLA.register("sugar_rush", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.SOFT_DRINKS)));
    public static final RegistryObject<Item> FROTHY_WATER = ITEMS_VANILLA.register("frothy_water", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.SOFT_DRINKS)));

    public static final RegistryObject<Item> CYBERJUNK = ITEMS_VANILLA.register("cyberjunk", () -> new DrinkItem(new DrinkItem.Properties().food(VHFoodValues.JUNK)));


}