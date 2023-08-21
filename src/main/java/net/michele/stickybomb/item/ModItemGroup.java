package net.michele.stickybomb.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.michele.stickybomb.StickyBomb;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup AUSTRALIUM;

    public static void registerItemGroups() {
        AUSTRALIUM = FabricItemGroup.builder(new Identifier(StickyBomb.MOD_ID, "australium"))
                .displayName(Text.literal("Australium"))
                .icon(() -> new ItemStack(ModItems.AUSTRALIUM)).build();
    }
}
