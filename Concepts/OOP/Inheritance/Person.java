// Program to demonstrate simple inherence in java

class Employee{
	String name = "Amit";
	float salary = 50000;

}

class Person extends Employee{
	int emp_id = 1;
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("Employee name: " + p1.name);
		System.out.println("Employee salary: " + p1.salary);
		System.out.println("Employee id: " + p1.emp_id);
	}
}