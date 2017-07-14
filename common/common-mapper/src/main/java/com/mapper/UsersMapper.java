package com.mapper;


import com.pojo.User;



public interface UsersMapper {
	User finduser(String name);
	void insert(User user);
	

}
