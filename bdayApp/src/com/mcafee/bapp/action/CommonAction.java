package com.mcafee.bapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mcafee.bapp.action.common.ActionConstants;
import com.mcafee.bapp.action.common.ActionUtilities;

public abstract class CommonAction implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {		
		if(ActionUtilities.isValidSession(request)){
			ModelAndView result = executeHandleRequest(request,response);
			return result;
		}
		ActionUtilities.markLoginFailed(request);
		return new ModelAndView(ActionConstants.FORWARD+ActionConstants.INDEX_JSP);
	}

	protected abstract ModelAndView executeHandleRequest(HttpServletRequest request,
			HttpServletResponse response);

}
