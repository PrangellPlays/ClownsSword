package net.prangellplays.clownsword.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.prangellplays.clownsword.ClownSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item DARK_CRYSTAL = registerItem("dark_crystal",
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register (Registry.ITEM, new Identifier(ClownSword.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ClownSword.LOGGER.info("Registering Mod Items For " + ClownSword.MOD_ID);
    }
}
