package Pattern;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
	
for (int i=1;i<=n;i++) //no.of lines.
{
	for(int j=i; j<=n+i; j++) // no. of elements in a line.
	{
		System.out.print(j+" ");
	}
	System.out.println();
}
	}

}
