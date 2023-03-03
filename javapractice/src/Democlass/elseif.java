package Democlass;

public class elseif {

	public static void main(String[] args) {
		System.out.println("Example for else if");
		System.out.println("Find leap year or not");
		int a=1999;
		if(a%4==0)
		{
			System.out.println(a+" is a leap year");
		}
		else if(a%100!=0)
		{
			System.out.println(a+ " is not a leap year");
		}

	}

}
