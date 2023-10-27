import acm.program.ConsoleProgram;

public class Phnduejd extends ConsoleProgram{
	public void run() {
		int d = readInt("Enter number: " );
		int integerPart = (int)d;
		double fractionPart = d - integerPart;
		println("integerPart: " + integerPart);
		println("fractionPart: " + fractionPart);
	}
}
