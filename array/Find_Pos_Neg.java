
import java.util.Scanner;
public class Find_Pos_Neg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int zeros=0,pos=0,neg=0;
		System.out.println("Enter elements: ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("-----------------------");
		for(int i=0;i<5;i++)
		{
			if(a[i]>0)
				pos++;
			else if(a[i]==0)
				zeros++;
			else
				neg++;
		}
		System.out.println(" 0's      :"+zeros);
		System.out.println(" Positive :"+pos);
		System.out.println(" Negative :"+neg);
	}
}
