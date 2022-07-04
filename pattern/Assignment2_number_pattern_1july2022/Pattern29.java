/*
1 
2 9 
3 8 10 
4 7 11 14 
5 6 12 13 15 
*/
class Pattern29
{
	public static void main(String args[])
	{
		int a=9,e=0;
		for(int i=1;i<=5;i++)
		{
			int d=i;
			for(int j=1;j<=i;j++)
			{
				if(j%2==1)
				{
			  		System.out.print(d+" ");
					e=d;
			  		d=d+5-j;
				} 
				else
				{
					int temp=e+a;
					System.out.print(temp+" ");
					d=d+5-j;
					
				} 
				 
			}
		a-=2;
		System.out.println();
		}	
		
	}
}
