import acm.program.ConsoleProgram;

public class Problem20 extends ConsoleProgram {
	public void run() {
//		int n = readInt("Enter number: ");
//		
//		int b = 0;
//		for (int i = 0; i < n; i++) {
//			int a = readInt("Enter number: ");
//			b += a;
//		}
//		println("b" + b);
		
		int n = readInt ("Enter number: ");
		int b = 0;
		for (int i = 0; i < n; i++) {
			int a = readInt ("Enter num: ");
			b += a;
		}
		println("Total is: " + b);
		
	}

}
