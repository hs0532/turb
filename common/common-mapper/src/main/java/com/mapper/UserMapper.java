package com.mapper;

import java.util.List;

import com.pojo.User_table;

public interface UserMapper {
	int delete(String name);
	List<User_table> selectAll();
	int update(User_table user);
	List<User_table> finduser(String name);


}
