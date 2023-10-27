import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	private static final int WINDOW_HEIGHT = 60;
	private static final int WINDOW_WIDTH = 30;
	private static final int BODY_HEIGHT = 200;
	private static final int BODY_WIDTH = 300;
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
		add(walls, (getWidth() / 2) - (BODY_WIDTH / 2), (getHeight() / 2));
		
	}
}

		