/*
A 
A B 
A B C 
A B C D 
A B C D E 
*/
class Pattern1
{
	public static void main(String args[])
	{
		for(int i=65;i<=69;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
		System.out.println();
		}
	}
}
