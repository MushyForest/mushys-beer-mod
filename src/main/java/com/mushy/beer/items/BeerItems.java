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
   public static final RegistryObject<Item> LAGER = BEER_ITEMS.register("lager", BeerItem::new);
   public static final RegistryObject<Item> IPA = BEER_ITEMS.register("ipa", BeerItem::new);
   public static final RegistryObject<Item> AMBER = BEER_ITEMS.register("amber", BeerItem::new);
   public static final RegistryObject<Item> STOUT = BEER_ITEMS.register("stout", BeerItem::new);



}
