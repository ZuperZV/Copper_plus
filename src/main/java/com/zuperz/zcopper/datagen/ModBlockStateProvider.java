package com.zuperz.zcopper.datagen;

import com.zuperz.zcopper.ZCopper;
import com.zuperz.zcopper.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ZCopper.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.COPPER_BRICKS);
        blockWithItem(ModBlocks.COPPER_BRICKS_EXPOSED);
        blockWithItem(ModBlocks.COPPER_BRICKS_WEATHERED);
        blockWithItem(ModBlocks.COPPER_BRICKS_OXIDIZED);

        blockWithItem(ModBlocks.WAXED_COPPER_BRICKS);
        blockWithItem(ModBlocks.WAXED_COPPER_BRICKS_EXPOSED);
        blockWithItem(ModBlocks.WAXED_COPPER_BRICKS_WEATHERED);
        blockWithItem(ModBlocks.WAXED_COPPER_BRICKS_OXIDIZED);

    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("zcopper:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("zcopper:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}