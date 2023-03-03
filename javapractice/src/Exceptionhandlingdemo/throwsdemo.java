package Exceptionhandlingdemo;

public class throwsdemo {
	void divide(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException("Not divided by zero");
		}
		else {
			int res=a/b;
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
      throwsdemo obj=new throwsdemo();
      try {
      obj.divide(20,0);     
      }
      catch(ArithmeticException e) {
    	  System.out.println(e);
      }
	}

}
