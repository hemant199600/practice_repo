import java.util.Scanner;
public class Print_Even
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("-----Even Elements of Array-----");
		for(int i=0;i<10;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		
	}
}
