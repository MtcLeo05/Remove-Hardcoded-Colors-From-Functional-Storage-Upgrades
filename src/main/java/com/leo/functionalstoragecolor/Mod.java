package com.leo.functionalstoragecolor;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@net.minecraftforge.fml.common.Mod(Mod.MODID)
public class Mod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "functionalstoragecolor";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public Mod() {
    }
}
