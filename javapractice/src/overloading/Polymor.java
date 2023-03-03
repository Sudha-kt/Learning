package overloading;

public class Polymor {
	public void div(int a,int b) {
		System.out.println("Division of a and b is: " +(a/b));
	}
	public void div(int a,int b, int c) {
	    System.out.println("Division of a,b and c is: " +(a/b/c));
	}
	public void print(char ch1, char ch2,char ch3, char ch4, char ch5) {
		System.out.println("Printing the characters: " + ch1 + ch2 + ch3 + ch4 + ch5);	
		}

	public static void main(String[] args) {
        Polymor a=new Polymor();
        a.div(20,5);
        a.div(20,5,2);
        a.print('S','U','D','H','A');
	}
}
