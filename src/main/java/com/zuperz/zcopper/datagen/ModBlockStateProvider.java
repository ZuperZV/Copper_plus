package com.zuperz.zcopper.datagen;

import com.zuperz.zcopper.ZCopper;
import com.zuperz.zcopper.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.antlr.v4.codegen.model.StarBlock;

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

        stairsBlock((StairBlock) ModBlocks.COPPER_BRICKS_STAIRS.get(), blockTexture(ModBlocks.COPPER_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.COPPER_BRICKS_EXPOSED_STAIRS.get(), blockTexture(ModBlocks.COPPER_BRICKS_EXPOSED.get()));
        stairsBlock((StairBlock) ModBlocks.COPPER_BRICKS_WEATHERED_STAIRS.get(), blockTexture(ModBlocks.COPPER_BRICKS_WEATHERED.get()));
        stairsBlock((StairBlock) ModBlocks.COPPER_BRICKS_OXIDIZED_STAIRS.get(), blockTexture(ModBlocks.COPPER_BRICKS_OXIDIZED.get()));
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