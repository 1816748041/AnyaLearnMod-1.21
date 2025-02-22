package com.anyawowowowo.item;

import com.anyawowowowo.AnyaTutorial;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    //这里使用原版的方法注册物品栏
//    //注册ItemGroup
//    public static final RegistryKey<ItemGroup> ANYA_MOD = register("anya_mod");
//
//    //注册的方法
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(AnyaTutorial.MOD_ID, id));
//    }
//
//    //这里在注册ItemGroup
//    public static void registerItemGroups() {
//
//        Registry.register(
//                Registries.ITEM_GROUP,
//                ANYA_MOD,
//                ItemGroup.create(ItemGroup.Row.BOTTOM, 5)
//                        .displayName(Text.translatable("itemGroup.anya_mod"))
//                        .icon(() -> new ItemStack(ModItems.Anya_Head))
//                        .entries((displayContext, entries) -> {
//                            //在这里一条一条的写下注册的物品
//                            entries.add(ModItems.Anya_Head);
//
//                        }).build());
//
//        AnyaTutorial.LOGGER.info("注册了物品栏");
//    }

    //这里使用fabric的方法注册物品栏
    public static final ItemGroup ANYA_MOD = Registry.register(Registries.ITEM_GROUP, Identifier.of(AnyaTutorial.MOD_ID, "anya_mod"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.anya_mod"))
                    .icon(() -> new ItemStack(ModItems.Anya_Head))
                    .entries((displayContext, entries) -> {
                        //在这里一条一条的写下注册的物品z
                        entries.add(ModItems.Anya_Head);

                        //不仅仅可以注册Mod的物品，在这个物品栏还能放原版的物品
                        entries.add(Blocks.BAMBOO);
                        entries.add(Items.DIAMOND);

                    }).build());

    //这里运用了java的特性然后注册物品栏

    public static void registerModItemGroups() {

        AnyaTutorial.LOGGER.info("注册了物品栏");

    }
}
