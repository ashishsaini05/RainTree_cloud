import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;

public class Print 
{
	static void print()
	{
		try {
			DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd");
			File f= new File("Report.txt");
			PrintWriter pw= new PrintWriter(f);
			pw.println("Date: "+ Input.start_date.format(dtf) + " to " + Input.end_date.format(dtf));
			pw.println("\nCOMPUTER NAME\t\tNO. OF DISCONNECTS\n");
			for(int i=0;i<Input.pos_dis+1;i++) {
				pw.println(Input.A_dis[i][0]+"\t\t"+Input.A_dis[i][1]);
			}
			pw.println("\nCOMPUTER NAME\t\tNO. OF DROPS\n");
			for(int i=0;i<Input.pos_drop+1;i++) {
				pw.println(Input.A_drop[i][0]+"\t\t"+Input.A_drop[i][1]);
			}
			pw.println("\nCOMPUTER NAME\t\tNO. OF AVG LIMIT EXCEEDED\n");
			for(int i=0;i<Input.pos_avg+1;i++) {
				pw.println(Input.A_avg[i][0]+"\t\t"+Input.A_avg[i][1]);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
