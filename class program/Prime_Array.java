import java.util.Scanner;
class Prime_Array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int j;
		System.out.println("Enter array elements: ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print(" array elements are: ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("prime numbers: ");
		for(int i=0;i<5;i++)
		{
			for(j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
					break;
			}
			if(a[i]==j)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
}
