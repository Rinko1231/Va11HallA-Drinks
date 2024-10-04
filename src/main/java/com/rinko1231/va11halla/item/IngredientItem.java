package com.rinko1231.va11halla.item;

import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class IngredientItem extends Item {


    public IngredientItem(Item.Properties properties) {
        super(properties);
    }



    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level worldIn, @NotNull List<Component> tooltip, @NotNull TooltipFlag flagIn) {
        String OriginalId = this.getDescriptionId();
        String TooltipKey = "tooltip."+ OriginalId;
        switch (OriginalId) {
            case "item.va11halla.ndl" ->
                    tooltip.add(Component.translatable(ChatFormatting.WHITE + "" + I18n.get(TooltipKey)));
            case "item.va11halla.adelhyde" ->
                    tooltip.add(Component.translatable(ChatFormatting.RED + "" + I18n.get(TooltipKey)));
            case "item.va11halla.bronson" ->
                    tooltip.add(Component.translatable(ChatFormatting.YELLOW + "" + I18n.get(TooltipKey)));
            case "item.va11halla.delta" ->
                    tooltip.add(Component.translatable(ChatFormatting.BLUE + "" + I18n.get(TooltipKey)));
            case "item.va11halla.flanergide" ->
                    tooltip.add(Component.translatable(ChatFormatting.GREEN + "" + I18n.get(TooltipKey)));
            case "item.va11halla.karmotrine" ->
                    tooltip.add(Component.translatable(ChatFormatting.AQUA + "" + I18n.get(TooltipKey)));
        }
    }


}
