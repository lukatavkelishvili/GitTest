import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//მოხმარებელს აქვს საწყისი თანხა 1000, თამაშობს მანამ სანამ არ წააგებს ყველაფერს. ყოველ
//ჯერზე შეყავს ფსონის თანხა და რიცხვი რომელზეც დებს. ხდება რულეტკის დატრიალების
//სიმულაცია(0-დან 36-მდე შემთხვევითი რიცხვი), მოგების შემთხვევაში მოთამაშეს
//უორმაგედბა დადებული თანხა წაგების შემთხვევაში კი მოთამაშე კარგავს დადებულ თანხას.
//მოთამაშე მოგებულია მაშინ თუ რულეტკაზე ამოსული რიცხვი ემთხვევა მის მიერ დადებულ
//რიცხვს. პროგრამა ყოველ მოქმედებაზე უნდა ბეჭდავდეს შესაბამის შეტყობინებას, ადვილად
//რომ გაერკვეს მოთამაშე, რა რიცხვი ამოვიდა, რამდენი წააგო, რამდენი მოიგო, რამდენი აქვს
//ბალანსი.
public class Problem38 extends ConsoleProgram {
	private int money = 1000;
	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		while (money > 0) {
			int currMoney = readInt("Enter money to play: ");
			int num = readInt("Enter number from 0 to 36: ");
			if (currMoney > money || currMoney < 0) {
				println("Enter valid number of money!");
				currMoney = readInt("Enter money to play: ");
			}
			if (num < 0 || num > 36) {
				println("Enter valid number!");
				num = readInt("Enter number from 0 to 36: ");
			}
			
			int rolledN = rgen.nextInt(0, 36);
			println("Rolled number is: " + rolledN);
			if (rolledN == num) {
				money += currMoney;
				println("You won " + currMoney + " lari");
				println("Your current balance is " + money + " lari");
			}else {
				money -= currMoney;
				println("You lost " + currMoney + " lari");
				println("Your current balance is " + money + " lari");
			}
		}
	}

}
