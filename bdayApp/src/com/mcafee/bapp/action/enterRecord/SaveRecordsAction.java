package com.mcafee.bapp.action.enterRecord;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.mcafee.bapp.action.CommonAction;
import com.mcafee.bapp.dao.CommonBaseDao;
import com.sample.vo.SampleVo;

public class SaveRecordsAction extends CommonAction{
	CommonBaseDao dao;
	
	public CommonBaseDao getDao() {
		return dao;
	}

	public void setDao(CommonBaseDao dao) {
		this.dao = dao;
	}

	@Override
	protected ModelAndView executeHandleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String personName = request.getParameter("personname");
		String bdate = request.getParameter("bdate");
		String email = request.getParameter("email");
		Date date;
		int[] groups = null;
		try {
			date = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse(bdate);
		} catch (ParseException e) {		
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		SampleVo vo = new SampleVo(personName,date,email,groups);
		dao.insert(vo);
		return null;
	}

}
