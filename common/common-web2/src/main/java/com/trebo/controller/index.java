package com.trebo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.obj.User;
import com.service.UserService;

public class index extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String password = req.getParameter("pass");
		User user = UserService.selectAll(name);
		String error= "";
		if(user.getName()!=null){
			if(password.equals(String.valueOf(user.getAge()))){
				error="登录成功";
			}else{
				error="密码错误";
			}
		}else{
			error="用户名不存在";
		}
		req.setAttribute("error", error);
		req.getRequestDispatcher("index.jsp").forward(req, res);
		
	}

}
