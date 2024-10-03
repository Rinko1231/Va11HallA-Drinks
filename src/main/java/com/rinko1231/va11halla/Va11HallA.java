package com.rinko1231.va11halla;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("va11halla")
public class Va11HallA
{
    public static final String MODID = "va11halla";


    public Va11HallA()
    {
        final var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Va11HallARegistry.ITEMS_VANILLA.register(eventBus);
        TabInit.TABS.register(eventBus);
    }
}