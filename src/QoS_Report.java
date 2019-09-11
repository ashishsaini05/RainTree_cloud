import java.util.*;
import java.io.*;

public class QoS_Report 
{	
	public static void main(String[] args) 
	{
		
		int i=Input.input();
		if(i==1)
		{
//			System.out.println("yes.");
			ReadDir.read_files();
			print();
			System.out.println("yes.");
		}
		else
		{
			System.out.println("Ending date cannot be smaller than Starting date.\nTerminating.");
			System.exit(0);
		}
//		ReadDir.read_files();
//		int a=10;
	}
	static void print()
	{
		try {
			File f= new File("Report.txt");
			PrintWriter pw= new PrintWriter(f);
			pw.println("\nDisconnected:\n");
			for(int i=0;i<Input.pos_dis+1;i++) {
				pw.println(Input.A_dis[i][0]+"\t"+Input.A_dis[i][1]);
			}
			pw.println("\nDropped:\n");
			for(int i=0;i<Input.pos_drop+1;i++) {
				pw.println(Input.A_drop[i][0]+"\t"+Input.A_drop[i][1]);
			}
			pw.println("\nAverage:\n");
			for(int i=0;i<Input.pos_avg+1;i++) {
				pw.println(Input.A_avg[i][0]+"\t"+Input.A_avg[i][1]);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
