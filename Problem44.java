import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;

//მაუსის კლიკზე იმავე ადგილზე ჩნდება ბურთი და იწყებს ვარდნას ძირს, თუ მაუსს სხვა
//ადგილზე ვაკლიკებ ბურთი გადადის ახალ ადგილზე და იქედან იწყებს ვარდნას
public class Problem44 extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		createCircle();
		circleStartsFalling();
		
	}

}
