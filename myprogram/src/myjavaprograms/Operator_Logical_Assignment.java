package myjavaprograms;

public class Operator_Logical_Assignment {

	public static void main(String[] args) {
		int a = 50;
		int b = 10;
		int c = 30;
		int d = a + b + c;
		System.out.println("d is " + d);

		if ((d >= 10) && (d <= 70)) {
			System.out.println("Fail");
		}
		if ((d >= 70) && (d <= 100)) {
			System.out.println("Pass");
		}
		if ((d >= 100) && (d <= 150)) {
			System.out.println("Great");
		}
	}
}
// AND &&
// true&&true=true
// true&&false=false
// false&&true=false
// false&&false=false

// OR||
// true||true=true
// true||false=true
// false||true=true
// false||false=false

// !!NOT(Opposite!)
// !true!true=false false
// !true!false=false true
// !false!true=true false
// !false!false=true true