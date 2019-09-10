import java.util.*;
public class parse_file {

	static void compute(Scanner s)
	{
		while(s.hasNext())														//check if more data is available for parsing
		{	String entry = s.nextLine();
			StringTokenizer token_one= new StringTokenizer(entry,"|");			//tokenize to separate date and other fields
			while(token_one.hasMoreTokens())
			{	String str;
				for(int i=1;i<=3;i++)
				{	str=token_one.nextToken().trim();
					if(i==2)													//pick up date field (2nd token in every row) 
					{	
						System.out.println(str);
						int a;
					}
				}
			}
		}
	}
}