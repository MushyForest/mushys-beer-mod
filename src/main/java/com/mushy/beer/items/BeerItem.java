package com.mushy.beer.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BeerItem extends Item {

    public BeerItem () {
        super(new Item.Properties().group(ItemGroup.MATERIALS));
    }

}
