package com.mcafee.bapp.dao.userDetailsDao;

import com.mcafee.bapp.dao.CommonBaseDao;
import com.mcafee.bapp.vo.BirthdayRecordVo;

public interface RecordDetailsDao extends CommonBaseDao{
	public void saveRecord(BirthdayRecordVo vo);
	public void deleteRecord(BirthdayRecordVo vo);
	public void updateRecord(BirthdayRecordVo vo);
}
