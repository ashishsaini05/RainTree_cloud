import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Input {
	static Date start_date;
	static Date end_date;
	static void input()
	{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd");
		System.out.println("Enter starting and ending date in [MM/DD] format: ");
		try {
			start_date= sdf.parse(sc.next());
			end_date= sdf.parse(sc.next());
//			System.out.println(start_date);
//			System.out.println(end_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("Enter ending date in [MM/DD] format: ");
//		end_date=sc.next();
		
	}

}
