package com.leomeh.flowerpower.metatileentities.custom;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.client.renderer.texture.Textures;
import net.minecraft.util.ResourceLocation;
import vazkii.botania.api.mana.IManaCollector;

public class ManaGeneratorTileEntity extends SimpleGeneratorMetaTileEntity {


    public ManaGeneratorTileEntity(ResourceLocation metaTileEntityId, int tier) {
        super(metaTileEntityId, new RecipeMap<>("mana_gen_recipes", 0, 0, 0, 0, new SimpleRecipeBuilder(), true), Textures.COMBUSTION_GENERATOR_OVERLAY, tier, (n) -> n + 1);
    }
    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new ManaGeneratorTileEntity(metaTileEntityId, getTier());
    }

    public int manaCostPerTier(int tier){
        return tier * 10;
    }
    /**
     * Called when this receiver receives mana.
     *
     * @param mana
     */

    public void reciveMana(int mana){
        System.out.println(mana);
        if (energyContainer.getEnergyStored() <= energyContainer.getEnergyCapacity()) {
            energyContainer.addEnergy(mana * ((getTier() + 1) * 8L));
        }
    }
}

