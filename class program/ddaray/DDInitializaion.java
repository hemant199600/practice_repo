class DDInitializaion
{
	public static void main(String args[])
	{
		int a[][]={
				{2,3,4},
				{4,6,7},
				{5,9,8}
			   };
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		System.out.print("First row: ");
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		System.out.print("Second row: ");
		for(int i=1;i<2;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		System.out.print("Third row: ");
		for(int i=2;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}


	}
}
