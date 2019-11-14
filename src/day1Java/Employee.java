package day1Java;

public class Employee {
	public void empId() {
		System.out.println("employee id");

	}
	public void empName() {
		System.out.println("employee name is");

	}
	public void emplDob() {
		System.out.println("Employee DOB");

	}
	public void empAddress() {
		System.out.println("Employee Address");

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.emplDob();
		e.empAddress();
		
	}

}
