package Exceptionhandlingdemo;

public class Numberformatexceptionexample {

	public static void main(String[] args) {
        try {
        	String X="abc";
        	int a=Integer.parseInt(X);
        	System.out.println("The value of X is : " +X);
        }
        catch(NumberFormatException e) {
        	System.out.println("Number Format exception");
        }
	}
}
