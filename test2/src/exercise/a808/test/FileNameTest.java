package exercise.a808.test;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class FileNameTest {
	public static void main(String[] args) {
		
	
		String path =input("请输入文件夹路径：>>>>[e:\\windows]");
		String ext =input("请输入文件类型：>>>>>[exe]");
		FileFilter ff = new FileFilter(ext);
		File file = new File(path);
		String[] str = file.list(ff);
		System.out.printf("\t\t%1$s\t\t\t%2$s\t%3$s\t%4$s","文件名","文件大小","类型","最后修改时间");
		System.out.println("\n========================================================================");
		int leng = 0;
		for (String tem : str) {
			File fs = new File(path,tem);
			long modtime= fs.lastModified();
			Date t = new Date(modtime);
			long len = fs.length();
			System.out.printf("%1$25s\t%2$15s\t<文件>\t%3$tF  %3$tA\n",fs.getName(),len,t);
			leng += len;
		}
		System.out.println("========================================================================="
		+"\n\t\t总大小为："+leng+"字节");
	}
	public static String input(String uft){
		System.out.println(uft);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.next();
	} 
}
