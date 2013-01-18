package com.mcafee.bapp.action.homeActions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.mcafee.bapp.action.CommonAction;
import com.mcafee.bapp.action.common.ActionConstants;

public class EnterRecordPage extends CommonAction{

	@Override
	protected ModelAndView executeHandleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		return new ModelAndView(ActionConstants.FORWARD+ActionConstants.ENTER_DETAILS_JSP);
	}

}
