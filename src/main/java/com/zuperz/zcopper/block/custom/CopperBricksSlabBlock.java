package com.zuperz.zcopper.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;


public class CopperBricksSlabBlock extends SlabBlock implements CopperOxidizable, SimpleWaterloggedBlock {
    private CopperOxidizableLevel copperOxidizableLevel;

    public CopperBricksSlabBlock(CopperOxidizableLevel copperOxidizableLevel, BlockBehaviour.Properties pProperties) {
        super(pProperties);
        this.copperOxidizableLevel = copperOxidizableLevel;
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        this.onRandomTick(pState, pLevel, pPos, pRandom);
    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return CopperOxidizable.getNext(pState.getBlock()).isPresent();
    }

    @Override
    public CopperOxidizableLevel getAge() {
        return copperOxidizableLevel;
    }





}