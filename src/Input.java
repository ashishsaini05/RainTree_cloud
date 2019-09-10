import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.*;

public class Input {
	
	static MonthDay start_date;
	static MonthDay end_date;
	static int input()
	{
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd");
		System.out.println("Enter starting and ending date in [MM/DD] format: ");
		try
		{
			start_date= MonthDay.parse(sc.next(), dtf);
			end_date= MonthDay.parse(sc.next(), dtf);
			System.out.println(start_date.format(dtf));
			if(start_date.isBefore(end_date))
			{
				System.out.println("Dates: "+start_date+" "+end_date);
				return 1;
			}
			else 
				return 0;
//			System.out.println(start_date);
//			System.out.println(end_date);
		}
		catch (DateTimeException e)
		{
			System.out.println("Invalid date format." +e);
		}
		return 0;
		
	}

}
