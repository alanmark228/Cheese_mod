package org.sdawdsd.cheese_mod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.sdawdsd.cheese_mod.Cheese_mod;

public class Cheese_mod_tags {
    public static class Blocks{
        public static final TagKey<Block> MUSHROOM_DETECTOR_VALUES=tag("mushroom_detector_values");

       private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(Cheese_mod.MODID,name));
       }
    }

    public static class Items{

    }
}
