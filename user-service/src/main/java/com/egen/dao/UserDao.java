package com.egen.dao;

import java.util.List;

import com.egen.entities.UserEntity;

public interface UserDao {
	public boolean createUser(UserEntity user) throws Exception;

	public List<UserEntity> getAllUsers() throws Exception;

	public boolean updateUser(UserEntity user) throws Exception;
}
