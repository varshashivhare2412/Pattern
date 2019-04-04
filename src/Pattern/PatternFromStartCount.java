package Pattern;
import java.util.Scanner;
public class PatternFromStartCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		String st=""+n;
for (int i=0;i<st.length();i++)
{
	int x=st.charAt(i)-48;
	for(int j=0; j<x; j++) 
	{
		System.out.print("*");
	}
	System.out.println();
	}
}

}
