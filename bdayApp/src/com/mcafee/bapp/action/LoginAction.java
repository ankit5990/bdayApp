package com.mcafee.bapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mcafee.bapp.action.common.ActionConstants;
import com.mcafee.bapp.action.common.ActionUtilities;
import com.mcafee.bapp.common.CommonViewConstants;

public class LoginAction implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(ActionUtilities.isValidLogin(username, password)){
			ActionUtilities.addUserToSession(request, username);						
			return new ModelAndView(ActionConstants.REDIRECT+ActionConstants.HOME);
		}
		else{
			return new ModelAndView(ActionConstants.REDIRECT+ActionConstants.LOGIN_FAIL_REDIRECT);
		}
	}

}
