package Pattern;

import java.util.Scanner;

public class Prog12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		int k=0;
		int m=1;
for (int i=1;i<=n;i++) //no.of lines.
{
	for(int j=1; j<=n; j++) // no. of elements in a line.
	{
		if(k%2==0) 
		{
		System.out.print(m+" ");
		m++;
		if(m==10)
		m=1;
		}
		else
		{
		System.out.print("* ");
		}
		k++;
	}
System.out.println();
}
	}

}
