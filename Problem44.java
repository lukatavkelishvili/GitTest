import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//მაუსის კლიკზე იმავე ადგილზე ჩნდება ბურთი და იწყებს ვარდნას ძირს, თუ მაუსს სხვა
//ადგილზე ვაკლიკებ ბურთი გადადის ახალ ადგილზე და იქედან იწყებს ვარდნას
public class Problem44 extends GraphicsProgram {
	private static final int RADIUS = 50;
	private static final int V_Y = 5;
	private static final int DELAY = 20;
	public void run() {
		addMouseListeners();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		createCircle(e);
		circleStartsFalling();
		
	}
	private void circleStartsFalling() {
		
		
	}
	private void createCircle(MouseEvent e) {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, e.getX() + RADIUS, e.getY() + RADIUS);
		
	}

}
