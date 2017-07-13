package com.service;

import java.io.IOException;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mapper.picMapper;
import com.pojo.picpojo;
import com.util.FtpUtil;

@Service
public class ImageService {
	
	final String host = "127.0.0.1";
	final int port = 21;
	final String username = "to";
	final String password = "zxc123456";
	final String basePath = "/pic";
	

	@Autowired
	private picMapper mapper;

	public String addPic(MultipartFile file) {
		String originalFilename = file.getOriginalFilename();
		String suffix = originalFilename.substring(originalFilename.indexOf("."));
		
		DateTime dateTime = new DateTime();
		int nameBir = (int) (Math.random()*10000);
		String name = dateTime.toString("yyyyMMdd")+nameBir;
		String filePath = dateTime.toString("/yyyy/MM/dd");
		try {
			FtpUtil.uploadPic(host, port, username, password, basePath, filePath, name+suffix, file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = basePath+filePath+"/"+name+suffix;
		System.out.println(url);
		picpojo poji = new picpojo();
		poji.setName(name);
		poji.setUrl(url);
		mapper.insertPic(poji);
		return "成功";
	}
	
	public picpojo lookPic(String name){
		return mapper.selectPic(name);
	}
	
	

}
