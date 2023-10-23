package com.zuperz.zcopper.block;

import com.zuperz.zcopper.ZCopper;
import com.zuperz.zcopper.block.custom.CopperBricksBlock;
import com.zuperz.zcopper.block.custom.CopperOxidizable;
import com.zuperz.zcopper.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ZCopper.MOD_ID);


    public static final RegistryObject<Block> COPPER_BRICKS = registerBlock("copper_bricks",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> COPPER_BRICKS_EXPOSED = registerBlock("copper_bricks_exposed",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> COPPER_BRICKS_WEATHERED = registerBlock("copper_bricks_weathered",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> COPPER_BRICKS_OXIDIZED = registerBlock("copper_bricks_oxidized",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    public static final RegistryObject<Block> WAXED_COPPER_BRICKS = registerBlock("waxed_copper_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_COPPER_BRICKS_EXPOSED = registerBlock("waxed_copper_bricks_exposed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_COPPER_BRICKS_WEATHERED = registerBlock("waxed_copper_bricks_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_COPPER_BRICKS_OXIDIZED = registerBlock("waxed_copper_bricks_oxidized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    //Stairs

    public static final RegistryObject<Block> COPPER_BRICKS = registerBlock("copper_bricks",
            () -> new StairBlock() CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> COPPER_BRICKS_EXPOSED = registerBlock("copper_bricks_exposed",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> COPPER_BRICKS_WEATHERED = registerBlock("copper_bricks_weathered",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> COPPER_BRICKS_OXIDIZED = registerBlock("copper_bricks_oxidized",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    public static final RegistryObject<Block> WAXED_COPPER_BRICKS = registerBlock("waxed_copper_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_COPPER_BRICKS_EXPOSED = registerBlock("waxed_copper_bricks_exposed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_COPPER_BRICKS_WEATHERED = registerBlock("waxed_copper_bricks_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_COPPER_BRICKS_OXIDIZED = registerBlock("waxed_copper_bricks_oxidized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    //Slabs

    public static final RegistryObject<Block> COPPER_BRICKS = registerBlock("copper_bricks",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.UNAFFECTED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> COPPER_BRICKS_EXPOSED = registerBlock("copper_bricks_exposed",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.EXPOSED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> COPPER_BRICKS_WEATHERED = registerBlock("copper_bricks_weathered",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.WEATHERED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> COPPER_BRICKS_OXIDIZED = registerBlock("copper_bricks_oxidized",
            () -> new CopperBricksBlock(CopperOxidizable.CopperOxidizableLevel.OXIDIZED,
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    public static final RegistryObject<Block> WAXED_COPPER_BRICKS = registerBlock("waxed_copper_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_COPPER_BRICKS_EXPOSED = registerBlock("waxed_copper_bricks_exposed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_COPPER_BRICKS_WEATHERED = registerBlock("waxed_copper_bricks_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_COPPER_BRICKS_OXIDIZED = registerBlock("waxed_copper_bricks_oxidized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
