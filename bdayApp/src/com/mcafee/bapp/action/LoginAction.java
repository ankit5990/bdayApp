package com.mcafee.bapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mcafee.bapp.action.common.ActionConstants;
import com.mcafee.bapp.action.common.ActionUtilities;
import com.mcafee.bapp.common.CommonUtilities;
import com.mcafee.bapp.common.CommonViewConstants;

public class LoginAction implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		if(ActionUtilities.noLoginExists(request)){
			return new ModelAndView(ActionConstants.REDIRECT+ActionConstants.INDEX_JSP);
		}
		if(ActionUtilities.isValidLoginPresent(request)){
			return new ModelAndView(ActionConstants.REDIRECT+ActionConstants.HOME);
		}
		String username = request.getParameter(CommonViewConstants.usernameParam);
		String password = request.getParameter(CommonViewConstants.passwordParam);
		if(CommonUtilities.nullOrEmpty(password) && CommonUtilities.nullOrEmpty(username)){
			return new ModelAndView(ActionConstants.REDIRECT+ActionConstants.INDEX_JSP);
		}
		if(ActionUtilities.isValidLogin(username, password)){
			ActionUtilities.addUserToNewSession(request, username);						
			return new ModelAndView(ActionConstants.REDIRECT+ActionConstants.HOME);
		}
		else{
			return new ModelAndView(ActionConstants.REDIRECT+ActionConstants.LOGIN_FAIL_REDIRECT);
		}
	}

}
