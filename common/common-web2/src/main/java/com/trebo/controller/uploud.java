package com.trebo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.druid.support.json.JSONUtils;
import com.service.ImageService;

@Controller
@RequestMapping("/uploud")
public class uploud {

	@Autowired
	private ImageService service;
	
	@RequestMapping("pic")
	@ResponseBody
	public String uploud( MultipartFile file){
		String res = service.addPic(file);
		String json = JSONUtils.toJSONString(res);
		
		return json;
	}
	@RequestMapping("/jsp")
	public String getJsp(){
		return "uploud";
	}
	
}
