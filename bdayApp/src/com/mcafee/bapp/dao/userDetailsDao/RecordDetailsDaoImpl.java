package com.mcafee.bapp.dao.userDetailsDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mcafee.bapp.vo.BirthdayRecordVo;

public class RecordDetailsDaoImpl implements RecordDetailsDao{
	SessionFactory sessionFactory;
	
	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;		
	}

	@Override
	public void saveRecord(BirthdayRecordVo vo) {
		Session session = getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try{
			session.save(vo);
			tx.commit();
		}catch(Throwable e){
			tx.rollback();			
		}finally{
			session.flush();
			session.close();
		}
	}

	@Override
	public void deleteRecord(BirthdayRecordVo vo) {
		Session session = getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try{
			session.delete(vo);
			tx.commit();
		}catch(Throwable e){
			tx.rollback();			
		}finally{
			session.flush();
			session.close();
		}
	}

	@Override
	public void updateRecord(BirthdayRecordVo vo) {
		Session session = getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try{
			session.update(vo);
			tx.commit();
		}catch(Throwable e){
			tx.rollback();			
		}finally{
			session.flush();
			session.close();
		}	
	}

}
