package Interfacedemo;

public class Axisbank implements Bank {

	public void deposit() {
        System.out.println("Deposit money in the bank");		
	}

	public void loan() {
	   System.out.println("Providing loan to the eligible customers");		
	}

	public void withdraw() {
	   System.out.println("Withdraw the limit of amount");	
	}

	public void savings() {
	   System.out.println("Save your money in the bank");
	}
	
	public static void main(String[] args) {
		Axisbank obj=new Axisbank();
		obj.withdraw();
		obj.loan();
		obj.deposit();
	}
}
