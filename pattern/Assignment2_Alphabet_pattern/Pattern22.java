/*
A 
B A 
C B A 
D C B A 
E D C B A 
F E D C B A 
G F E D C B A 
*/
class Pattern22
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			int c=64;
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(j+c)+" ");	
			}
		System.out.println();
		}
	}
}
