package com.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class Pic_service {

	public String uploud( MultipartFile file){
		String path = "common-web2/src/main/webapp/WEB-INF/jsp/pic.jpg";
		File f = new File(path);
		OutputStream os = null;
		InputStream is = null;
		byte[] bs = new byte[2048];  //2048Byte---> 2KB
		try{
			is = file.getInputStream();
			os = new FileOutputStream(f);
			int x = is.read(bs);
			while(x!=-1){
				os.write(bs, 0, x);
				x = is.read(bs);
			}
			os.flush();
			
			System.out.println("文件写入成功"+f.getAbsolutePath());
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(is !=null){
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(os !=null){
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return "上传成功";
	}
}
