import java.util.*;
class Separate
{
	public static void main(String rgs[])
        {
		Scanner sc=new Scanner(System.in);
		int n, i, rem;
		System.out.print("Enter number: ");
		n=sc.nextInt();
               i=n;
              while(i!=0)
                {
                 rem=i%10;

                    System.out.print(rem+" ");



                 i=i/10;

               }
	}
}
                 
