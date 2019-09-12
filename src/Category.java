import java.util.StringTokenizer;

/*
Evaluate each entry from a file
and categorize it according to the type of error.
*/
public class Category 
{
	static void assign(String entry)														//recieve one entry from Parse_file class
	{
		StringTokenizer entry_token= new StringTokenizer(entry, "|");
		String name_field= entry_token.nextToken();
		entry_token.nextToken();
		String error_field= entry_token.nextToken();
		entry_token= new StringTokenizer(name_field);
		entry_token.nextToken();															//skip first token
		entry_token= new StringTokenizer(entry_token.nextToken(),":");						//split heading "computer name" and data
		entry_token.nextToken();															//skip first (heading) token
		name_field=entry_token.nextToken();													//extracted name
		if(error_field.contains("disconnected"))											//if entry matches first type of error
		{
			for(int i=0;i<Input.pos_dis+1;i++) 												//check if name already esists in list
			{
				if (Input.A_dis[i][0].equals(name_field)) 
				{
					Input.A_dis[i][1]=Integer.parseInt(Input.A_dis[i][1])+1+"";				//if name already esists, increase count
					return;
				}
			}
			Input.A_dis[++Input.pos_dis][0]=name_field;										//if name doesn't exist, add name to arrray at pos+1
			Input.A_dis[Input.pos_dis][1]=""+1;												//make its count=1
		}
		else if(error_field.contains("Drop"))												//same as if loop
		{
			for(int i=0;i<Input.pos_drop+1;i++) 
			{
				if (Input.A_drop[i][0].equals(name_field)) 
				{
					Input.A_drop[i][1]=Integer.parseInt(Input.A_drop[i][1])+1+"";
					return;
				}
			}
			Input.A_drop[++Input.pos_drop][0]=name_field;
			Input.A_drop[Input.pos_drop][1]=""+1;
		}
		else if(error_field.contains("Average"))
		{
			for(int i=0;i<Input.pos_avg+1;i++) 
			{
				if (Input.A_avg[i][0].equals(name_field)) 
				{
					Input.A_avg[i][1]=Integer.parseInt(Input.A_avg[i][1])+1+"";
					return;
				}
			}
			Input.A_avg[++Input.pos_avg][0]=name_field;
			Input.A_avg[Input.pos_avg][1]=""+1;
		}
		else 																					//if the entry matches with no errors, return. 
			return;			
	}
}
