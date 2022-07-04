/*
1	10	11	20	21	
2	9	12	19	22	
3	8	13	18	23	
4	7	14	17	24	
5	6	15	16	25	
*/
class Pattern30
{
	public static void main(String args[])
	{
		int count=0,a=4;
		for(int i=1;i<=5;i++)
		{
			count=i;
			for(int j=1;j<=5;j++)
			{
				
				if(j%2==0)
				{
					int dcount=count+a;
					System.out.print(dcount+"\t");
					count+=5;
				}
				else
				{	
					System.out.print((count)+"\t");
				        count+=5;			
				}
				
				
			}
		  a-=2;
		System.out.println();
		}
	}	
}
