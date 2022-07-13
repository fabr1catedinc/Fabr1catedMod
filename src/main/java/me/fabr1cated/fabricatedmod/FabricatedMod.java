package me.fabr1cated.fabricatedmod;

import me.fabr1cated.fabricatedmod.Init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FabricatedMod.MODID)
public class FabricatedMod {
    public static final String MODID = "fabricatedmod";

    public FabricatedMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
    }
}
