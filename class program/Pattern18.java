/*
G F E D C B A 
G F E D C B 
G F E D C 
G F E D 
G F E 
G F 
G
*/
class Pattern18
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			int c=71;
			for(int j=i;j<=7;j++)
			{
				System.out.print((char)c+" ");
				c--;	
			}
		System.out.println();
		}
	}
}
