package Pattern;

import java.util.Scanner;

public class Prog24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		int k=0;
	 for(int i=0; i<n; i++)
	 {
		 for(int j=i; j>=0; j--)
		 {
			 System.out.print((char)(65+k)+" ");
			 k++;
			 
		 }
		 System.out.println();
	 }
	}

}
