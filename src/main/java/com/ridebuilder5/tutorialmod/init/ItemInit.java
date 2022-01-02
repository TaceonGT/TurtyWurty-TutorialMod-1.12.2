package com.ridebuilder5.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.tutorialmod.objects.items.ItemBase;
import com.ridebuilder5.tutorialmod.objects.items.RadioactiveCoal;
import com.ridebuilder5.tutorialmod.objects.items.staffs.LargeFireballStaff;

import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	
	public static final Item RADIOACTIVE_COAL = new RadioactiveCoal("radioactive_coal");
	
	//Staffs
	public static final Item LARGE_FIREBALL_STAFF = new LargeFireballStaff("large_fireball_staff");
}
