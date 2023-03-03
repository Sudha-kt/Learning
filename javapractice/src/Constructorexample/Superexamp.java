package Constructorexample;

public class Superexamp extends Superdemo {
	public Superexamp() {
	System.out.println("Welcome");
}
public Superexamp(String name, int age) {
	super(name,age);
	System.out.println("The name is: " + name);
	System.out.println("The age is: " + age);
}
public static void main(String[] args) {
          Superexamp obj=new Superexamp();
          Superexamp obj1=new Superexamp("Sudha",25);       
	}

}
