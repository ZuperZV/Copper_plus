package com.zuperz.zcopper.datagen;

import com.zuperz.zcopper.ZCopper;
import com.zuperz.zcopper.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ZCopper.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.COPPER_BRICKS.get())
                .add(ModBlocks.COPPER_BRICKS_EXPOSED.get())
                .add(ModBlocks.COPPER_BRICKS_WEATHERED.get())
                .add(ModBlocks.COPPER_BRICKS_OXIDIZED.get())

                .add(ModBlocks.WAXED_COPPER_BRICKS.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_EXPOSED.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_WEATHERED.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_OXIDIZED.get())

                .add(ModBlocks.COPPER_BRICKS_STAIRS.get())
                .add(ModBlocks.COPPER_BRICKS_EXPOSED_STAIRS.get())
                .add(ModBlocks.COPPER_BRICKS_WEATHERED_STAIRS.get())
                .add(ModBlocks.COPPER_BRICKS_OXIDIZED_STAIRS.get())

                .add(ModBlocks.WAXED_COPPER_BRICKS_STAIRS.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_EXPOSED_STAIRS.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_WEATHERED_STAIRS.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_OXIDIZED_STAIRS.get())

                .add(ModBlocks.COPPER_BRICKS_SLAB.get())
                .add(ModBlocks.COPPER_BRICKS_EXPOSED_SLAB.get())
                .add(ModBlocks.COPPER_BRICKS_WEATHERED_SLAB.get())
                .add(ModBlocks.COPPER_BRICKS_OXIDIZED_SLAB.get())

                .add(ModBlocks.WAXED_COPPER_BRICKS_SLAB.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_EXPOSED_SLAB.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_WEATHERED_SLAB.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_OXIDIZED_SLAB.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.COPPER_BRICKS.get())
                .add(ModBlocks.COPPER_BRICKS_EXPOSED.get())
                .add(ModBlocks.COPPER_BRICKS_WEATHERED.get())
                .add(ModBlocks.COPPER_BRICKS_OXIDIZED.get())

                .add(ModBlocks.WAXED_COPPER_BRICKS.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_EXPOSED.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_WEATHERED.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_OXIDIZED.get())

                .add(ModBlocks.COPPER_BRICKS_STAIRS.get())
                .add(ModBlocks.COPPER_BRICKS_EXPOSED_STAIRS.get())
                .add(ModBlocks.COPPER_BRICKS_WEATHERED_STAIRS.get())
                .add(ModBlocks.COPPER_BRICKS_OXIDIZED_STAIRS.get())

                .add(ModBlocks.WAXED_COPPER_BRICKS_STAIRS.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_EXPOSED_STAIRS.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_WEATHERED_STAIRS.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_OXIDIZED_STAIRS.get())

                .add(ModBlocks.COPPER_BRICKS_SLAB.get())
                .add(ModBlocks.COPPER_BRICKS_EXPOSED_SLAB.get())
                .add(ModBlocks.COPPER_BRICKS_WEATHERED_SLAB.get())
                .add(ModBlocks.COPPER_BRICKS_OXIDIZED_SLAB.get())

                .add(ModBlocks.WAXED_COPPER_BRICKS_SLAB.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_EXPOSED_SLAB.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_WEATHERED_SLAB.get())
                .add(ModBlocks.WAXED_COPPER_BRICKS_OXIDIZED_SLAB.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}