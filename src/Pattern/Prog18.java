package Pattern;

import java.util.Scanner;

public class Prog18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		int k=1;
	 for(int i=n; i>0; i--)
	 {
		 for(int j=0; j<i;j++)
		 {
			 System.out.print((j+k)+" ");
		 }
		 System.out.println();
	 }
	}

}
