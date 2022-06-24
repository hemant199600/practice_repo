
class SumOfEO
{
	public static void main(String rgs[])
        {
		long n=34567834,i,rem,esum=0,osum=0;
               i=n;
              while(i!=0)
                {
                 rem=i%10;
		 if(rem%2==0)
		 {
			esum=esum+rem;	
		}
		else
		{
			osum=osum+rem;
		}
                 i=i/10;

               }
		System.out.println("Sum of even numbers of given number: "+n+"="+ esum);
		System.out.println("Sum of Odd numbers of given number: "+n+"="+ osum);
	}
}
                 
