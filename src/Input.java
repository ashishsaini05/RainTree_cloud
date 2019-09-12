import java.time.DateTimeException;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Input {
	
	static MonthDay start_date;
	static MonthDay end_date;
	static String A_dis[][]=new String[2000][2];
	static int pos_dis=-1;
	static String A_drop[][]=new String[2000][2];
	static int pos_drop=-1;
	static String A_avg[][]=new String[2000][2];
	static int pos_avg=-1;
	static int input()
	{		
		Scanner sc = new Scanner(System.in);
		int flag;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd");
		System.out.println("Enter starting and ending date in [MM/DD] format WITHOUT YEAR: ");
		try
		{
			start_date= MonthDay.parse(sc.next(), dtf);
			end_date= MonthDay.parse(sc.next(), dtf);
			if(start_date.isBefore(end_date) || start_date.equals(end_date))
			{
				flag= 1;
			}
			else 
			{
				flag= 2;
			}
			sc.close();
			return flag;
		}
		catch (DateTimeException e)
		{
			System.out.println("Invalid date format. " +e);
		}
		return 0;
		
	}

}
