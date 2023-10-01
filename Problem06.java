import stanford.karel.Karel;

public class Problem06 extends Karel {
	
	public void run() {
		while (frontIsClear()) {
		lineWalk();
		turnLeft();
		move();
		turnLeft();
		lineWalk();
		turnRight();
		move();
		turnRight();
		}
		
		
		
		
	}
	private void lineWalk() {
		if (noBeepersPresent()) {
			putBeeper();
		}
		while (frontIsClear()) {
			move();
		if (noBeepersPresent()) {
			putBeeper();
		}
		}
	
	}
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
}
