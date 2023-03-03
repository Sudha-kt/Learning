package practice2;

import java.util.Scanner;

public class Switchdemo {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice=sc1.nextInt();
		switch (choice) {
			case 1:
				System.out.println("Lemon Juice");
			break;
			case 2:
				System.out.println("Orange Juice");
			break;
			case 3:
				System.out.println("Apple Juice");
			break;
			case 4:
				System.out.println("Mango Juice");
			break;
			case 5:
				System.out.println("Pineapple Juice");
			break;
			default:
				System.out.println("Invalid choice");
			break;
		}
		sc1.close();

		}
	
				
	}

