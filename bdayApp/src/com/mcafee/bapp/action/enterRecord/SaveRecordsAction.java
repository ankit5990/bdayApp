package com.mcafee.bapp.action.enterRecord;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.mcafee.bapp.action.CommonAction;
import com.mcafee.bapp.manager.recordDetailsManager.RecordDetailsManager;
import com.mcafee.bapp.vo.BirthdayRecordVo;

public class SaveRecordsAction extends CommonAction{
	RecordDetailsManager manager;
	
	public RecordDetailsManager getManager() {
		return manager;
	}

	public void setManager(RecordDetailsManager manager) {
		this.manager = manager;
	}

	@Override
	protected ModelAndView executeHandleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String personName = request.getParameter("personname");
		String bdate = request.getParameter("bdate");
		String email = request.getParameter("email");
		Date date;
		int[] groups = {1,2};		
		try {
			date = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse(bdate);
		} catch (ParseException e) {		
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		BirthdayRecordVo vo = new BirthdayRecordVo();
		vo.setBday(date);
		vo.setEmail(email);
		vo.setEmailGroups(groups); // TODO: set correct implementation 
		vo.setName(personName);
		vo.setUserId(1); // TODO: set correct implementation
		manager.saveRecord(vo);
		return null;
	}

}
