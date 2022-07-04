/*
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 

*/
class Pattern3
{
	public static void main(String args[])
	{
		for(int i=65;i<=70;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
		System.out.println();
		}
		for(int i=69;i>=65;i--)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
		System.out.println();
		}
	}
}
