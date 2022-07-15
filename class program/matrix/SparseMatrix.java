import java.util.Scanner;
class SparseMatrix
{
	public static void main(String args[])
	{
		int a[][]={
				{1,0,0},
				{0,0,3},
				{4,0,0}
			};
		int k=0;
		int r=a.length;
		int c=a[0].length;
		int size=r*c;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		if(r!=c)
		{
			System.out.println("not Sparse matrix.");
		}
		else
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(a[i][j]==0)
						k++;
				}
			}
			if(k>(size/2))
				System.out.println("Sparse matrix.");
			else
				System.out.println("not Sparse matrix.");
		}
	}
}
