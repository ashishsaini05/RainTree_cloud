import java.text.SimpleDateFormat;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class parse_file {

	static void compute(Scanner s)
	{
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd");
		MonthDay current_date;
		MonthDay start_date= Input.start_date;
		while(s.hasNext())														//check if more data is available for parsing
		{	String entry = s.nextLine();										//read an entry
			StringTokenizer token_one= new StringTokenizer(entry,"|");			//tokenize to separate date and other fields
			
			while(token_one.hasMoreTokens())
			{	token_one.nextToken();											//skip the first token that has name data
				String date= token_one.nextToken().trim();
				date= date.substring(1, 6);										//extract the MM/dd from date token
				current_date= MonthDay.parse(date, dtf);
				if(current_date.isAfter(()) && current_date.isBefore(Input.end_date.withDayOfMonth(Input.end_date.getDayOfMonth()+1)))
				System.out.println(current_date.format(dtf));
				token_one.nextToken();											//skip the last token that has error data
			}
		}
	}
}