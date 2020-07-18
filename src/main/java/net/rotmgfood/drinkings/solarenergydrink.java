package net.rotmgfood.drinkings;

import java.util.List;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.rotmgfood.fooder;

public class solarenergydrink extends Item {
   public static final FoodComponent FOOD_COMPONENT = (new FoodComponent.Builder()).hunger(14).saturationModifier(2.4F)
         .build();

   public solarenergydrink(Item.Settings settings) {
      super(new Item.Settings().food(FOOD_COMPONENT).group(fooder.ROTMG_GROUP).maxCount(1));
   }

   @Override
   public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
      tooltip.add(new TranslatableText("item.rotmgfood.solarenergydrink.tooltip"));
   }

   @Override
   public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
      super.finishUsing(stack, world, user);
      if (user instanceof ServerPlayerEntity) {
         ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity) user;
         Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
         serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
      }

      if (stack.isEmpty()) {
         return stack;
      } else {
         if (user instanceof PlayerEntity && !((PlayerEntity) user).abilities.creativeMode) {
            ItemStack itemStack = stack;
            PlayerEntity playerEntity = (PlayerEntity) user;
            if (!playerEntity.inventory.insertStack(itemStack)) {
               playerEntity.dropItem(itemStack, false);
            }
         }

         return stack;
      }
   }

   @Override
   public int getMaxUseTime(ItemStack stack) {
      return 40;
   }

   @Override
   public UseAction getUseAction(ItemStack stack) {
      return UseAction.DRINK;
   }

   @Override
   public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
      return ItemUsage.consumeHeldItem(world, user, hand);
   }
}
