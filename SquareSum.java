class SquareSum
{
	public static void main(String args[])
	{
		int i=1;
		int sum=0;
		System.out.println("\tNumber\t|  Square");
		System.out.println("\t-------------------");
		while(i<=20)
		{
			sum=sum+(i*i);
			System.out.println("\t"+i+"\t|  "+(i*i));
			i++;
		}
		System.out.println("\t-------------------");
		System.out.println("\tTotal\t|  "+sum);
				
	}
}
