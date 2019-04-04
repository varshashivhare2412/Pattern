package Pattern;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		
for (int i=1;i<=n;i++) //no.of lines.
{
	int k=i;
	for(int j=1; j<=n; j++) // no. of elements in a line.
	{
		System.out.print((char)(k+64)+" ");
		k=k+n;
	}
	System.out.println();
}
	}

}
