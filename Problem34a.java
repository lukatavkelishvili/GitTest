import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem34a extends GraphicsProgram {
	private static final int CIRCLE_NUM = 1000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		for (int i = 0; i < CIRCLE_NUM; i++) {
			double x = rgen.nextDouble(25, 200);
			double y = rgen.nextDouble(25, 200);
			double radius = rgen.nextDouble(25, 200);
			Color color = rgen.nextColor();
			
			GOval circle = new GOval(x, y, 2 * radius, 2 * radius);
			circle.setFilled(true);
			circle.setColor(color);
			
			add(circle);		}
	}

}
