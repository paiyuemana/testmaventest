package testmaventest;

import java.io.File;

public class path {
	public static void main(String args[]){
		File file=new File("/home/cookieid");
		File[] files=file.listFiles();
		System.out.println(files[0].getAbsolutePath());
		System.out.println(files[0].getParent());
	}
}
