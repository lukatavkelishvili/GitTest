import stanford.karel.Karel;

public class Problem06 extends Karel {
	
	public void run() {
		if (noBeepersPresent()) {
			putBeeper();
		}
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				move();
				putBeeper();
			}
		}
	}

}
