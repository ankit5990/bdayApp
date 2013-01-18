package com.mcafee.bapp.action.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.mcafee.bapp.common.CommonConstants;
import com.mcafee.bapp.common.CommonViewConstants;

public class ActionUtilities {
	public static void addUserToSession(HttpServletRequest request,String username){
		HttpSession session = request.getSession();
		session.setAttribute(ActionConstants.USER_NAME_SESSION_PARAM, username);
	}
	
	public static boolean isValidLogin(String userName, String password){
		return (CommonConstants.ADMIN.equals(userName) && CommonConstants.ADMIN_PW.equals(password));
	}
	
	public static void markLoginFailed(HttpServletRequest request){
		request.setAttribute(CommonViewConstants.LOGIN_FAIL, ActionConstants.LOGIN_FAIL_TRUE);		
	}

	public static boolean isValidSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String user = (String) session.getAttribute(ActionConstants.USER_NAME_SESSION_PARAM);		
		return isValidUser(user);
	}

	private static boolean isValidUser(String user) {		
		return CommonConstants.ADMIN.equals(user);
	}
}
