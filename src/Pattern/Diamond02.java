package Pattern;

import java.util.Scanner;

public class Diamond02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		int sp=n/2, st=1;
		for(int i=1;i<=n;i++)
		{
		{
			System.out.print("  ");
		}
		int k=st/2+1;
		for(int j=1;j<=st;j++)
		{
			System.out.print(k+" ");
			if (j<=st/2)
				k--;
			else
				k++;
		}
		if(i<=n/2)
		{
			sp--;
			st=st+2;
		}
		else {
			sp++;
			st=st-2;
		}
		System.out.println();
	}

}
}
