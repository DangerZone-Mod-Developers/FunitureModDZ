package com.jtrent238.funituremod;

import com.jtrent238.funituremod.blocks.ChairBlock;

import dangerzone.BaseMod;
import dangerzone.blocks.Block;
import dangerzone.blocks.Blocks;

public class FunitureModMain extends BaseMod {
	

	//Basic mod constants
	public static final String MOD_NAME = "FunitureMod";
	public static final String MOD_RES = "funituremodres";
	public static final String MOD_VERSION = "indev-1.0.0.0";
	public static final String DZ_VERSION = "2.0";
	
	public static Block mychairblock = new ChairBlock(MOD_NAME + ":Chair", MOD_RES + "/blocks/blockchair.png", 100);
	
	//NAME MUST END IN "Main" so loader can find it...
	//NAME MUST END IN "Main" so loader can find it...
	//NAME MUST END IN "Main" so loader can find it...
	public FunitureModMain (){
		super();
	}
	
	public String getModName()
	{
		return MOD_NAME + " v" + MOD_VERSION + " for DZ" + DZ_VERSION;
	}
	
	
	public String versionBuiltWith()
	{
		return DZ_VERSION;
	}
	
	//This is where all your registration happens.
	public void registerThings(){
		Blocks.registerBlock(mychairblock);
	}
	
	//You probably won't need this routine unless you care which OTHER mods are installed.
	//This is called AFTER all mods are loaded and registered.
	//It needs to exist, just leave it empty.
	public void postLoadProcessing(){
		//System.out.printf("Demo mod printf! postLoadProcessing()\n");
		//System.out.printf("Block 1 name is: %s\n", Blocks.BlockArray[1].uniquename);
		//System.out.printf("Renderdistance is: %d\n", DangerZone.renderdistance);
	}

}
