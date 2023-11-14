import acm.program.ConsoleProgram;

public class Problem17 extends ConsoleProgram {
	public void run() {
//		double d = readDouble("Enter number: " );
//		int integerPart = (int)d;
//		double fractionPart = d - integerPart;
//		println("integerPart: " + integerPart);
//		println("fractionPart: " + fractionPart);
		
		double a = readDouble ("Enter number: ");
		int b = (int)a;
		double c = a - b;
		
		println ("Integer part is: " + b);
		println ("Fraction part is: " + c);
		
	}

}
