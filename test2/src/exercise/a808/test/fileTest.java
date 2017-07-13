package exercise.a808.test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileTest {
	public static void main(String[] args) {
		
	
//			@SuppressWarnings("unused")
//			String workPath = System.getProperty("user.dir");
			String path = "new\\new1";
//			String name = "text2";
//			File f = new File(path,name);
//			if(f.exists()){
//				System.out.println("文件路径："+f.getAbsolutePath());
//			}else{
//				f.getParentFile().mkdirs(); //创建一系列目录(即: 让父目录和父目录的父目录同时创建。)
//				
//				System.out.println("已在当前用户工作位置下创建了一系列目录为: " + path );
//				
//				try {
//					//创建 MyFile.txt文件 
//					f.createNewFile();
//					
//					System. out.println( name + " 文件创建成功！");
//				} catch (IOException e) {
//					System.out.println("创建 " + name + " 文件 失败了。 ");
//				}
			path = "e:\\ee.txt";
			FileInputStream txt = null;
			try {
				txt = new FileInputStream(path);
				
					int x = txt.read();
					while(x >= 0 && x <= 65535){
						System.out.print((char)x);
						x = txt.read();
					}
					
				} 
				
			 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				System.out.println("我这儿执行了。");
				if( txt != null ){ 
					try {
						txt.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		
	}
}
