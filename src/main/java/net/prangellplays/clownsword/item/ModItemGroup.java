package net.prangellplays.clownsword.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.prangellplays.clownsword.ClownSword;

public class ModItemGroup {
    public static final ItemGroup PRANGELLCONTENT = FabricItemGroupBuilder.build(new Identifier(ClownSword.MOD_ID, "prangellcontent"),
            () -> new ItemStack(ModItems.DARK_CRYSTAL));
}
