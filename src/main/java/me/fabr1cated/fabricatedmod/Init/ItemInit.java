package me.fabr1cated.fabricatedmod.Init;

import me.fabr1cated.fabricatedmod.FabricatedMod;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FabricatedMod.MODID);

    public static final RegistryObject<Item> FABRICATED_KEYS = ITEMS.register("fabricated_keys", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> KAWAII = ITEMS.register("kawaii", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(Foods.ENCHANTED_GOLDEN_APPLE)));
    public static final RegistryObject<Item> KAWAII_DUST = ITEMS.register("kawaii_dust", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}

