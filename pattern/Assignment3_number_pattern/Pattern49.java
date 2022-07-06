public class Pattern49
{
	public static void main(String args[])
	{
		int k=1,l;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;)
			{
				k++;
				for(l=2;l<=k;l++)
				{
					if(k%l==0)	
					    break;
				}
				if(l==k)
				{
				System.out.print(k+" ");
				j++;
				}
				
				
			}

		System.out.println();
		}
	}
}
