/*
1
2
3
4
5
6
7
8
9

1 0 0 
4 5 0 
7 8 9 
*/
import java.util.Scanner;
class Print_LowerTraingular
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
		System.out.println();
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
