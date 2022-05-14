package malek.comfortable_end.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class MeteoriteBlock extends FallingBlock {
    public MeteoriteBlock(Settings settings) {
        super(settings);
    }
    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        super.onLanding(world, pos, fallingBlockState, currentStateInPos, fallingBlockEntity);
        world.playSound(null, pos, SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.BLOCKS, 1.0f, 1.0f);
    }
}