package com.mcafee.bapp.manager.recordDetailsManager;

import com.mcafee.bapp.dao.userDetailsDao.RecordDetailsDao;
import com.mcafee.bapp.vo.BirthdayRecordVo;

public class RecordDetailsManagerImpl implements RecordDetailsManager{
	RecordDetailsDao recordDetailsDao;
	
	public RecordDetailsDao getRecordDetailsDao() {
		return recordDetailsDao;
	}

	public void setRecordDetailsDao(RecordDetailsDao recordDetailsDao) {
		this.recordDetailsDao = recordDetailsDao;
	}

	@Override
	public void saveRecord(BirthdayRecordVo vo) {
		recordDetailsDao.saveRecord(vo);
	}

	@Override
	public void deleteRecord(BirthdayRecordVo vo) {
		recordDetailsDao.deleteRecord(vo);
	}

	@Override
	public void updateRecord(BirthdayRecordVo vo) {
		recordDetailsDao.updateRecord(vo);
	}

}
