package com.ridebuilder5.tutorialmod.objects.blocks;

import com.ridebuilder5.tutorialmod.util.interfaces.IHasModel;
import com.ridebuilder5.tutorialmod.TutorialMod;
import com.ridebuilder5.tutorialmod.init.BlockInit;
import com.ridebuilder5.tutorialmod.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		TutorialMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
