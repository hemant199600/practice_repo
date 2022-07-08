import java.util.Scanner;
class Matrix5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][4];
		System.out.println("Enter Elements:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
				a[i][j]=sc.nextInt();			
		}
		System.out.println("Elements are: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();			
		}
	}
}
