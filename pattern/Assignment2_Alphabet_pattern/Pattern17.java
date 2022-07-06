/*
G 
G F 
G F E 
G F E D 
G F E D C 
G F E D C B 
G F E D C B A 
*/
class Pattern17
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			int c=71;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)c+" ");
				c--;	
			}
		System.out.println();
		}
	}
}
