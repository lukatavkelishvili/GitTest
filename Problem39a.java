//დაწერეთ პროგრამა სადაც იქნება კანვასზე ბურთის მოძრაობა მარცხენა კედლის შუა
//წერტილიდან მარჯვენა კედლამდე.


import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem39a extends GraphicsProgram {
	private static final int RADIUS = 30;
	public void run() {
		
		double x = 0;
		double y = getHeight() / 2 - RADIUS;
		
		GOval circle = new GOval(x, y, 2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle);
		
		while (x <= getWidth() - 2 * RADIUS) {
			circle.move(5, 0);
			pause(20);
		}
		
	}

}
