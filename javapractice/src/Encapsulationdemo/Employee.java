package Encapsulationdemo;

public class Employee {
	private String name;
	public void setname(String name) {
		this.name=name;
	}
    public String getname() {
    	return name;
    }
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setname("Sudha");
		System.out.println("The name is : " + obj.getname());
	}
}
