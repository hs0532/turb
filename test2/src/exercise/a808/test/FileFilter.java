package exercise.a808.test;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter{
	private String ext;
	public FileFilter(String ext) {
		// TODO Auto-generated constructor stub
		this.ext = ext;
	}
	@Override
	public boolean accept(File dir, String name) {
		name = name.toLowerCase();
		ext.toLowerCase();
		if(name.endsWith(ext))
			return true;
		else
			return false;
	}
}
