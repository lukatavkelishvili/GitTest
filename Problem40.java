//წინა ამოცანის გაგრძელება, დაამატეთ ვერტიკალური კედლებიდან ასხლეტვა. ანუ ბურთი
//მოძრაობს მარცხენა კედლიდან მარჯვნივ. როგორც კი მარჯვენა კედელს დაეტაკება იმავე
//სიჩქარით უნდა გააგრძელოს მოძრაობა მაჯვენა კედლიდან მარცხნივ. როგორც კი მარცხენა
//კედელს დაეტაკება უნდა გააგრძელოს მარჯვნივ და ა.შ. უსასრულოდ.

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem40 extends GraphicsProgram {
	private static final int RADIUS = 30;
	public void run() {
		double x = 0;
		double y = getHeight() / 2 - RADIUS;
		
		GOval circle = new GOval(x, y, 2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle);
		int vx = 5;
		int vy = 0;
		
		while(true) {
			
			if (circle.getX() < 0 || circle.getX() + 2 * RADIUS >= getWidth()) {
				vx = - vx;
			}
			circle.move(vx, vy);
			pause(20);
		}
	}

}
