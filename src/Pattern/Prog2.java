package Pattern;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
	
for (int i=0;i<n;i++) //no.of lines.
{
	for(int j=0; j<n; j++) // no. of elements in a line.
	{
		System.out.print( (char)(j+97)+" ");
	}
	System.out.println();
}
	}

}
