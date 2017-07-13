package exercise.a808.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class filetest2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		String newPath = "new\\new";
		String name = "good";
		File f1 = new File(newPath,name);
		if(f1.exists()){
			System.out.println(name+"该文件大小为："+f1.length()+"字节。");
			System.out.println("该文件绝对路径："+f1.getAbsolutePath());
		}else{
			f1.getParentFile().mkdirs();
			System.out.println("已创建目录："+newPath);
			try {
				f1.createNewFile();
				System.out.println("文件创建成功！");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("文件创建失败。");
			}
			
		}
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(f1.getAbsoluteFile());
			
				int x = fs.read();
				while(0<x&&x<65535){
					System.out.print((char)x);
					x = fs.read();
				}
			}  catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
			}finally{
				if(fs != null)
					try {
						fs.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		
	}
}
