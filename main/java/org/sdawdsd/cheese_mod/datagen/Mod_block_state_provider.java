package org.sdawdsd.cheese_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.sdawdsd.cheese_mod.blocks.Cheese_mod_blocks;

public class Mod_block_state_provider extends BlockStateProvider {

    public Mod_block_state_provider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(Cheese_mod_blocks.VAT_BLOCK);
        blockWithItem(Cheese_mod_blocks.CHEESE_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> a){
        simpleBlockWithItem(a.get(),cubeAll(a.get()));
    }
}
