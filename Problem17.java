import acm.program.ConsoleProgram;

public class Problem17 extends ConsoleProgram {
	public void run() {
		double d = readDouble();
		int integerPart = (int)d;
		double fractionPart = d - integerPart;
		println("integerPart: " + integerPart);
		println("fractionPart: " + fractionPart);
	}

}
