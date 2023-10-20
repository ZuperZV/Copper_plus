package com.zuperz.zcopper.item;

import com.zuperz.zcopper.ZCopper;
import com.zuperz.zcopper.item.custom.ModWaxingItem;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZCopper.MOD_ID);

    public static final RegistryObject<Item> WASHED_HONEYCOMB = ITEMS.register("washed_honeycomb",
            () -> new ModWaxingItem(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));

    //public static final RegistryObject<Item> WASHED_AXE = ITEMS.register("washed_AXE",
    //        () -> new WAX_OFF_BY_BLOCK(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
