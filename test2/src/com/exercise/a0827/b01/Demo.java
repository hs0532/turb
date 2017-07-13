package com.exercise.a0827.b01;


import java.util.Properties;

public class Demo {
	public static void main(String[] args) {
		String s1 = "  北京    ";
		String ss1 = s1.trim(); //去掉字符前后的空格；
		System.out.println("s1=\""+s1+"\"ss1=\""+ss1+"\"");
		s1 = "I Love Java! I Love Beijing?";
		ss1 = s1.replace("Love","Dan");//替换所有的Love；
		System.out.println("s1=\""+s1+"\"ss1=\""+ss1+"\"");
		ss1 = String.valueOf(1.22f);//将给定的数据转换成字符串；
		System.out.println(ss1);
		s1 = "SDXSQWAAAFWFE";
		byte[] sca = s1.getBytes();
		for(int i = 0;i < sca.length;i++){
			System.out.print(sca[i]+"、");
		}
		System.out.println();
		char[] scc = s1.toCharArray();
		for (int i = 0; i < scc.length; i++) {
			System.out.print(scc[i]+"、");
		}
		System.out.println();
		
		
		double a = Math.pow(10.0,3.0);
		double num = 0.0;
		int c = 0;
		System.out.println(a);
		String strn = "2938360.2388";
		char[] sn = strn.toCharArray();
		System.out.println("=====");
		for (int i = sn.length-1, j = 0; i >= 0; i--) {
			if(sn[i] =='.'){
				c=sn.length-i;
				//j--;
			}
			else if(sn[i]== '0'){
				j++;
				System.out.println(0+"\t"+num+"\t"+Math.pow(10,j)*(double)(sn[i]-48));
			}
			else{
				num = num + Math.pow(10,j)*(sn[i]-48) ;
				System.out.println(sn[i]+"\t"+num+"\t"+Math.pow(10,j)*(double)(sn[i]-48));
				j++;
			}
				
		}
		System.out.println("==="); 
		System.out.println(c+"  "+String.format("%10.10f",num));
		System.out.println(String.format("%10.10f", Math.pow(10,-c)*num));
		double d1 = 10.0/3;
		int age = 2;
	
		
		System.out.println("默认格式age=" + age );
		
		System.out.printf("格式化为age=%3d \n" , age );  //3位显示数据
	
		System.out.println("默认格式d1=" + d1 ) ;
		System.out.printf("格式化为d1=%06.2f \n" , d1 ) ;
		System.out.printf("格式化为d1=%-6.2f \n" , d1 ) ;
		Properties pp = System.getProperties();
		
		
	
			System.out.println("Java 运行时环境版本 "+pp.getProperty("java.version"));
			System.out.println("Java 运行时环境供应商 "+pp.getProperty("java.vendor "));
			System.out.println("Java 供应商的 URL "+pp.getProperty("java.vendor.url"));
		
			System.out.println("Java 安装目录"+pp.getProperty("java.home"));  
			System.out.println("Java 虚拟机规范版本 "+pp.getProperty("java.vm.specification.version")); 
			System.out.println("Java 虚拟机规范供应商"+pp.getProperty("java.vm.specification.vendor ")); 
			
			System.out.println("Java 虚拟机规范名称"+pp.getProperty("java.vm.specification.name"));  
			System.out.println("Java 虚拟机实现版本 "+pp.getProperty("java.vm.version")); 
			System.out.println("Java 虚拟机实现供应商 "+pp.getProperty("java.vm.vendor")); 
			System.out.println("Java 虚拟机实现名称 "+pp.getProperty("java.vm.name")); 
			System.out.println("Java 运行时环境规范版本 "+pp.getProperty("java.specification.version")); 
			System.out.println("Java 运行时环境规范供应商 "+pp.getProperty("java.specification.vendor")); 
			System.out.println("Java 运行时环境规范名称 "+pp.getProperty("java.specification.name")); 
			System.out.println("Java 类格式版本号 "+pp.getProperty("java.class.version")); 
			System.out.println("Java 类路径 "+pp.getProperty("java.class.path")); 
			System.out.println("加载库时搜索的路径列表 "+pp.getProperty("java.library.path")); 
			System.out.println("默认的临时文件路径 "+pp.getProperty("java.io.tmpdir")); 
			System.out.println("要使用的 JIT 编译器的名称 "+pp.getProperty("java.compiler")); 
			System.out.println("一个或多个扩展目录的路径 "+pp.getProperty("java.ext.dirs")); 
			System.out.println("操作系统的名称 "+pp.getProperty("os.name")); 
			System.out.println("操作系统的架构 "+pp.getProperty("os.arch")); 
			System.out.println("操作系统的版本 "+pp.getProperty("os.version")); 
			System.out.println("文件分隔符（在 UNIX 系统中是“/”） "+pp.getProperty("file.separator")); 
			System.out.println("路径分隔符（在 UNIX 系统中是“:”） "+pp.getProperty("path.separator")); 
			System.out.println("行分隔符（在 UNIX 系统中是“/n”） "+pp.getProperty("line.separator")); 
			System.out.println("用户的账户名称"+pp.getProperty("user.name"));  
			System.out.println("用户的主目录 "+pp.getProperty("user.home")); 
			System.out.println(pp.getProperty("user.dir"));

			/**
			 * 键 相关值的描述 
			*/
	}

}
class A{
	
	static{
		a = 20;
		System.out.println("=======");
		System.out.println("=======");
	}
	public static int a;
}
