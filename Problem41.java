//გააკეთეთ Paint-ის ფანქრის ანალოგიური ხელსაწყო. კერძოდ, მაუსის ყოველ მოძრაობაზე
//ეკრანზე დაამატეთ გაფერადებული წრეწირები იმავე წერტილში სადაც მაუსი მდებარეობს.

import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem41 extends GraphicsProgram {
	private static final int RADIUS = 20;
	public void run() {
		addMouseListeners();
	}
	public void MouseClicked(MouseEvent e) {
		addCircle(e.getX(), e.getY());
	}
	public void addCircle(double x, double y) {
		GOval circle = new GOval(RADIUS * 2, RADIUS * 2);
		circle.setFilled(true);
		add(circle, x - RADIUS, y - RADIUS);
	}

}
