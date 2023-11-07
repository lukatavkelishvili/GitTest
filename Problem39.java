import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	private static final int PAUSE_MS = 20;
	private static final int CIRCLE_DIAMETER = 50;
	public void run() {
		GOval circle = new GOval(CIRCLE_DIAMETER, CIRCLE_DIAMETER);
		add(circle, 0, getHeight() / 2);
		
		int vx = 5;
		int vy = 0;
		
		while (circle.getX() <= getWidth() - CIRCLE_DIAMETER) {
			circle.move(vx, vy);
			pause(PAUSE_MS);
			
		}
		
	}

}
