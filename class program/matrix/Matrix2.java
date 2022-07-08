import java.util.Scanner;
class Matrix2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[4][3];
		System.out.println("Enter Elements:");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
				a[i][j]=sc.nextInt();			
		}
		System.out.println("Elements are: ");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();			
		}
	}
}
