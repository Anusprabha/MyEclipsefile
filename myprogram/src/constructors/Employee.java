package constructors;

public class Employee {

	String name;
	int id;
	String designation;

	public Employee(String name, int id, String designation) {

		// Creating global Variable
		this.name = name;
		this.id = id;
		this.designation = designation;
	}

	// method is Created
	public void display() {
		System.out.println("Name is " + name);
		System.out.println("Id is " + id);
		System.out.println("designation is " + designation);
	}

}
