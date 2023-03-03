package Abstractiondemo1;

public class Sections extends College {
	void college() {
	       System.out.println("No.of.sections in the departments");		
		}

	public static void main(String[] args) {
		College obj=new Department();
		obj.studentname();
		Department obj1=new Department();
		obj1.college();
		Sections obj2=new Sections();
		obj2.college();
	}
}
