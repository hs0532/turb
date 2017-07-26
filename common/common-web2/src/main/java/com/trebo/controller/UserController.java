package com.trebo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONUtils;
import com.pojo.User;
import com.pojo.User_table;
import com.pojo.picpojo;
import com.service.ImageService;
import com.service.User_service;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private User_service service;
	
	@Autowired
	private ImageService picservice;

	@RequestMapping("/list")
	public String user(Model model) {
		System.out.println("用户遍历信息如下：");
		List<User_table> users = service.getUser();
		for (User_table user_table : users) {
			String userStr = user_table.toString();
			System.out.println(userStr);
		}
		model.addAttribute("user", users);
		return "index";
	}

	@RequestMapping("image")
	public String image() {
		return "pic";
	}

	@RequestMapping("/allImage")
	@ResponseBody
	public List<picpojo> allImage(){
		return picservice.allImage();
	}
	
	@RequestMapping("ajax")
	@ResponseBody
	public List<User_table> ajax(String uname) {
		System.out.println(uname);
		List<User_table> user = null;
		if (!"".equals(uname) && uname != null) {
			user = service.selectUser(uname);
		}
		System.out.println(user.toString());
		return user;

	}

	@RequestMapping("/checklogin")
	@ResponseBody
	public String check(String username,String password){
		User user  = service.checkUser(username);
		String is = "faild";
		
		if(user!=null&&password.equals(user.getpassword())){
			is = "seccuss";
			System.out.println(user.toString()+"++++"+username);
		}
		return is;
	}
	@RequestMapping(value="/checkUsername/{username}",method=RequestMethod.POST)
	@ResponseBody
	public String checkUsername(@PathVariable String username){
		User user  = service.checkUser(username);
		String is = "fails";
		if(user==null){
			is = "success";
		}
		System.out.println("验证步骤");
		return is;
	}
	
	@RequestMapping(value= "userRegister",method=RequestMethod.POST)
	@ResponseBody
	public String check(User user){
		System.out.println(user.toString());
		return service.addUser(user);
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/register")
	public String tegister() {
		return "register";
	}

}
