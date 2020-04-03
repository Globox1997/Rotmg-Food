package net.rotmgfood.foodings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import net.rotmgfood.fooder;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.FoodComponent;

public class oryxcookie extends Item {
    public static final FoodComponent FOOD_COMPONENT = (new FoodComponent.Builder()).hunger(7).saturationModifier(1.8F)
            .meat().build();

    public oryxcookie() {
        super(new Item.Settings().food(FOOD_COMPONENT).group(fooder.ROTMG_GROUP));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.rotmgfood.oryxcookie.tooltip"));
    }
}