package net.einhorn.cubedpack.block;


import net.einhorn.cubedpack.CubedPack;
import net.einhorn.cubedpack.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block CUBEDPACK_IRON_BLOCK = registerBlock("cubedpack_iron_block",
            new Block(FabricBlockSettings.of(Material.METAL).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS1 = registerBlock("cubedpack_bricks1",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS2 = registerBlock("cubedpack_bricks2",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS3 = registerBlock("cubedpack_bricks3",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS4 = registerBlock("cubedpack_bricks4",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS5 = registerBlock("cubedpack_bricks5",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS6 = registerBlock("cubedpack_bricks6",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS7 = registerBlock("cubedpack_bricks7",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS8 = registerBlock("cubedpack_bricks8",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS9 = registerBlock("cubedpack_bricks9",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS10 = registerBlock("cubedpack_bricks10",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS11 = registerBlock("cubedpack_bricks11",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS12 = registerBlock("cubedpack_bricks12",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS13 = registerBlock("cubedpack_bricks13",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS14 = registerBlock("cubedpack_bricks14",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS15 = registerBlock("cubedpack_bricks15",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS16 = registerBlock("cubedpack_bricks16",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS17 = registerBlock("cubedpack_bricks17",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS18 = registerBlock("cubedpack_bricks18",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS19 = registerBlock("cubedpack_bricks19",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS20 = registerBlock("cubedpack_bricks20",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS21 = registerBlock("cubedpack_bricks21",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS22 = registerBlock("cubedpack_bricks22",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    public static final Block CUBEDPACK_BRICKS23 = registerBlock("cubedpack_bricks23",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1).resistance(6).requiresTool()), ModItemGroup.CUBEDBLOCKS);

    private static Block registerBlock(String name,Block block,ItemGroup group){
        registerBlockItem(name,block,group);
        return Registry.register(Registry.BLOCK, new Identifier(CubedPack.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(CubedPack.MOD_ID, name),
                new BlockItem(block,new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks(){
        CubedPack.LOGGER.info("Registering ModBlocks for" + CubedPack.MOD_ID);

    }
}
