package Pattern;

import java.util.Scanner;

public class Prog14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
for (int i=1;i<=n;i++) //no.of lines.
{
	for(int j=0; j<=n-i; j++) // no. of elements in a line.
	{
		System.out.print("* ");
	}
System.out.println();
}
	}

}
