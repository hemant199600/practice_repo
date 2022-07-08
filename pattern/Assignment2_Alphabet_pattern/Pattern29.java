/*
A 
B H 
C I N 
D J O S 
E K P T W 
F L Q U X Z 
G M R V Y [ \
*/
class Pattern29
{
	public static void main(String args[])
	{
		int d=0,c=64;
		for(int i=1;i<=7;i++)
		{
			d=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(c+d)+" ");
			  	d=d+7-j; 
			}
		System.out.println();
		}	
		
	}
}
