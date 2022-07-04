/*
A 
B G 
C H M 
D I N S 
E J O T Y 
F K P U Z _ 
*/
class Pattern12
{
	public static void main(String args[])
	{
		int c;
		for(int i=65;i<=70;i++)
		{
			c=i;
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)c+" ");
				c=c+5;
			}
		System.out.println();
		}
	}
}
