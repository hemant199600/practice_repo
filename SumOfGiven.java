
class SumOfGiven
{
	public static void main(String rgs[])
        {
		long n=34567834,i,rem,sum=0;
               i=n;
              while(i!=0)
                {
                 rem=i%10;
		 sum=sum+rem;
                 i=i/10;

               }
		System.out.println("Sum of given number: "+n+"="+ sum);
	}
}
                 
