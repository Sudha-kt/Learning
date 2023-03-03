package Abstractiondemo;

public class Apple extends Fruits {
	void fruitname() {		
		System.out.println("The name of the fruit is : Apple");
	}

	public static void main(String[] args) {
		Fruits a=new Orange();
		a.fruits();
		Apple obj=new Apple();
		obj.fruitname();
		Orange obj1=new Orange();
		obj1.fruitname();
	}
}
