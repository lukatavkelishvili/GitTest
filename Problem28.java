//მომხმარებელს შეყავს დადებითი რიცხვები, მანამ სანამ არ შეიყვანს -1 ს, დაბეჭდეთ
//რაოდენობა რამდენი ლუწი რიცხვი შეყვანა მომხმარებელმა.

import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	public void run() {
		while (true) {
			int a = readInt("Enter positive number: ");
			if (a <= 0) {
				println("You should enter only positive number!");
			}
			if (a == -1) {
				break;
			}
		}
	}

}
