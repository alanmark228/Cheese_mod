package org.sdawdsd.cheese_mod.datagen;

import com.mojang.serialization.Codec;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.Nullable;
import org.sdawdsd.cheese_mod.Cheese_mod;
import org.sdawdsd.cheese_mod.items.Cheese_mod_items;

import java.util.List;

public class Mod_recipe_provider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> cooking = List.of(Items.MILK_BUCKET);

    public Mod_recipe_provider(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(RecipeOutput p_297267_) {
        oreCooking(p_297267_, new RecipeSerializer<AbstractCookingRecipe>() {
            @Override
            public Codec<AbstractCookingRecipe> codec() {
                return null;
            }

            @Override
            public @Nullable AbstractCookingRecipe fromNetwork(FriendlyByteBuf p_44106_) {
                return null;
            }

            @Override
            public void toNetwork(FriendlyByteBuf p_44101_, AbstractCookingRecipe p_44102_) {

            }
        },null,cooking,RecipeCategory.MISC, Cheese_mod_items.HOTMILK.get(),0.7f,100,"hot","hot_milk");
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT,Cheese_mod_items.KNIFE.get())
                .pattern(" # ")
                .pattern(" Y ")
                .pattern(" X ")
                .define('#',Items.IRON_INGOT)
                .define('Y',Items.STRING)
                .save(p_297267_);
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput rup, RecipeSerializer<T> rs, AbstractCookingRecipe.Factory<T> acr, List<ItemLike>  p_249619_, RecipeCategory p_251154_, ItemLike result, float exp, int time, String group_, String rn) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, result, exp, time, rs, acr).group(group_).unlockedBy(getHasName(itemlike), has(itemlike)).save(rup,Cheese_mod.MODID+ ":" + getItemName(result) + rn + "_" + getItemName(itemlike));
        }

    }


}
