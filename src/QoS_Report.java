/*
Main class where control enters the program.
First, user input is taken by calling the Input class.
Then Read_dir class is called to read files and parse them.
Finally, the evaluated data is output to a file through Print class.
*/
public class QoS_Report 
{	
	public static void main(String[] args) 
	{
		
		int flag=Input.input();
		if(flag==1)														//if user entered valid dates, proceed.
		{
			ReadDir.read_files();
			Print.print();
			System.out.println("Report generated.");
		}
		else if(flag==2)												//if entered dates are valid but ending date is larger, terminate.
		{
			System.out.println("Ending date cannot be smaller than Starting date.\nTerminating.");
			System.exit(0);
		}
		else 															//if entered dates are invalid, terminate.
		{
			System.out.println("Terminating.");
			System.exit(0);
		}
	}
	
}
