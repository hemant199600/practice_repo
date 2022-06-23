import java.util.Scanner;
class CalcSwitch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		char ch;
		System.out.println("\n\t\t\tCalculator");
		System.out.println("\t\t\t-----------");
		System.out.println("\t\t\t+.ADD");
		System.out.println("\n\t\t\t-.SUB");
		System.out.println("\n\t\t\t*.MULT");
		System.out.println("\n\t\t\t/.DIV");
		System.out.println("\t\t\t----------------");
		System.out.print("\n\t\t\tEnter your choice ");
		ch=sc.next().charAt(0);
		System.out.print("\n\t\t\tEnter 2 numbers: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		switch(ch)
		{
			case '+':
			{
				System.out.println("\t\t\tAddition :"+(n1+n2));
				break;
			}
			case '-':
			{
				System.out.println("\t\t\tSubstraction :"+(n1-n2));
				break;
			}
			case '*':
			{
				System.out.println("\t\t\tMultiplication :"+(n1*n2));
				break;
			}
			case '/':
			{
				System.out.println("\t\t\tDivision :"+(n1/n2));
				break;
			}
			default:
				System.out.println("\t\t\tEnter valid choice.......");
				break;
		}
	}
}
