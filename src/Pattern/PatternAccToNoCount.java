package Pattern;
import java.util.Scanner;
public class PatternAccToNoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
	
for (;n!=0;n=n/10) 
{
	for(int j=1; j<=n%10; j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	}

}
