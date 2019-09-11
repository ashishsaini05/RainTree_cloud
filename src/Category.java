import java.util.StringTokenizer;

public class Category 
{
	static void assign(String entry)
	{
		StringTokenizer entry_token= new StringTokenizer(entry, "|");
		String name_field= entry_token.nextToken();
		entry_token.nextToken();
		String error_field= entry_token.nextToken();
		entry_token= new StringTokenizer(name_field);
		entry_token.nextToken();															//skip first token
		entry_token= new StringTokenizer(entry_token.nextToken(),":");						//split heading and data
		entry_token.nextToken();															//skip first (heading) token
		name_field=entry_token.nextToken();													//extracted name
//		System.out.println(Input.A_dis[0][0]+"");
//		System.out.println(name_field);		
		if(error_field.contains("disconnected"))
		{
			for(int i=0;i<Input.pos_dis+1;i++) {
//				System.out.println(Input.pos_dis);
				if (Input.A_dis[i][0].equals(name_field)) 
				{
					Input.A_dis[i][1]=Integer.parseInt(Input.A_dis[i][1])+1+"";
//					System.out.println(Input.A_dis[Input.pos_dis][0]+"\t"+Input.A_dis[Input.pos_dis][1]);
//					System.out.println(Input.pos_dis);
					return;
				}
			}
			Input.A_dis[++Input.pos_dis][0]=name_field;
			Input.A_dis[Input.pos_dis][1]=""+1;
//			System.out.println(Input.A_dis[Input.pos_dis][0]+"\t"+Input.A_dis[Input.pos_dis][1]);
//			System.out.println(Input.pos_dis);
			
			
		}
		else if(error_field.contains("Drop"))
		{
			for(int i=0;i<Input.pos_drop+1;i++) {
//				System.out.println(Input.pos_dis);
				if (Input.A_drop[i][0].equals(name_field)) 
				{
					Input.A_drop[i][1]=Integer.parseInt(Input.A_drop[i][1])+1+"";
//					System.out.println(Input.A_dis[Input.pos_dis][0]+"\t"+Input.A_dis[Input.pos_dis][1]);
//					System.out.println(Input.pos_dis);
					return;
				}
			}
			Input.A_drop[++Input.pos_drop][0]=name_field;
			Input.A_drop[Input.pos_drop][1]=""+1;
//			System.out.println(Input.A_dis[Input.pos_dis][0]+"\t"+Input.A_dis[Input.pos_dis][1]);
//			System.out.println(Input.pos_dis);
			
		}
		else if(error_field.contains("Average"))
		{
			for(int i=0;i<Input.pos_avg+1;i++) {
//				System.out.println(Input.pos_dis);
				if (Input.A_avg[i][0].equals(name_field)) 
				{
					Input.A_avg[i][1]=Integer.parseInt(Input.A_avg[i][1])+1+"";
//					System.out.println(Input.A_dis[Input.pos_dis][0]+"\t"+Input.A_dis[Input.pos_dis][1]);
//					System.out.println(Input.pos_dis);
					return;
				}
			}
			Input.A_avg[++Input.pos_avg][0]=name_field;
			Input.A_avg[Input.pos_avg][1]=""+1;
//			System.out.println(Input.A_dis[Input.pos_dis][0]+"\t"+Input.A_dis[Input.pos_dis][1]);
//			System.out.println(Input.pos_dis);
			
		}
		else
			return;
			
	}
	

}
