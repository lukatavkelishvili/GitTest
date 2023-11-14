import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram {
	private static final int RADIUS = 10;
	private GOval circle;
	public void run() {
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, getWidth(), getHeight());
		addMouseListeners();
	}
	

}
