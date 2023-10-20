package com.zuperz.zcopper.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class CopperBricksBlock extends Block implements CopperOxidizable {
    private CopperOxidizableLevel copperOxidizableLevel;

    public CopperBricksBlock(CopperOxidizableLevel copperOxidizableLevel, Properties pProperties) {
        super(pProperties);
        this.copperOxidizableLevel = copperOxidizableLevel;
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        super.randomTick(pState, pLevel, pPos, pRandom);
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
