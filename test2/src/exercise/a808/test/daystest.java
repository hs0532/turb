package exercise.a808.test;

import java.io.File;
import java.util.Date;

public class daystest {
	public static void main(String[] args) {
		System.out.printf("%tF",new Date());
		System.out.println();
		String path = "E:\\";
		File fs = new File(path);
		String[] fss = fs.list();
		for (String file : fss) {
			File f2 = new File( path + file );
			long time = f2.lastModified();
			Date t = new Date(time);
			System.out.printf("%1$tY\\%1$tm\\%1$td \t %1$tT \t%2$s  \n",t,file);
		}
			
	}
}
