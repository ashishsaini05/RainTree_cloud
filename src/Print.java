import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
/*
Sequentially printing the stored arrays to a text file,
in formatted order, for report generation.
*/
public class Print 
{
	static void print()
	{
		try {
			DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd");
			File f= new File("Report.txt");															//create new file named report.txt in root directory
			PrintWriter pw= new PrintWriter(f);
			pw.println("Date: "+ Input.start_date.format(dtf) + " to " + Input.end_date.format(dtf));
			pw.printf("\n%-30s%s\n","COMPUTER NAME","NO. OF DISCONNECTS");
			for(int i=0;i<Input.pos_dis+1;i++) {
				pw.printf("%-30s%-8s%s\n",Input.A_dis[i][0],"",Input.A_dis[i][1]);					//format data and print to file
			}
			pw.printf("\n%-33s%s\n","COMPUTER NAME","NO. OF DROPS");
			for(int i=0;i<Input.pos_drop+1;i++) {
				pw.printf("%-30s%-8s%s\n",Input.A_drop[i][0],"",Input.A_drop[i][1]);
			}
			pw.printf("\n%-28s%s\n","\nCOMPUTER NAME","NO. OF AVG LIMIT EXCEEDED");
			for(int i=0;i<Input.pos_avg+1;i++) {
				pw.printf("%-30s%-8s%s\n",Input.A_avg[i][0],"",Input.A_avg[i][1]);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
