import java.io.*;
import java.util.*;

public class ReadDir {
	
	static void read_files()
	{		
		File dir = new File("H:\\RainTree_Test\\Dropbox\\QoS_logs\\Logs");
		
		File [] file_names = dir.listFiles();								//all file names stored in array
		int len= file_names.length;
//		System.out.println(len);
		for (File f : file_names) 											//loop from first to last file name
		{			
//			System.out.println(f);			
			try {	
					File f1= new File(f,"");
					Scanner sc= new Scanner(f1);							//one file open in 'sc' object
					Parse_file.compute(sc);									//call compute() from parse_file class to read the file contents
					sc.close();
				}			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}