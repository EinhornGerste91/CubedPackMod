package net.einhorn.cubedpack.item;

import net.einhorn.cubedpack.CubedPack;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item WAND = registerItem("wand",
            new Item(new FabricItemSettings().group(ModItemGroup.CUBEDITEMS)));

    public static final Item RAINBOWWAND = registerItem("rainbowwand", new Item(new FabricItemSettings().group(ModItemGroup.CUBEDITEMS)));

    private static Item registerItem(String name,Item item){

        return Registry.register(Registry.ITEM, new Identifier(CubedPack.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CubedPack.LOGGER.info("Registering Mod Items for" + CubedPack.MOD_ID);

    }
}