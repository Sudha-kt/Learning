package Exceptionhandlingdemo;

public class throwdemo {
	int a=20;
	int b=5;
	void divide() {
		if(b==5) {
			throw new ArithmeticException("Can not divide by 5");
		}
		else {
			int result=a/b;
			System.out.println("The value of the result is : " + result );
		}
	}

	public static void main(String[] args) {
        throwdemo obj=new throwdemo();
        try {
            obj.divide();
        }
        catch(ArithmeticException e) {
        	System.out.println(e);
        }
	}

}
