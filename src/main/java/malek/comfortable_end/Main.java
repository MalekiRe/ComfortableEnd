package malek.comfortable_end;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main implements ModInitializer {
    public static final String MODID = "comfortable_end";
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
    public static final Block METEORITE_BLOCK = new FallingBlock(FabricBlockSettings.of(Material.METAL).strength(8, 10f).sounds(BlockSoundGroup.ANVIL));
    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, makeID("meteorite_block"), METEORITE_BLOCK);
        Registry.register(Registry.ITEM, makeID("meteorite_block"), new BlockItem(METEORITE_BLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

        LOGGER.info("Hello Fabric world!");
    }
    public static Identifier makeID(String string) {
        return new Identifier(Main.MODID, string);
    }
}