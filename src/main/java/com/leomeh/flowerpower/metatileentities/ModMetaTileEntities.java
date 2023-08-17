package com.leomeh.flowerpower.metatileentities;

import com.leomeh.flowerpower.metatileentities.custom.ManaGeneratorTileEntity;
import com.myname.mymodid.Tags;
import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.common.metatileentities.MetaTileEntities;
import net.minecraft.util.ResourceLocation;

public class ModMetaTileEntities {
    public static SimpleGeneratorMetaTileEntity MANA_GEN_LV;
    public static SimpleGeneratorMetaTileEntity MANA_GEN_MV;

    public static SimpleGeneratorMetaTileEntity MANA_GEN_HV;

    public static SimpleGeneratorMetaTileEntity MANA_GEN_EV;

    public static SimpleGeneratorMetaTileEntity MANA_GEN_IV;

    public static void init(){
        MANA_GEN_LV = MetaTileEntities.registerMetaTileEntity(19200, new ManaGeneratorTileEntity(exampleId("mana_gen_lv"), 1));
        MANA_GEN_MV = MetaTileEntities.registerMetaTileEntity(19201, new ManaGeneratorTileEntity(exampleId("mana_gen_mv"), 2));
        MANA_GEN_HV = MetaTileEntities.registerMetaTileEntity(19202, new ManaGeneratorTileEntity(exampleId("mana_gen_hv"), 3));
        MANA_GEN_EV = MetaTileEntities.registerMetaTileEntity(19203, new ManaGeneratorTileEntity(exampleId("mana_gen_ev"), 4));
        MANA_GEN_IV = MetaTileEntities.registerMetaTileEntity(19204, new ManaGeneratorTileEntity(exampleId("mana_gen_iv"), 5));
    }

    private static ResourceLocation exampleId(String name) {
        return new ResourceLocation(Tags.MODID, name);
    }

}

