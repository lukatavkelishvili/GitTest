import stanford.karel.Karel;

public class Problem05 extends Karel {
	
	public void run() {
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

}
