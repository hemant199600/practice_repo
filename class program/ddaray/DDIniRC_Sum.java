class DDIniRC_Sum
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
		System.out.print("First row: {");
		for(int i=0;i<1;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
			}
			System.out.print("} ="+sum);
			System.out.println();
		}
		System.out.println();
		System.out.print("Second row: {");
		for(int i=1;i<2;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
			}
			System.out.print("} ="+sum);
			System.out.println();
		}
		System.out.println();
		System.out.print("Third row: {");
		for(int i=2;i<3;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
			}
			System.out.print("} ="+sum);
			System.out.println();
		}
		System.out.println();
		int sum1=0;
		System.out.print("First col: {");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<1;j++)
			{
				System.out.print(a[i][j]+" ");
				sum1=sum1+a[i][j];
			}
			//System.out.print("} ="+sum1);
			//System.out.println();
		}
		System.out.print("} ="+sum1);
		System.out.println();
		int sum2=0;
		System.out.print("Second col: {");
		for(int i=0;i<3;i++)
		{
			for(int j=1;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
				sum2=sum2+a[i][j];
			}
			
			//System.out.println();
		}
		System.out.print("} ="+sum2);
		System.out.println();
		int sum3=0;
		System.out.print("Third col: {");
		for(int i=0;i<3;i++)
		{
			int j;
			for(j=2;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				sum3=sum3+a[i][j];
			}
			//c=c+sum3;
			//System.out.println();

		}
		System.out.print("} ="+sum3);
		


	}
}
