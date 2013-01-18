package com.mcafee.bapp.common;

public class CommonUtilities {
	public static boolean nullOrEmpty(String string){
		if(string == null){
			return true;
		}
		if("".equals(string)){
			return true;
		}
		return false;
	}
}
