package com.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.User_table;
@Service
public class User_service {
	@Autowired
	private UserMapper mapper;
	
	public List<User_table> getUser(){
		return mapper.selectAll();
	}
	public List<User_table>  selectUser(String name){
		return mapper.finduser(name);
	}
	

}

