class EqualityMatrix
{
	public static void main(String args[])
	{
		int a[][]={
				{2,3,4},
				{4,6,7},
				{5,9,8}
			   };
		int b[][]={
				{2,3,4},
				{4,6,7},
				{5,9,8}
			   };
		int c=1;
		int row1=a.length;
		int col1=a[0].length;
		int row2=b.length;
		int col2=b[0].length;
		System.out.println("\tmatrix first");
		for(int i=0;i<3;i++)
		{
			System.out.print("\t");
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\tmatrix Second");
		for(int i=0;i<3;i++)
		{
			System.out.print("\t");
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		if(row1!=row2 || col1!=col2)
		{
			System.out.println("\tNot Equal.");
		}
		else
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
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
