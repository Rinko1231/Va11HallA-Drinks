package com.rinko1231.va11halla;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Va11HallA.MODID);

    public static final RegistryObject<CreativeModeTab> VA11HALLA_TAB = TABS.register(Va11HallA.MODID, () -> CreativeModeTab.builder()
            // Set name of tab to display
            .title(Component.translatable("item_group." + Va11HallA.MODID))
            // Set icon of creative tab
            .icon(() -> new ItemStack(Va11HallARegistry.CYBERJUNK.get()))
            // Add default items to tab
            .displayItems((params, output) -> {
                Va11HallARegistry.ITEMS_VANILLA.getEntries().forEach(it -> output.accept(it.get()));
            })
            .build()
    );
}