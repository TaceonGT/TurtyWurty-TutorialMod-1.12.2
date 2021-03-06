package com.ridebuilder5.tutorialmod.objects.items.staffs;

import com.ridebuilder5.tutorialmod.TutorialMod;
import com.ridebuilder5.tutorialmod.init.ItemInit;
import com.ridebuilder5.tutorialmod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class LargeFireballStaff extends Item implements IHasModel {
	
	public LargeFireballStaff(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d look = playerIn.getLookVec();
		EntityLargeFireball largeFireball = new EntityLargeFireball(worldIn, playerIn, 1D, 1D, 1D);
		largeFireball.setPosition(playerIn.posX + look.x * 1.5D, playerIn.posY + look.y * 1.5D, playerIn.posZ + look.z * 1.5D);
		largeFireball.accelerationX = look.x * 7.0D;
		largeFireball.accelerationY = look.y * 7.0D;
		largeFireball.accelerationZ = look.z * 7.0D;
		largeFireball.explosionPower = 5;
		largeFireball.setGlowing(true);
		playerIn.getCooldownTracker().setCooldown(this, 30);
		worldIn.spawnEntity(largeFireball);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
	
	@Override
	public void registerModels() {
		TutorialMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
