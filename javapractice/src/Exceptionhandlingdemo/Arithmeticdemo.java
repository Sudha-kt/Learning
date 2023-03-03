package Exceptionhandlingdemo;

import java.util.Scanner;

public class Arithmeticdemo {

	public static void main(String[] args) {
        int b;
try {
	System.out.println("Enter the value: ");
	Scanner a=new Scanner(System.in);
    b=a.nextInt();
	System.out.println("The value of b is : "+b);
}
catch(Exception e) {
	System.out.println("Invalid input");
}
	}

}
