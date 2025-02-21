package com.anyawowowowo.item;

import com.anyawowowowo.AnyaTutorial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    //物品注册
    public static final Item Anya_Head = registerItems("anya_head", new Item(new Item.Settings()));

    //物品注册方法
    private static Item registerItems(String id, Item item)
    {
        //Identifier.ofVanilla(id)这个方法是加入到原版里面
        //Identifier.of(AnyaTutorial.MOD_ID, id)这个方法就直接加到我们的命名空间里面去了
        //return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(AnyaTutorial.MOD_ID, id)), item);
        //这个方法和上面的那个方法同理
        return Registry.register(Registries.ITEM, Identifier.of(AnyaTutorial.MOD_ID, id), item);
    }

    //这里使用了java的特性，在AnyaTutorial里面调用此方法的时候，java就会初始化由public static final修饰的这个字段，由此来调用registerItems这个方法来注册物品
    public static void registerModItems()
    {
        //打印日志
        AnyaTutorial.LOGGER.info("注册了物品");
    }
}
