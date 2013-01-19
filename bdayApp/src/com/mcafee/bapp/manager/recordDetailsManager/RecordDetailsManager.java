package com.mcafee.bapp.manager.recordDetailsManager;

import com.mcafee.bapp.manager.CommonBaseManager;
import com.mcafee.bapp.vo.BirthdayRecordVo;

public interface RecordDetailsManager extends CommonBaseManager{
	public void saveRecord(BirthdayRecordVo vo);
	public void deleteRecord(BirthdayRecordVo vo);
	public void updateRecord(BirthdayRecordVo vo);
}
