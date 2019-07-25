package constructors;

public class Person_Parameterized {

	// Initialization of data types and variable
	private int age;
	private String name;
	
	//Constructor is created
	public Person_Parameterized(int age,String name) {
	
	// Global variable is created
	this.age=age;
	this.name=name;
	}
	
	//method is created to display the value of id and name
    public void check() {
    System.out.println("The age is "+age);
    System.out.println("The name is "+name);
	   

		
	}

}
