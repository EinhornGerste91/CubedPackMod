package net.einhorn.cubedpack.item;

import net.einhorn.cubedpack.CubedPack;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup CUBEDITEMS = FabricItemGroupBuilder.build(new Identifier(CubedPack.MOD_ID, "cubeditems"), () -> new ItemStack(ModItems.WAND));
    public static final ItemGroup CUBEDBLOCKS = FabricItemGroupBuilder.build(new Identifier(CubedPack.MOD_ID, "cubedblocks"), () -> new ItemStack(ModItems.RAINBOWWAND));
}
