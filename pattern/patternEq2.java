/*
      1 
     1 2 
    1 2 3 
   1 2 3 4 
  1 2 3 4 5 
 1 2 3 4 5 6 

*/
class patternEq2
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=i;j<=6;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			
			System.out.println();
		}
	}
}
