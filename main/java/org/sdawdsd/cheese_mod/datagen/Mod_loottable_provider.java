package org.sdawdsd.cheese_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class Mod_loottable_provider {
    public static LootTableProvider create(PackOutput po){
        return new LootTableProvider(po, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(Mod_block_lootable::new, LootContextParamSets.BLOCK)
        ));
    }
}
