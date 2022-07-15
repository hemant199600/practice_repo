class TransposeMatrix
{
	public static void main(String args[])
	{
		int a[][]={
				{2,3,4},
				{4,6,7},
				{5,9,8}
			   };
		int b[][]=new int[3][3];
		System.out.println("Given matrix.");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("Transpose of matrix.");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[j][i]+" ");
				b[i][j]=a[i][j];
			}
			System.out.println();
		}
		System.out.println("copied matrix.");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}
}
