//დაწერეთ პროგრამა რომელიც კანვასზე დახატავს შემთხვევითი ფერის მქონე წრეწირს,
//რაიდიუსიც შემთხვევით აირჩეით შეზღუდული რეინჯიდან.


import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem33 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		double radius = rgen.nextDouble(5, 150);
		double x = rgen.nextDouble(20,200);
		double y = rgen.nextDouble(10,125);
		Color color = rgen.nextColor();
		
		GOval circle = new GOval(x, y, 2 * radius, 2 * radius);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}

}
