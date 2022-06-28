/*
1:Number print seperately;
    12345
  1 2 3 4 5
*/

import java.util.*;
class Separate
{
	public static void main(String rgs[])
        {
		Scanner sc=new Scanner(System.in);
		int n, i, rem,rev=0;
		System.out.print("Enter number: ");
		n=sc.nextInt();
               i=n;
		int c=0;
		do
                {
                 rem=i%10;
		 rev=rev*10+rem;
                 i=i/10;

               }while(i!=0);
		while(rev!=0)
		{
			int gem=rev%10;
			System.out.print(gem+" ");
			rev=rev/10;
		}
	}
}
                 
