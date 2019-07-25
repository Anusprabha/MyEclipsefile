package myjavaprograms;

public class Datatypes {

	public static void main(String[] args) {
		
 boolean flag = true;//boolean data type has two possible values, either true or false
 
 byte range=124;//byte data type can have values from -128 to 127
                //(8-bit signed two's complement integer)
 
 short temperature=-101;//short data type can have values from -32768 to 32767
                        //(16-bit signed two's complement integer)
 
 int a=489908;//int data type can have values from -2^31 to 2^31-1 
              //(32-bit signed two's complement integer).
 
 long l=327318253L;//long data type can have values from -2^63 to 2^63-1
                   // (64-bit signed two's complement integer).
 
 double d=-330.7;//double data type is a double-precision 64-bit floating point.
 
 float b=77788f;//float data type is a single-precision 32-bit floating point.
 
 char ch= 65;//char is a 16-bit Unicode character.
 
 System.out.println("boolean value is " +flag);
 System.out.println("byte value is " +range);
 System.out.println("short value is "+temperature);
 System.out.println("int value is "+a);
 System.out.println("long value is "+l);
 System.out.println("double value is "+d);
 System.out.println("float value is "+b);
 System.out.println("char value is "+ch);
	}

}
