//მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს
//რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო

import acm.program.ConsoleProgram;

public class Problem45a extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		char symbol = readLine("Enter symbol: ").charAt(0);
		
//		int a = 0;
//		for (int i = 0; i < text.length();) {
//			if (text.charAt(i) == symbol) {
//				a += 1;
//			}
//		}
		println("In your text your symbol is repetited " + a + " times.");
	}

}
