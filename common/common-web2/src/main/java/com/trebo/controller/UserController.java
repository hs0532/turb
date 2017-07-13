package com.trebo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONUtils;
import com.pojo.User_table;
import com.service.User_service;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private User_service service;
	
	@RequestMapping("/list")
	public String user(Model model){
		System.out.println("用户列表如下：");
		List<User_table> users =  service.getUser();
		for (User_table user_table : users) {
			String userStr = user_table.toString();
			System.out.println(userStr);
		}
		model.addAttribute("user",users);
		return "index";
	}
	@RequestMapping("image")
	public String image(){
		return "pic";
	}
	@RequestMapping("ajax")
	@ResponseBody
	public List<User_table>  ajax(String uname){
		System.out.println(uname);
		List<User_table>  user =  null;
		if(!"".equals(uname)&&uname!=null){
			user =  service.selectUser(uname);
		}
		System.out.println(user.toString());
		return user;
		
		
		
	}
	
	
	

}

