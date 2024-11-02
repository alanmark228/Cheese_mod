package org.sdawdsd.cheese_mod.blocks;

import com.google.common.util.concurrent.ClosingFuture;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.sdawdsd.cheese_mod.Cheese_mod;
import org.sdawdsd.cheese_mod.blocks.custom.Cheese_Mod_Vat_Block;
import org.sdawdsd.cheese_mod.items.Cheese_mod_items;

import java.util.function.Supplier;

public class Cheese_mod_blocks {
    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(Registries.BLOCK, Cheese_mod.MODID);



    public static final RegistryObject<Block> CHEESE_BLOCK=reg_b("cheese_block",
            ()->new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM).sound(SoundType.FROGLIGHT)));
    public static final RegistryObject<Block> VAT_BLOCK=reg_b("vat_block",
            ()->new Cheese_Mod_Vat_Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

    public static <T extends Block> RegistryObject<T> reg_b(String name, Supplier<T> block){
        RegistryObject<T> a=BLOCKS.register(name,block);
        reg_b_i(name,a);
        return a;
    }

    public static void reg(IEventBus e){BLOCKS.register(e);}

    public static <T extends Block> RegistryObject<Item> reg_b_i(String name,RegistryObject<T> block){
        return Cheese_mod_items.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties()));
    }
}
