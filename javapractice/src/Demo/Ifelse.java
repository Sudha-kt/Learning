package Demo;

public class Ifelse {

	public static void main(String[] args) {
		System.out.println("If else example");
		System.out.println("Finding even or odd");
		int a=10;
		if(a%2==0)
		{
			System.out.println("The value of a is Even");
		}
		else
		{
			System.out.println("The value of a is Odd");
		}
		 System.out.println("positive or negative");
		 int b=-2;
		if(b>0)
		 {
			 System.out.println(b+ " is the positive number");
		 }
		 else
		 {
			 System.out.println(b+ " is the negative number");
		 }
		System.out.println("Finding the biggest number");
		int x=10,y=5,z=20;
		if(x>y && y>z)
		{
			System.out.println(x+ "is the biggest number");
		}
		if(y>x && y>z)
		{
			System.out.println(y+" is the biggest number");
		}
		if(z>x && z>y)
		{
			System.out.println(z+" is the biggest number");
		}		
		
	}
}


