package com.util;

import java.io.IOException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

public class test {
	public static void main(String[] args) {
FTPClient ftp = new FTPClient();
		String filePath= "/2/2";
		try {
			int reply;
			ftp.connect("47.95.120.182",21);// 连接FTP服务器
			ftp.login("ftpUser", "1234");//登录
			reply = ftp.getReplyCode();
			
			ftp.changeWorkingDirectory("/home/images");// 转移到FTP服务器目录
			ftp.makeDirectory("pic/2017/09");
			FTPFile[] fs = ftp.listFiles();
			for (FTPFile ftpFile : fs) {
				 if(ftpFile.isFile()){  
	                   System.out.println(ftpFile.getName());
	                }  else{
	                	System.out.println(ftpFile.getName());
	                }
			}
			if(!FTPReply.isPositiveCompletion(reply)){
				ftp.disconnect();
				
			}
			if(!ftp.changeWorkingDirectory("/home/iamges/pic"+"/2")){
				//System.out.println("22222 ");
				String[] dirs = filePath.split("/");
				String temPath = "/home/iamges/pic";
				for (String dir : dirs) {
					if(null == dir || "".equals(dir)) continue;
					temPath += "/"+dir;
					if(!ftp.changeWorkingDirectory(temPath)){
						if(!ftp.makeDirectory(temPath)){
							System.out.println("在目标服务器上成功建立了文件夹: "+temPath);
							
						}else{
							ftp.changeWorkingDirectory(temPath);
						}
						
					}
				}
			}
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ftp.isConnected()){
				try {
					ftp.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
