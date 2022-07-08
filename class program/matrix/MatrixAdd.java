import java.util.Scanner;
class MatrixAdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("Enter matrix 1 Elements:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				a[i][j]=sc.nextInt();			
		}
		System.out.println("Enter matrix 2 Elements:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				b[i][j]=sc.nextInt();			
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				c[i][j]=a[i][j]+b[i][j];			
		}
		System.out.println("Matrix 1 is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+"  ");
			System.out.println();			
		}
		System.out.println("Matrix 2 is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(b[i][j]+"  ");
			System.out.println();			
		}
		System.out.println("Addition is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(c[i][j]+"  ");
			System.out.println();			
		}
	}
}
