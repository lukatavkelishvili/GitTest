import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Prosta extends ConsoleProgram {
	public void run() {
		int a = readPositiveInt();
		println(a);
		
	}
		private int readPositiveInt() {
			if (readInt() > 0) {
				return readInt("Enter Positive number: ");
			}else {
				println("Your number is negative!");
				return readInt("Enter Positive number: ");
			}
		}
		
}


