package com.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

public class test {
	
 
    public static int digui(int n){  
        if(n==1||n==0){  
            return n;  
        }else{  
            System.out.println("执行第" + n + "次");  
            return n*digui(n-1);  
        }  
    }  
	public static void main (String[] args){  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");   
		Calendar cl = Calendar.getInstance(); 
		cl.setTime(new Date());
		int N_year = cl.get(Calendar.YEAR);
		int N_month = cl.get(Calendar.MONTH);
		System.out.println(N_year+"年"+N_month+"月");
		String a="我是好人";
		System.out.println(a.length());
	}  
}
