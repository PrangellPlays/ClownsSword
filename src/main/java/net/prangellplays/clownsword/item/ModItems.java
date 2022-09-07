package net.prangellplays.clownsword.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.prangellplays.clownsword.ClownSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.clownsword.item.custom.ModLifestealSwordItem;
import net.prangellplays.clownsword.item.custom.ModPlasmythicSwordItem;


public class ModItems {
    public static final Item DARK_CRYSTAL = registerItem("dark_crystal",
        new Item(new FabricItemSettings().group(ModItemGroup.PRANGELLCONTENT)));

    public static final Item BLOOD_STAINED_CRYSTAL = registerItem("blood_stained_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.PRANGELLCONTENT)));

    public static final Item REPAIRING_CRYSTAL = registerItem("repairing_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.PRANGELLCONTENT)));

    public static final Item PLASMYTHIC_CRYSTAL = registerItem("plasmythic_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.PRANGELLCONTENT)));

    public static final Item PLAYER_SOUL = registerItem("player_soul",
            new Item(new FabricItemSettings().group(ModItemGroup.PRANGELLCONTENT)));

    public static final Item PIERCER = registerItem("piercer",
            new ModLifestealSwordItem(ModToolMaterials.Crystal,5,   5f,  new FabricItemSettings().group(ModItemGroup.PRANGELLCONTENT)));

    public static final Item PLASMYTHIC_BLADE = registerItem("plasmythic_blade",
            new ModPlasmythicSwordItem(ModToolMaterials.Crystal,2,   -1f,  new FabricItemSettings().group(ModItemGroup.PRANGELLCONTENT)));

    public static final Item CREATIVE_WEAPON = registerItem("creative_weapon",
            new ModPlasmythicSwordItem(ModToolMaterials.Crystal,100000,   100000f,  new FabricItemSettings().group(ModItemGroup.PRANGELLCONTENT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register (Registry.ITEM, new Identifier(ClownSword.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ClownSword.LOGGER.info("Registering Mod Items For " + ClownSword.MOD_ID);
    }
}
