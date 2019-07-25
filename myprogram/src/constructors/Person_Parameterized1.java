package constructors;

public class Person_Parameterized1 {

	public static void main(String[] args) {
		
		//creating objects		
		Person_Parameterized raju=new Person_Parameterized(25,"raju");
		Person_Parameterized venkat=new Person_Parameterized(30, "venkat");
		
		//displaying values of the object
		raju.check();
		venkat.check();
	}

}
