import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Prosta extends ConsoleProgram {
	public void run() {
		int a = readPositiveInt("Enter Positive number: ");
		
	}
		private int readPositiveInt(String a) {
			if (readInt() > 0) {
				return readInt();
			}else {
				println("Your number is negative!");
				return readInt("Enter Positive number: ");
			}
		}
		
}


