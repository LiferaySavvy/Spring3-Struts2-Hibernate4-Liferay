package com.meera.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.meera.domain.User;

public interface UserDAO {
	@Transactional
	public void saveUser(User user) ;
	@Transactional
	public List<User> listUser() ;
}