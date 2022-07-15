/*

*           * 
* *       * * 
*   *   *   * 
*     *     * 
*   *   *   * 
* *       * * 
*           * 

*/
class Butterfly_Hallow
{
	public static void main(String args[])
	{
		int k=7;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j==1||j==7||i==j||k==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			k--;
			System.out.println();
		}
	}
}
