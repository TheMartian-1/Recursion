import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileSize {

	public static long getSize(File file) {
		long size = 0;
		// if file => get size
		// if directory => get all files
		// 
		if( file.isDirectory()) {
			File[] files = file.listFiles();
			
			/*
			 * Dr.j's way
			List<File> xFiles = new LinkedList<>(Arrays.asList(files)));
				for( File f: xFiles) {
					size += getSize(f);
				}
			*/
			for(int i = 0; i < files.length; i++) {
				size = size + getSize(files[i]);
			}
		}
		
		if(!file.isDirectory()) {
			//size = size + file.getTotalSpace();
			size = size + file.length();
		}
		return size;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input directory or file");
		String  str = input.nextLine();
		System.out.println("The size is: " + getSize(new File(str)) );
	}
}
