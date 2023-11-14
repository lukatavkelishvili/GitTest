import acm.program.ConsoleProgram;

public class Problem15 extends ConsoleProgram {
	public void run() {
//		int firstNum = readInt("Enter first number: ");
//		int secondNum = readInt("Enter second number: ");
//		
//		double avg = (firstNum + secondNum) / 2.0;
//		println(avg);
//	}
		int a = readInt ("Enter first number: ");
		int b = readInt ("Enter second number: ");
		double c = (double)(a + b) / 2;		
		println("Average number is: " + c);
	}
}
