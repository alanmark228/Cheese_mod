package org.sdawdsd.cheese_mod.items.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Hammer_item extends Item{
    public Hammer_item(Properties prop) {
        super(prop);
    }

    @Override
    public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> tooltip_components , TooltipFlag p_41424_) {
        tooltip_components.add(Component.translatable("item.cheees_mod.hammer.tooltip"));
        super.appendHoverText(p_41421_, p_41422_, tooltip_components, p_41424_);
    }

    @Override
    public InteractionResult useOn(UseOnContext ucon) {
        return InteractionResult.SUCCESS;
    }
}
