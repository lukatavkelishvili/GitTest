//წრეწირის drag ით გადაადგილება

import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram {
	private static final int RADIUS = 10;
	private double prevX;
	private double prevY;
	private GOval circle;
	public void run() {
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, getWidth() / 2, getHeight() / 2);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		
		prevX = e.getX();
		prevY = e.getY();
	}
	
	public void mouseDragged(MouseEvent e) {
		circle.move(e.getX() - prevX, e.getY() - prevY);
	}
	

}
