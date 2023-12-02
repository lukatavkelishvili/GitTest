import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//რულეტკა, მომხმარებელს შეყავს 0 დან 36 მდე რიცხვი, შემდეგ ხდება რულეტკის
//დატრიალების სიმულაცია, კონსოლში უნდა დაიბეჭდოს ამოსული რიცხვი და მოიგო თუ არა
//დადებულმა რიცხვმა
public class Problem37 extends ConsoleProgram {
	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int a = readInt("Enter num between 0 to 36: ");
		if (a > 1 || a < 0) {
			println("Enter valid number! ");
			a = readInt("Enter num between 0 to 36: ");
		}
		int result = rgen.nextInt(0, 2);
		println("Chosen number is: " + result);
		if (result == a) {
			println("You won!");
		}else {
			println("You lost!");
		}
			
		
	}

}
