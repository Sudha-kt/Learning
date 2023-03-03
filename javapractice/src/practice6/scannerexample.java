package practice6;

import java.util.Scanner;

public class scannerexample {
	
	

	public String biggestnumber(int n) {
		int a=1,b=70,c=12;
		String result;
		if(a>b&&a>c)
		{
			result="a is the biggest number";
		}
		else if(b>a&&b>c)
		{
			result="b is the biggest number";
	    }
		else {
			result="c is the biggest number";
		}
		return result;
	}

	public static void main(String[] args) {
		scannerexample obj=new scannerexample();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for a,b,c :");
		int x=sc.nextInt();
		String output=obj.biggestnumber(x);
		System.out.println(output);
		sc.close();
	}
}
