package org.college;


public class Dept extends Hostel {
	public void deptname() {
		System.out.println("Department name");
	}

	public static void main(String[] args) {
      Dept obj=new Dept();
      obj.collegename();
      obj.collegecode();
      obj.collegerank();
      obj.studentname();
      obj.studentId();
      obj.studentdepartment();
      obj.hostelname();
      obj.deptname();
	}

}
