package org.sdawdsd.cheese_mod.items;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.sdawdsd.cheese_mod.Cheese_mod;
import org.sdawdsd.cheese_mod.items.custom.Mushroom_detector_item;
import org.sdawdsd.cheese_mod.items.custom.Vat_fuel;

public class Cheese_mod_items {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS, Cheese_mod.MODID);
    public static final RegistryObject<Item>CHEESE=ITEMS.register("cheese",()->new Item(new Item.Properties().food(Cheese_mod_food.CHEEESE_FOOD)));
    public static final RegistryObject<Item>KNIFE=ITEMS.register("knife",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item>HAMMER=ITEMS.register("hammer",()->new Item(new Item.Properties()));

    public static final RegistryObject<Item>HOTMILK=ITEMS.register("hot_milk",()->new Item(new Item.Properties()));

    public static final RegistryObject<Item>SPORES=ITEMS.register("spores",()->new Item(new Item.Properties()));

    public static final RegistryObject<Item>CHEESEWITHSPORES=ITEMS.register("cheese_with_spores",()->new Item(new Item.Properties()));

    public static final RegistryObject<Item>VAT_FUEL= ITEMS.register("vat_fuel",()->new Vat_fuel(new Item.Properties()));

    public  static  final  RegistryObject<Item>MDETECTOR=ITEMS.register("mushroom_detector",()->new Mushroom_detector_item(new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.COMMON)
            .durability(50)));
}
