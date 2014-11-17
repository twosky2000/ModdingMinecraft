package com.twosky.Utilities;

/**
 * Created by Tobi on 17.11.2014.
 */

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Utilities.MODID, version = Utilities.VERSION)
public class Utilities {
    public static final String MODID = "Utilities";
    public static final String VERSION = "0.1";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
