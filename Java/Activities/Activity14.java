package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) {
		
		try {
			File txtFile = new File("C:\\Users\\0022U6744\\IBM FST Projects\\Java\\newfile.txt");
			boolean fStatus = txtFile.createNewFile();
			if(fStatus)
				System.out.println("File created successfully");
			else
				System.out.println("File already exists at this path.");
			
			File fileUtil = FileUtils.getFile("C:\\Users\\0022U6744\\IBM FST Projects\\Java\\newfile.txt");
			System.out.println("Data in the file is : " + FileUtils.readFileToString(fileUtil, "UTF8"));
			
			File destDir = new File("resources");
			FileUtils.copyFileToDirectory(txtFile, destDir);
			
			File newFile = FileUtils.getFile(destDir, "newfile.txt");
			String newFileData = FileUtils.readFileToString(newFile, "UTF8");
			
		} catch(IOException errMessage) {
            System.out.println(errMessage);
        }

	}

}
