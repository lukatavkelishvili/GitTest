import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem13 extends GraphicsProgram {
//	public void run() {
//		int x1 = 0;
//		double y1 = getHeight() / 2;
//		double x2 = getWidth();
//		
//		GLine consLine = new GLine(x1, y1, x2, y1);
//		add(consLine);
//	}

	public void run() {
		GLine consLine = new GLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
		add(consLine);
	}
}
