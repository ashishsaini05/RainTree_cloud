import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.*;

/*
Take a single file as input from 
Read_dir class and parse it by reading
each line as an 'entry' and tokenizing it
to extract date and categorize the entry accordingly.
*/
public class Parse_file
{

	static void compute(Scanner s)
	{
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd");
		MonthDay current_date;
		MonthDay start_date= Input.start_date;	//shift to one day before start date
		MonthDay end_date= Input.end_date;		//shift to one day after end date
		while(s.hasNext())														//check if more data is available for parsing
		{	String entry = s.nextLine();										//read an entry
			StringTokenizer token_one= new StringTokenizer(entry,"|");			//tokenize to separate date and other fields
			
			while(token_one.hasMoreTokens())
			{	token_one.nextToken();											//skip the first token that has name data
				String date= token_one.nextToken().trim();
				date= date.substring(1, 6);										//extract the MM/dd from date token
				current_date= MonthDay.parse(date, dtf);
				if((current_date.isAfter(start_date) || current_date.equals(start_date)) && (current_date.isBefore(end_date) || current_date.equals(end_date)))
				{
					Category.assign(entry);
				}
				token_one.nextToken();											//skip the last token that has error data
			}
		}
	}
}