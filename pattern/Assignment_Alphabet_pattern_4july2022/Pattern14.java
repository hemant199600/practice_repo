/*
A 
A B A 
A B C B A 
A B C D C B A 
A B C D E D C B A 
A B C D E F E D C B A 
*/
class Pattern14
{
	public static void main(String args[])
	{
		for(int i=65;i<=70;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
			for(int j=i-1;j>=65;j--)
			{
				System.out.print((char)j+" ");
			}
		System.out.println();
		}
	}
}
