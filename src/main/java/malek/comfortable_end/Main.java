package malek.comfortable_end;

import malek.comfortable_end.blocks.MeteoriteBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
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
    public static final Block METEORITE_BLOCK = new MeteoriteBlock(FabricBlockSettings.of(Material.METAL).strength(2).sounds(BlockSoundGroup.ANVIL));
    public static final Block CHORUS_WOOD_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).strength(0.4f));
    public static final Block CHORUS_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(0.4f));
    public static final Item CHORUS_PICKAXE = new CustomPickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new FabricItemSettings());
    public static final Item CHORUSWOOD_AXE = new CustomAxeItem(ToolMaterials.WOOD, 6, -3.2f, new FabricItemSettings());
    public static final Item CHORUSWOOD_SWORD = new CustomSwordItem(ToolMaterials.WOOD, 3, -2.4f, new FabricItemSettings());

    public static final Item METEORIC_IRON_PICKAXE = new CustomPickaxeItem(MeteoricIronMaterial.INSTANCE, 2, -2.8f, new FabricItemSettings());
    public static final Item METEORIC_IRON_AXE = new CustomAxeItem(MeteoricIronMaterial.INSTANCE, 5.5f, 3.1f, new FabricItemSettings());
    public static final Item METEORIC_IRON_SWORD = new CustomSwordItem(MeteoricIronMaterial.INSTANCE, 3, -2.6f, new FabricItemSettings());
    @Override
    public void onInitialize() {
        //Blocks
        {

        }
        //BlockItems
        {
            RegisterBlockItem("meteorite_block", METEORITE_BLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS));
            RegisterBlockItem("chorus_wood_planks", CHORUS_WOOD_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
            RegisterBlockItem("chorus_wood_slab", CHORUS_WOOD_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
        }
        //Items
        {
            RegisterItem("raw_meteoric_iron", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
            RegisterItem("chorus_pickaxe", CHORUS_PICKAXE);
            RegisterItem("choruswood_axe", CHORUSWOOD_AXE);
            RegisterItem("choruswood_sword", CHORUSWOOD_SWORD);
            RegisterItem("meteoric_iron_pickaxe", METEORIC_IRON_PICKAXE);
            RegisterItem("meteoric_iron_axe", METEORIC_IRON_AXE);
            RegisterItem("meteoric_iron_sword", METEORIC_IRON_SWORD);
        }
    }
    public static Identifier makeID(String string) {
        return new Identifier(Main.MODID, string);
    }
    public static void RegisterBlockItem(String id, Block block, FabricItemSettings fabricItemSettings) {
        Registry.register(Registry.BLOCK, makeID(id), block);
        Registry.register(Registry.ITEM, makeID(id), new BlockItem(block, fabricItemSettings));
    }
    public static void RegisterItem(String id, Item item) {
        Registry.register(Registry.ITEM, makeID(id), item);
    }
}