import acm.program.ConsoleProgram;

//მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
//შებრუნებით, 1256 -> 6521
public class Problem30 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter number: ");
		
		int reversedNumber = reversed(a);
		println("Reversed number is: " + reversedNumber);
	}

	private int reversed(int a) {
		int result = 0;
		while (a != 0) {
			int lastDigit = a % 10;
			a /= 10;
			result = result * 10 + lastDigit;
		}
		return result;
	}

}
