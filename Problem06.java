import stanford.karel.Karel;

public class Problem06 extends Karel {
	
	public void run() {
		while (frontIsClear()) {
			lineWalk();
			turnLeft();
		if (frontIsClear()) {
			move();
		}
			turnLeft();
			lineWalk();
			turnRight();
		if (frontIsClear()) {
			move();
		}
			;
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
