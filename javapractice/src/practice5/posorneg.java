package practice5;

import java.util.Scanner;

public class posorneg {
	public String posiornega(int n) {
		String value;
		if(n>=0) {
			value="Positive";
		}
		else {
			value="Negative";
		}
		return value;
	}

	public static void main(String[] args) {
		posorneg obj=new posorneg();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int y=sc.nextInt();
		String output=obj.posiornega(y);
		System.out.println(output);
		sc.close();
	}
}
