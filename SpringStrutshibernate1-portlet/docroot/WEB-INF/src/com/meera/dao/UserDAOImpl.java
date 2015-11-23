package com.meera.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.meera.domain.User;
import com.meera.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) 
    {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}
	public List<User> listUser(){
		List<User> list=null;
		Query queryResult =sessionFactory.getCurrentSession().createQuery("from user");  
		list =queryResult.list(); 
		return list;
	}
}