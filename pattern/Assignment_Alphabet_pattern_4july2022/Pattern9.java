/*
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
*/
class Pattern9
{
	public static void main(String args[])
	{
		for(int i=70;i>=65;i--)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
		System.out.println();
		}
	}
}
