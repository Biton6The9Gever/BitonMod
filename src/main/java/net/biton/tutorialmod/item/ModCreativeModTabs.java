package net.biton.tutorialmod.item;

import net.biton.tutorialmod.TutorialMod;
import net.biton.tutorialmod.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB=CREATIVE_MODE_TAB.register("tutorial_tab",
            ()->CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters,pOutPut)->{
                        //items
                        pOutPut.accept(ModItems.SAPPHIRE.get());
                        pOutPut.accept(ModItems.RAW_SAPPHIRE.get());

                        //blocks
                        pOutPut.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutPut.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> BITON_CRAZY_STUFF=CREATIVE_MODE_TAB.register("biton_crazy_stuff",
            ()->CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.ANTI_GAY.get()))
                    .title(Component.translatable("Biton Crazy Stuff"))
                    .displayItems((pParameters,pOutPut)->{
                        //items

                        pOutPut.accept(ModItems.PRECURSOR_GEAR.get());

                        //blocks
                        pOutPut.accept(ModBlocks.ANTI_GAY.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

