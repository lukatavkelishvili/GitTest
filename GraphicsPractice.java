import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsPractice extends GraphicsProgram {
	public void run() {
		
		add (new GRect(100, 200));
		
		GRect myRect = new GRect(100, 200);
		add (new GRect(100, 150));
	}
}
