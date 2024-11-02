package org.sdawdsd.cheese_mod.items;

import net.minecraft.client.gui.components.tabs.Tab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.sdawdsd.cheese_mod.Cheese_mod;
import org.sdawdsd.cheese_mod.blocks.Cheese_mod_blocks;

public class Cheese_mod_tab {
  public static final DeferredRegister<CreativeModeTab> CHTAB=DeferredRegister.create(Registries.CREATIVE_MODE_TAB,Cheese_mod.MODID);

  public static final RegistryObject<CreativeModeTab> TAB=CHTAB.register("cheese_mod_tab",
          ()->CreativeModeTab.builder().icon(
                  ()->new ItemStack(Cheese_mod_items.CHEESE.get()))
                  .title(Component.translatable("creativetab.cheese_mod_tab"))
                  .displayItems(
                          (a,b)->{
                            b.accept(Cheese_mod_items.CHEESE.get());
                            b.accept(Cheese_mod_items.HAMMER.get());
                            b.accept(Cheese_mod_items.KNIFE.get());
                            b.accept(Cheese_mod_items.HOTMILK.get());
                            b.accept(Cheese_mod_items.CHEESEWITHSPORES.get());
                            b.accept(Cheese_mod_items.SPORES.get());
                            b.accept(Cheese_mod_blocks.CHEESE_BLOCK.get());
                            b.accept(Cheese_mod_blocks.VAT_BLOCK.get());})
                  .build());

  public static void reg(IEventBus e){
    CHTAB.register(e);
  }

}
