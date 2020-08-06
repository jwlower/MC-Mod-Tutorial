package com.spectrumpositive.tutorial.items;

import com.spectrumpositive.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    //Calling this creates a new item in group materials
    public ItemBase() {
        super(new Item.Properties().group(Tutorial.TAB));
    }
}

