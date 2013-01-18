package com.mcafee.bapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mcafee.bapp.action.common.ActionConstants;
import com.mcafee.bapp.action.common.ActionUtilities;

public class LoginFailForward implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ActionUtilities.markLoginFailed(request);
		return new ModelAndView(ActionConstants.FORWARD+ActionConstants.INDEX_JSP);
	}

}
