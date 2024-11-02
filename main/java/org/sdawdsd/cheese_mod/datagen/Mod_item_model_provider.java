package org.sdawdsd.cheese_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.sdawdsd.cheese_mod.Cheese_mod;
import org.sdawdsd.cheese_mod.items.Cheese_mod_items;

public class Mod_item_model_provider extends ItemModelProvider {

    public Mod_item_model_provider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, Cheese_mod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(Cheese_mod_items.CHEESE);
        simpleItem(Cheese_mod_items.HAMMER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> i){
        return withExistingParent(i.getId().getPath(),
                new ResourceLocation("item/generated")).texture("0",
                new ResourceLocation(Cheese_mod.MODID,
                        "item/"+i.getId().getPath()));
    }
}
