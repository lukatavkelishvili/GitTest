
//36. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა 3-ჯერ ზედიზედ ამოვიდეს ბორჯღალო.
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Prosta extends GraphicsProgram {
	public void run() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				double length = Math.min(getWidth(), getHeight()) / 8;
				GRect a = new GRect(length, length);
				
				a.setFilled(i + j % 2 == 1);
				double x = j * length;
				double y = i * length;
				add(a, x, y);
				
			}
		}
	}
}