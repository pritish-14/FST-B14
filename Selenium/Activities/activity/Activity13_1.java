package activity;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Activity13_1 {

	public static void main(String[] args) throws IOException, CsvException {
		
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\0022U6744\\IBM FST Projects\\Maven\\Selenium\\sample.csv"));
		
		List<String[]> allContent = reader.readAll();
		System.out.println("Total number of rows are: " + allContent.size());
		
		Iterator<String[]> itr = allContent.iterator();
		while (itr.hasNext()) {
			
			String[] str = itr.next();
			System.out.println("Values are : ");
			
			for(int i=0;i<str.length;i++) {
				System.out.println(" "+str[i]);
			}
			System.out.println(" ");
		}
		
		reader.close();
	}

}
