import java.util.Scanner;
class Print_LowerTraingular1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter Array Element: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			a[i][j]=sc.nextInt();	
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		if(a.length!=a[0].length)
		{
			System.out.println(" Row and column size must be equal.");
		}
		else
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(i>=j)
						System.out.print(a[i][j]+" ");
					else
						System.out.print(0+" ");
				}
				System.out.println();
			}
		}
	}
}
