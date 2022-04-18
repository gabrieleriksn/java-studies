package studies;

import java.util.Scanner;
import java.io.File;

public class ManipulandoPastasComFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println();
		
		System.out.println("FOLDERS:");
		File[] folders = path.listFiles(File::isDirectory);
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		
		System.out.println("FILES:");
		File[] files = path.listFiles(File::isFile);
		
		for (File file : files) {
			System.out.println(file);
		} 
		
		// boolean success = new File(strPath + "\\subdir").mkdir();
		
		sc.close();
	}

}
