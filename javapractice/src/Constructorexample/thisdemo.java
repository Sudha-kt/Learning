package Constructorexample;

public class thisdemo {
	String name;
	int age;
public thisdemo(String name, int age) {
	this.name=name;
	this.age=age;
	System.out.println("Name is: " +name);
	System.out.println("Age is: " +age);
}

	public static void main(String[] args) {
      thisdemo obj=new thisdemo("Sudha", 25);
	}
}
