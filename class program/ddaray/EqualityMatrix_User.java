import java.util.Scanner;
class EqualityMatrix_User
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=1;
		int row1,col1,row2,col2;
		System.out.print("\tEnter row size for matrix    1:");
		row1=sc.nextInt();
		System.out.print("\tEnter column size for matrix 1:");
		col1=sc.nextInt();
		System.out.print("\tEnter row size for matrix    2:");
		row2=sc.nextInt();
		System.out.print("\tEnter column size for matrix 2:");
		col2=sc.nextInt();
		int a[][]=new int[row1][col1];
		int b[][]=new int[row2][col2];
		System.out.println();
		System.out.print("\tEnter First Matrix:");
		for(int i=0;i<row1;i++)
		{
			
			for(int j=0;j<col1;j++)
			{
				a[i][j]=sc.nextInt();
				System.out.print("\t\t\t   ");
			}
		}
		System.out.println();
		System.out.print("\tEnter Second Matrix:");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				b[i][j]=sc.nextInt();
				System.out.print("\t\t\t    ");
			}
		}
		System.out.println();
		System.out.println("\tmatrix first");
		for(int i=0;i<row1;i++)
		{
			System.out.print("\t");
			for(int j=0;j<col1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\tmatrix Second");
		for(int i=0;i<row2;i++)
		{
			System.out.print("\t");
			for(int j=0;j<col2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		if(row1!=row2 || col1!=col2)
		{
			System.out.println("\tNot Equal.");
		}
		else
		{
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					if(a[i][j]!=b[i][j])
					{
						c=0;
						break;
					}
				}
			}
			if(c==1)
				System.out.println("\tEqual matrix.");
			else
				System.out.println("\tNot Equal Matrix.");
		}
	}
}
