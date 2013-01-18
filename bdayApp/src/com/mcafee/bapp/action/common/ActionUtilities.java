package com.mcafee.bapp.action.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ActionUtilities {
	public static void addUserToSession(HttpServletRequest request,String username){
		HttpSession session = request.getSession();
		session.setAttribute(ActionConstants.USER_NAME_SESSION_PARAM, username);
	}
	
	public static boolean isValidLogin(String userName, String password){
		return ("admin".equals(userName) && "solidcore".equals(password));
	}
}
