package Pattern;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
	
for (int j=1;j<=n;j++) //no.of lines.
{
	for(int i=1; i<=n; i++) // no. of elements in a line.
	{
		System.out.print(i%2+" ");
	}
	System.out.println();
}
	}

}
