/*
J 
I H 
G F E 
D C B A 
*/
class Pattern34
{
	public static void main(String args[])
	{
		int k=10,c=64;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(c+k)+" ");
				k--;
			}
		System.out.println();
		}

	}
}
