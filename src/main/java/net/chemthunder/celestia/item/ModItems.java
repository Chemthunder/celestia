package net.chemthunder.celestia.item;

import net.chemthunder.celestia.Celestia;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CUTLASS = registerItem("cutlass", new Item(new Item.Settings().sword(ToolMaterial.IRON, 3, -2.1f).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Celestia.MOD_ID, "cutlass")))));
    public static final Item SKELETON_CUTLASS = registerItem("skeleton_cutlass", new Item(new Item.Settings().sword(ToolMaterial.NETHERITE, 6, -2.4f).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Celestia.MOD_ID, "skeleton_cutlass")))));
    public static final Item netherite_CUTLASS = registerItem("netherite_cutlass", new Item(new Item.Settings().sword(ToolMaterial.NETHERITE, 4, -2.3f).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Celestia.MOD_ID, "netherite_cutlass")))));

    public static final Item CHEM_COOKIE = registerItem("chem_cookie", new Item(new Item.Settings().food(new FoodComponent.Builder().alwaysEdible().saturationModifier(1).build()).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Celestia.MOD_ID, "chem_cookie")))));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Celestia.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Celestia.LOGGER.info("Registering Mod Items for " + Celestia.MOD_ID);


    }

}