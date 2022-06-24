class EvenOdd
{
	public static void main(String args[])
	{
		int i=201;
		int e=0,o=0;
		int esum=0,osum=0;
		System.out.println("\t-------------------");
		while(i<=400)
		{
			if(i%2==0)
			{
				e++;
				esum=esum+i;
			}
			else
			{
				o++;
				osum=osum+i;
			}	
			i++;
		}
		System.out.println("\t-------------------");
		System.out.println("\tTotal Of Even\t=  "+esum);
		System.out.println("\tTotal Of Odd \t=  "+osum);
		System.out.println("\tDifference   \t=  "+(esum-osum));
		System.out.println("\tCount Of Even\t=  "+e);
		System.out.println("\tCount Of Odd \t=  "+o);
				
	}
}
