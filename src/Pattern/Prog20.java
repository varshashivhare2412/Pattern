 package Pattern;

import java.util.Scanner;

public class Prog20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
	 for(int i=0; i<n; i++)
	 {
		 for(int j=n-i; j>0; j--)
		 {
			 System.out.print((char)(64+j)+" ");
		 }
		 System.out.println();
	 }

	}

}
