package Pattern;

import java.util.Scanner;

public class Prog23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		int k=0;
	 for(int i=0; i<n; i++)
	 {
		 for(int j=i; j>=0; j--)
		 {
			 System.out.print(k%9+1+" ");
			 k++;
			 
		 }
		 System.out.println();
	 }
	}

}
