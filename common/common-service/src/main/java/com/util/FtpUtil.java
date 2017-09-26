package com.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

public class FtpUtil {
	
	public static boolean uploadPic(String host, int port, String username, String password, String basePath,
			String filePath, String filename, InputStream input){
		boolean result = false;
		FTPClient ftp = new FTPClient();
		
		try {
			int reply;
			ftp.connect(host,port);// 连接FTP服务器
			ftp.login(username, password);//登录
			reply = ftp.getReplyCode();
			if(!FTPReply.isPositiveCompletion(reply)){
				ftp.disconnect();
				return result;
			}
			if(!ftp.changeWorkingDirectory(basePath+filename)){
				ftp.changeWorkingDirectory("pic");
				String[] dirs = filePath.split("/");
				String temPath = basePath;
				for (String dir : dirs) {
					if(null == dir || "".equals(dir)) continue;
					temPath += "/"+dir;
					if(!ftp.changeWorkingDirectory(dir)){
						//System.out.println(": "+temPath);
						String[] rt=ftp.doCommandAsStrings("pwd","");  
						  for(int i=0;i<rt.length;i++){  
					            System.out.println(rt[i]);  
					        }  
						if(!ftp.makeDirectory(dir)){
							System.out.println("在目标服务器上建立了文件夹失败: "+dir);
							return result;
						}else{
							ftp.changeWorkingDirectory(dir);
						}
						
					}
				}
			}
			//设置上传类型为二进制
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			//上传
			if(!ftp.storeFile(filename, input)){
				return result;
			}
			input.close();
			ftp.logout();
			result = true;
			
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
		
		
		return result;
		
		
	}
	/** 
	 * Description: 从FTP服务器下载文件 
	 * @param host FTP服务器hostname 
	 * @param port FTP服务器端口 
	 * @param username FTP登录账号 
	 * @param password FTP登录密码 
	 * @param remotePath FTP服务器上的相对路径 
	 * @param fileName 要下载的文件名 
	 * @param localPath 下载后保存到本地的路径 
	 * @return 
	 */  
	public static boolean downloadFile(String host, int port, String username, String password, String remotePath,
			String fileName, String localPath) {
		boolean result = false;
		FTPClient ftp = new FTPClient();
		try {
			int reply;
			ftp.connect(host, port);
			// 如果采用默认端口，可以使用ftp.connect(host)的方式直接连接FTP服务器
			ftp.login(username, password);// 登录
			reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
				return result;
			}
			ftp.changeWorkingDirectory(remotePath);// 转移到FTP服务器目录
			FTPFile[] fs = ftp.listFiles();
			for (FTPFile ff : fs) {
				if (ff.getName().equals(fileName)) {
					File localFile = new File(localPath + "/" + ff.getName());

					OutputStream is = new FileOutputStream(localFile);
					ftp.retrieveFile(ff.getName(), is);
					is.close();
				}
			}

			ftp.logout();
			result = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ftp.isConnected()) {
				try {
					ftp.disconnect();
				} catch (IOException ioe) {
				}
			}
		}
		return result;
	}

}
