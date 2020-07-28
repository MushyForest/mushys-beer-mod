
package com.mushy.beer;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Beer.ModId)
public class Beer {

    public static final String ModId = "beer";

    public Beer () {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);


    }

    private void setup (final FMLCommonSetupEvent event) {



    }

}