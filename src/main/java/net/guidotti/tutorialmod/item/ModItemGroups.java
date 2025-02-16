package net.guidotti.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.guidotti.tutorialmod.TutorialMod;
import net.guidotti.tutorialmod.block.ModBlocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                    }).build());

    public static final ItemGroup SWORDS = Registry.register(Registries.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID, "swords"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.NETHERITE_SWORD))
                    .displayName(Text.translatable("itemgroup.tutorialmod.swords"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.NETHERITE_SWORD);
                        entries.add(Items.DIAMOND_SWORD);
                        entries.add(Items.GOLDEN_SWORD);
                        entries.add(Items.IRON_SWORD);
                        entries.add(Items.STONE_SWORD);
                        entries.add(Items.WOODEN_SWORD);

                    }).build());
    public static final ItemGroup PICKAXE = Registry.register(Registries.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID, "pickaxe"),
            FabricItemGroup.builder().icon(()-> new ItemStack(Items.NETHERITE_PICKAXE))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pickaxe"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.NETHERITE_PICKAXE);
                        entries.add(Items.DIAMOND_PICKAXE);
                        entries.add(Items.GOLDEN_PICKAXE);
                        entries.add(Items.IRON_PICKAXE);
                        entries.add(Items.STONE_PICKAXE);
                        entries.add(Items.WOODEN_PICKAXE);
                    }).build());

    public static final ItemGroup AXES = Registry.register(Registries.ITEM_GROUP,Identifier.of(TutorialMod.MOD_ID, "axes"),
            FabricItemGroup.builder().icon(()-> new ItemStack(Items.NETHERITE_AXE))
                    .displayName(Text.translatable("itemgroup.tutorialmod.axes"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.NETHERITE_AXE);
                        entries.add(Items.DIAMOND_AXE);
                        entries.add(Items.GOLDEN_AXE);
                        entries.add(Items.IRON_AXE);
                        entries.add(Items.STONE_AXE);
                        entries.add(Items.WOODEN_AXE);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering ModItemGroups");
    }
}
