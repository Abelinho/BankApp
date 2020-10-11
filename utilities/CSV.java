package bankaccountapp.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV {
	
	//this method reads data from a file, saves it in a List, and returns the List.
	public static List<String[]> read(String file) {
		
		List<String[]> data = new ArrayList<String[]>();//create a List for storing your account data
		String dataRow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((dataRow = br.readLine())!= null){
								
			String[] dataRecords = dataRow.split(",");
			
			data.add(dataRecords);  
			
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not find File");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not read File");
			e.printStackTrace();
		} 
		
		
		return data;
		
	}
	
	
}
