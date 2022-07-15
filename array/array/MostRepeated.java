package array;

import java.util.Scanner;

class MostRepeated

{

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array");
		int S = sc.nextInt();
		int[] a = new int[S];
		int[] b = new int[a.length];

		int i, j, c = 1, lock = -1;

		System.out.println("Enter Element in an Array: ");

		for (i = 0; i < a.length; i++)

		{

			a[i] = sc.nextInt();
		}

		System.out.println("Entered Element in an Array: ");

		for (i = 0; i < a.length; i++)

		{

			System.out.println(" " + a[i]);
		}

		for (i = 0; i < a.length; i++) {

			c = 1;

			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					c++;
					b[j] = lock;
				}
			}
			if (b[i] != lock)
				b[i] = c;
		}
		System.out.println("\nFrequency Of An Array: ");
		System.out.println("Elements Frequency");

		for (i = 0; i < a.length; i++) {
			if (b[i] != lock)
				System.out.println(a[i] + "\t " + b[i]);
		}
		int k;
		for (i = 0; i < b.length; i++) {
			for (j = i + 1; j < b.length; j++) {
				if (b[i] < b[j]) {
					k = b[j];
					b[j] = b[i];
					b[i] = k;
				}
			}
		}
		int index=b[0];
		System.out.println("Most Repeated Element In an Array: ");

		System.out.println(a[b[0]] + " ");

		//System.out.println("Least Repeated Elements In an Array: ");
		
	}

}

//Most and Least Repeated Elements in an Array
