package net.prangellplays.clownsword.world.dimension;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.prangellplays.clownsword.ClownSword;

public class ModDimensions {
    public static final RegistryKey<World> KJDIM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(ClownSword.MOD_ID, "kjdim"));
    public static final RegistryKey<DimensionType> KJDIM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, KJDIM_DIMENSION_KEY.getValue());


    public static void register() {
        ClownSword.LOGGER.debug("Registering ModDimensions for" + ClownSword.MOD_ID);
    }
}
