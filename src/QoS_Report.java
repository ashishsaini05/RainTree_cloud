
public class QoS_Report 
{	
	public static void main(String[] args) 
	{
		
		int flag=Input.input();
		if(flag==1)
		{
			ReadDir.read_files();
			Print.print();
			System.out.println("Report generated.");
		}
		else if(flag==2)
		{
			System.out.println("Ending date cannot be smaller than Starting date.\nTerminating.");
			System.exit(0);
		}
		else
		{
			System.out.println("Terminating.");
			System.exit(0);
		}
	}
	
}
