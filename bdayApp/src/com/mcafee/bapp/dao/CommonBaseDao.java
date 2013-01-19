package com.mcafee.bapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sample.vo.SampleVo;

public class CommonBaseDao {
 	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void insert(SampleVo vo){		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try{
			session.saveOrUpdate(vo);
		}catch(RuntimeException e){
			tx.rollback();
			throw e;
		}		
		finally{
			tx.commit();
			session.flush();
			session.close();
		}
	}
}
