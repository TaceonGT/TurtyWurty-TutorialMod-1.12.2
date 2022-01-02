package com.ridebuilder5.tutorialmod.objects.items;

import com.ridebuilder5.tutorialmod.TutorialMod;
import com.ridebuilder5.tutorialmod.init.ItemInit;
import com.ridebuilder5.tutorialmod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RadioactiveCoal extends Item implements IHasModel {

	public RadioactiveCoal(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) {
		return 2000;
	}
	
	@Override
	public void registerModels() {
		TutorialMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
