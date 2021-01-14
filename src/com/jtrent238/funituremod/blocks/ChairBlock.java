package com.jtrent238.funituremod.blocks;

import com.jtrent238.funituremod.model.ModelChair;

import dangerzone.blocks.Block;

public class ChairBlock extends Block {

	public static ModelChair mdl = null;

	
	public ChairBlock(String n, String txt, int hardness) {
		super(n, txt);
		if(mdl == null)mdl = new ModelChair();
		// TODO Auto-generated constructor stub
	}



}
