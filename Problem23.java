import acm.program.ConsoleProgram;

public class Problem23 extends ConsoleProgram {
	public void run() {
//		int n = readInt("Enter number: ");
//		int sumN = sumN(n);
//		
//		println("Sum of the nums 1...n is: " + sumN);
//	}
//
//	private int sumN(int n) {
//		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			sum += i;  // sum=sum+i
//		}
//		return sum;
		
		int a = readInt ("Enter integral number: ");
		int b = 0;
		for ( int i = 1; i <= a; i++) {
			b += i;
			
		}
		println(b);
	}

}
