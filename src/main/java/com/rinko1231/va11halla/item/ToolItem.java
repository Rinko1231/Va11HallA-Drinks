package com.rinko1231.va11halla.item;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ToolItem extends Item {

    public ToolItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return itemStack.copy();
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }
}