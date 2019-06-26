package helloWorl;

/*
 * This is the first line of a comment
 * This is a second line of a comment
 */
public class MainHelloWorld {
	public static void main(String[] args) {
//		This is a stand alone commnet
	/*	System.out.println("Hello Wolrd One"); //This  is a comment
		System.out.println("Hello Wolrd Two");
		System.out.println("Hello Wolrd Three");
		*/
//		Operator Precedence
	/*	int valA = 21;
		int valB = 6;
		int valC = 3;
		int valD = 1;
		
		int result1 = valA - valB / valC;
		
		int result2 = (valA - valB) / valC;
		System.out.println(result1);
		System.out.println(result2);	
		
		int result3 = valA / valC * valD + valB;
		
		int result4 = valA / (valC * (valD + valB));
		
		System.out.println(result3);
		System.out.println(result4);*/
		
		float floatVal = 1.0f;
		double doubleVal = 4.0d;
		byte byteVal = 7;
		short shortVal = 7;
		long longVal = 5;
		
		short result1 = (short)byteVal;
		short resutl2 = (short)(byteVal - longVal);
		double result3 = longVal - doubleVal;
		long result4 = (long)(shortVal - longVal + floatVal + doubleVal);
		
		System.out.println("Success");
		
		String name = "jim";
		System.out.println("Hi " + name);
		String greeting = "Hello";
		greeting += " ";
		greeting += "World";
		System.out.println(greeting );
		
	}
	
	

}
