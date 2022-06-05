package net.prangellplays.clownsword.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.prangellplays.clownsword.ClownSword;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.clownsword.item.ModItemGroup;

public class ModBlocks {

    public static final Block DARK_CRYSTAL_ORE = registerBlock("dark_crystal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.PRANGELLCONTENT);

    public static final Block DEEPSLATE_DARK_CRYSTAL_ORE = registerBlock("deepslate_dark_crystal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.PRANGELLCONTENT);






    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ClownSword.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ClownSword.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        ClownSword.LOGGER.info("Registering ModBlocks for " + ClownSword.MOD_ID);
    }
}