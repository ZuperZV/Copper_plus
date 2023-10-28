package com.zuperz.zcopper.datagen.loot;

import com.zuperz.zcopper.block.ModBlocks;
import com.zuperz.zcopper.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.COPPER_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.COPPER_BRICKS_EXPOSED_STAIRS.get());
        this.dropSelf(ModBlocks.COPPER_BRICKS_WEATHERED_STAIRS.get());
        this.dropSelf(ModBlocks.COPPER_BRICKS_OXIDIZED_STAIRS.get());

        this.dropSelf(ModBlocks.WAXED_COPPER_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_COPPER_BRICKS_EXPOSED_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_COPPER_BRICKS_WEATHERED_STAIRS.get());
        this.dropSelf(ModBlocks.WAXED_COPPER_BRICKS_OXIDIZED_STAIRS.get());

        this.add(ModBlocks.COPPER_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COPPER_BRICKS_SLAB.get()));
        this.add(ModBlocks.COPPER_BRICKS_EXPOSED.get(),
                block -> createSlabItemTable(ModBlocks.COPPER_BRICKS_EXPOSED.get()));
        this.add(ModBlocks.COPPER_BRICKS_WEATHERED.get(),
                block -> createSlabItemTable(ModBlocks.COPPER_BRICKS_WEATHERED.get()));
        this.add(ModBlocks.COPPER_BRICKS_OXIDIZED.get(),
                block -> createSlabItemTable(ModBlocks.COPPER_BRICKS_OXIDIZED.get()));

        this.add(ModBlocks.WAXED_COPPER_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WAXED_COPPER_BRICKS_SLAB.get()));
        this.add(ModBlocks.WAXED_COPPER_BRICKS_EXPOSED.get(),
                block -> createSlabItemTable(ModBlocks.WAXED_COPPER_BRICKS_EXPOSED.get()));
        this.add(ModBlocks.WAXED_COPPER_BRICKS_WEATHERED.get(),
                block -> createSlabItemTable(ModBlocks.WAXED_COPPER_BRICKS_WEATHERED.get()));
        this.add(ModBlocks.WAXED_COPPER_BRICKS_OXIDIZED.get(),
                block -> createSlabItemTable(ModBlocks.WAXED_COPPER_BRICKS_OXIDIZED.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
