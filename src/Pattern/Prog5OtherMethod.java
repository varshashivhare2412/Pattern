package Pattern;

import java.util.Scanner;

public class Prog5OtherMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		int k=1;
for (int i=1;i<=n;i++) //no.of lines.
{
	for(int j=1; j<=n; j++) // no. of elements in a line.
	{
		System.out.print(k+" ");
		k++;
		if(k==10)
			k=1;
	}
	System.out.println();
}
	}

}
