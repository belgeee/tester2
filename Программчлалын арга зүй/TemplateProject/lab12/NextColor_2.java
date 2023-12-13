package lab12;

import java.awt.Color;

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class NextColor_2 extends GraphicsProgram {
	
	public void run() {
		double h=getHeight();
		double w=getWidth();
		
		GRect square = new GRect(w , h);
		square.setFilled(true);
		square.setFillColor(Color.BLACK);
		add(square, getWidth() / 2 - square.getWidth() / 2,
				    getHeight() / 2 - square.getHeight() / 2);
		while (true) {
			pause(1000);
			Color c = rgen.nextColor();
			square.setColor(c);
			square.setFillColor(c);
		}
	}
	private RandomGenerator rgen = new RandomGenerator();

}
