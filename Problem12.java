import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	private static final int WINDOW_HEIGHT = 200;
	private static final int WINDOW_WIDTH = 100;
	private static final int BODY_HEIGHT = 600;
	private static final int BODY_WIDTH = 1000;
	public void run() {
		drawBody();
//		drawRoof();
//		drawWindows();
//		drawDoor();
		
	}
	private void drawDoor() {
		// TODO Auto-generated method stub
		
	}
	private void drawWindows() {
		// TODO Auto-generated method stub
		
	}
	private void drawRoof() {
		// TODO Auto-generated method stub
		
	}
	private void drawBody() {
		GRect walls = new GRect(BODY_WIDTH, BODY_HEIGHT);
		add(walls, (getWidth() / 2) - (BODY_WIDTH / 2), (getHeight() / 2) - (BODY_HEIGHT / 2) );
		
	}
}

		