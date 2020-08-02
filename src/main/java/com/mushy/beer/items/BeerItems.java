package com.mushy.beer.items;

import com.mushy.beer.Beer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BeerItems {


   public static final DeferredRegister<Item> BEER_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Beer.ModId);

   public static final RegistryObject<Item> BEER = BEER_ITEMS.register("beer", BeerItem::new);

}
