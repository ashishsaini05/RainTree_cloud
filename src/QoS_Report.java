import java.util.*;
import java.io.*;

public class QoS_Report 
{	
	public static void main(String[] args) {
		
		int i=Input.input();
		if(i==1)
		{
			System.out.println("yes.");
			ReadDir.read_files();
		}
		else
		{
			System.out.println("Ending date cannot be smaller than Starting date.\nTerminating.");
			System.exit(0);
		}
//		ReadDir.read_files();
//		int a=10;
	}
}
