/*
* * * * * 
*     * 
*   * 
* * 
* 
* * 
*   * 
*     * 
* * * * *
*/
public class Hallow_k
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==5||i==j||j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				
			System.out.println();
		}
	
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==5||i==j||j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				
			System.out.println();
		}
	}
}
