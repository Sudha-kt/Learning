package methodoverloadingdemo;

public class Poly {
  public void add(int a,int b) {
	  System.out.println("Addition of a and b is: "+(a+b));
  }
  public void add(int a,int b,int c) {
	  System.out.println("Additing od a,b and c is: "+(a+b+c));
  }
  
	public static void main(String[] args) {
       Poly obj=new Poly();
       obj.add(7,5);
       obj.add(7,5,15);
	}
}
