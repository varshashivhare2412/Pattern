package Pattern;

import java.util.Scanner;

public class Prog22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String s=sc.nextLine();
		int l=s.length();
	 for(int i=0; i<=l; i++)
	 {
		 for(int j=0; j<l-i; j++)
		 {
			 System.out.print(s.charAt(j)+" ");
		 }
		 System.out.println();
	 }

	}

}
