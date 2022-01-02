package com.ridebuilder5.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.tutorialmod.objects.blocks.CandyCane;
import com.ridebuilder5.tutorialmod.objects.blocks.silver_chest.SilverChest;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CANDY_CANE = new CandyCane("candy_cane", Material.GOURD);
	public static final Block SILVER_CHEST = new SilverChest("silver_chest", Material.WOOD);
}
