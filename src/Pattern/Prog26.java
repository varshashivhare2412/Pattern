package Pattern;

import java.util.Scanner;

public class Prog26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
	 for(int i=1; i<=n; i++)
	 {
		 for(int j=1; j<=i; j++)
		 {
			 if(j==1)
			 {
			 System.out.print(j+" ");
			 }
			 else
				 System.out.print( "* "+j+"  ");
			 
		 }
		 System.out.println();
	 }
	}

}
