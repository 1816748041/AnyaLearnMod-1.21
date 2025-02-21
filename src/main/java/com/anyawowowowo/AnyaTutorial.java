package com.anyawowowowo;

import com.anyawowowowo.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnyaTutorial implements ModInitializer {

	public static final String MOD_ID = "anyatutorial";
	//这个logger用于此模组输出日志，传入自己的模组id，当输出日志的时候，就能区分这是哪个模组的日志、警告、报错等信息;
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//使用java特性，初始化ModItems这个类里面的物品
		ModItems.registerModItems();

		//这里一旦minecraft加载完成mod之后就会调用，但是有些东西比如资源resources肯还没有被初始化
		LOGGER.info("Hello Fabric world!");

	}
}