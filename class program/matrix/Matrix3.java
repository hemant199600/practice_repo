import java.util.Scanner;
class Matrix3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][3];
		System.out.println("Enter Elements:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				a[i][j]=sc.nextInt();			
		}
		System.out.println("Elements are: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();			
		}
	}
}
