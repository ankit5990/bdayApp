package com.mcafee.bapp.dao;

import org.hibernate.SessionFactory;

public interface CommonBaseDao {
	public SessionFactory getSessionFactory();
	public void setSessionFactory(SessionFactory sessionFactory);
}
