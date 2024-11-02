package org.sdawdsd.cheese_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import org.sdawdsd.cheese_mod.util.Cheese_mod_tags;

import java.util.concurrent.CompletableFuture;

public class Mod_block_tag_generator extends BlockTagsProvider {
    public Mod_block_tag_generator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {
        tag(Cheese_mod_tags.Blocks.MUSHROOM_DETECTOR_VALUES).add(Blocks.BROWN_MUSHROOM).add(Blocks.RED_MUSHROOM);
    }


}
