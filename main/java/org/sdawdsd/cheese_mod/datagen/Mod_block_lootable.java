package org.sdawdsd.cheese_mod.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.sdawdsd.cheese_mod.blocks.Cheese_mod_blocks;

import java.util.Set;

public class Mod_block_lootable extends BlockLootSubProvider {
    protected Mod_block_lootable() {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS);
    }

    @Override
    protected void generate() {
        this.dropSelf(Cheese_mod_blocks.CHEESE_BLOCK.get());

        this.add(Cheese_mod_blocks.CHEESE_BLOCK.get(),block -> createSelfDropDispatchTable(Cheese_mod_blocks.CHEESE_BLOCK.get(),null,null));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Cheese_mod_blocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
