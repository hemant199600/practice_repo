/*
F E D C B A 
F E D C B 
F E D C 
F E D 
F E 
F
*/
class Pattern7
{
	public static void main(String args[])
	{
		for(int i=65;i<=70;i++)
		{
			for(int j=70;j>=i;j--)
			{
				System.out.print((char)j+" ");
			}
		System.out.println();
		}		
		
	}
}
