package Exceptionhandlingdemo;

public class Arrayindexoutofbounddemo {

	public static void main(String[] args) {
         int a[]= {10,20,30,40,50};
         try {
        	 System.out.println("The value is : "+ a[20]);
         }
         catch(Exception e) {
        	 System.out.println("The value of is not available");
         }
	}

}
