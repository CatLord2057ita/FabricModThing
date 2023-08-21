package net.michele.stickybomb.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.michele.stickybomb.StickyBomb;
import net.michele.stickybomb.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block AUSTRALIUM_BLOCK = registerBlock("australium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool()), ModItemGroup.AUSTRALIUM);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(StickyBomb.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(StickyBomb.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks () {
        StickyBomb.LOGGER.info("Registering Mod Blocks For: " + StickyBomb.MOD_ID);
    }
}
