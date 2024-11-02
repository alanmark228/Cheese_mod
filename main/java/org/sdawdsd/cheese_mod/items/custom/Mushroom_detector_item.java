package org.sdawdsd.cheese_mod.items.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import org.sdawdsd.cheese_mod.util.Cheese_mod_tags;

import java.util.List;


public class Mushroom_detector_item extends Item{

    public Mushroom_detector_item(Properties prop) {
        super(prop);
    }

    @Override
    public InteractionResult useOn(UseOnContext ucon) {
        if (!ucon.getLevel().isClientSide()){
            BlockPos clickPos=ucon.getClickedPos();
            Player player=ucon.getPlayer();
            boolean found = false;
            for (int x=-6;x<6;x++){
                for (int z=-6;z<6;z++){
                    BlockPos nPos= new BlockPos(clickPos.getX()+x,clickPos.getY()+1,clickPos.getZ()+z);
                    //player.sendSystemMessage(Component.literal(nPos.toString()));
                    BlockState state=ucon.getLevel().getBlockState(nPos);
                    if (isBlockMush(state)){
                        sendM(nPos,player);
                        found = true;
                    }
                }
            }
            if (!found){
                player.sendSystemMessage(Component.literal("There are not any mushrooms in area 15x15"));
            }
        }
        ucon.getItemInHand().hurtAndBreak(1,ucon.getPlayer(),
                player -> player.broadcastBreakEvent(player.getUsedItemHand()));
        return InteractionResult.SUCCESS;
    }

    public boolean isBlockMush(BlockState a){
        return a.is(Cheese_mod_tags.Blocks.MUSHROOM_DETECTOR_VALUES);
    }

    public void sendM(BlockPos pos,Player pl){
        pl.sendSystemMessage(Component.literal("Mushroom from you at X:"+(pl.getBlockX()-pos.getX())+"   Z:"+(pl.getBlockZ()-pos.getZ())));
    }

    @Override
    public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
        p_41423_.add(Component.literal("W.I.P ITEM"));
        super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);
    }
}
