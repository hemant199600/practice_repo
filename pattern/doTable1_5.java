/* do while*/
class doTable1_5
{
	public static void main(String args[])
	{	
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(j*i+"\t");
				j++;
			}while(j<=5);
		System.out.println();
		i++;
		}while(i<=10);
	}
}
