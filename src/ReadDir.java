import java.io.*;
import java.util.*;
/*
Read files in the given directory
one after the other and send each file
to Parse_file for parsing.
*/
public class ReadDir {
	
	static void read_files()
	{		
		File dir = new File("Logs");
		
		File [] file_names = dir.listFiles();
		for (File f : file_names) 											//loop from first to last file name
		{					
			try {	
					File f1= new File(f,"");
					Scanner sc= new Scanner(f1);							//one file open in 'sc' object
					Parse_file.compute(sc);									//call compute() from parse_file class to read the file contents
					sc.close();
				}			
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
}