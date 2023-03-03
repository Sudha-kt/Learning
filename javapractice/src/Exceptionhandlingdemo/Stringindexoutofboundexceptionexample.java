package Exceptionhandlingdemo;

public class Stringindexoutofboundexceptionexample {

	public static void main(String[] args) {
         String X="SUDHA";
         try {
        	 System.out.println("The character is: " +X.charAt(7));    	 
         }
         catch(Exception e) {
        	 System.out.println("String Index Out Of Bound Exception");
         }
         finally {
        	 System.out.println("Hello");
         }
	}

}
