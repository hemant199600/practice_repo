/*
1 3 5 7 9 
3 5 7 9 1 
5 7 9 1 3 
7 9 1 3 5 
9 1 3 5 7 
*/
public class Pattern36
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i+=2)
		{
			for(int j=i;j<=9;j+=2)
				System.out.print(j+" ");

			for(int j=1;j<=i-2;j+=2)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
