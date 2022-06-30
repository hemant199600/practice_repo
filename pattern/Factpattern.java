class Factpattern
{
	public static void main(String args[])
	{
		float fact=1,res=0f;
		
		for(float i=1;i<=5;i++)
		{
			for(float j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			res+=(i/fact);	
		}
		System.out.println("value :"+res);		
	}
}
