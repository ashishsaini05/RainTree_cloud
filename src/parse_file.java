import java.text.SimpleDateFormat;
import java.util.*;
public class parse_file {

	static void compute(Scanner s)
	{
		SimpleDateFormat sdf1= new SimpleDateFormat("MM/dd");
		while(s.hasNext())														//check if more data is available for parsing
		{	String entry = s.nextLine();										//read an entry
			StringTokenizer token_one= new StringTokenizer(entry,"|");			//tokenize to separate date and other fields
			while(token_one.hasMoreTokens())
			{	token_one.nextToken();
				String current_date= token_one.nextToken().trim();
				
//				String str;
//				for(int i=1;i<=3;i++)
//				{	str=token_one.nextToken().trim();
//					if(i==2)													//pick up date field (2nd token in every row) 
//					{	
//						System.out.println(str);
//						
//					}
//				}
			}
		}
	}
}