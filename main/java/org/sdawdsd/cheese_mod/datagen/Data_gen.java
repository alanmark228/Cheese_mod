package org.sdawdsd.cheese_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.sdawdsd.cheese_mod.Cheese_mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Cheese_mod.MODID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class Data_gen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e){
        DataGenerator generator= e.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper efh = e.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> cF = e.getLookupProvider();

        generator.addProvider(e.includeServer(),new Mod_block_state_provider(packOutput,Cheese_mod.MODID,efh));

        generator.addProvider(e.includeServer(),new Mod_item_model_provider(packOutput,Cheese_mod.MODID,efh));

        generator.addProvider(e.includeServer(),new Mod_recipe_provider(packOutput));

        generator.addProvider(e.includeServer(),Mod_loottable_provider.create(packOutput));

        Mod_block_tag_generator mbtg=generator.addProvider(e.includeServer(),new Mod_block_tag_generator(packOutput,cF,Cheese_mod.MODID,efh));

        generator.addProvider(e.includeServer(),new Mod_item_tag_generator(packOutput,cF,mbtg.contentsGetter(),Cheese_mod.MODID,efh));
    }
}