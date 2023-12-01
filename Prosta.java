import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Prosta extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter positive number: ");
		while (a < 0) {
			println("number is negative!");
			a = readInt("Enter positive number: ");
		}
	}
		
}


