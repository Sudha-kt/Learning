
package practice1;

import java.util.Scanner;

public class Scannerdemo {
	public String oddoreven(int n) {
		int x;
		String result;
		x=n%2;
		if(x==0)
		{
			result="even";
		}
		else
		{
			result="odd";
		}
		return result;
	}
	public static void main(String[] args) {
		Scannerdemo obj=new Scannerdemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int num=sc.nextInt();
		String output=obj.oddoreven(num);
		System.out.println(output);
		sc.close();
	}
}

	