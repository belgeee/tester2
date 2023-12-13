package lab12;

import java.awt.Color;

import acm.graphics.GRect;

/**
* This class represents a boxcar. Like all TrainCar subclasses,
* a Boxcar is a graphical object that you can add to a GCanvas.
*/
public class Caboose extends TrainCar {
/**
* Creates a new boxcar with the specified color.
* @param color The color of the new boxcar
*/
	public Caboose(Color color) {
		super(color);
		GRect a=new GRect(3*CAR_BASELINE-CONNECTOR,-CAR_WIDTH+2*CAR_BASELINE,3*CAR_BASELINE+CONNECTOR,CAR_BASELINE-1 );
		a.setFilled(true);
		a.setFillColor(color);	
		add(a);
}
/* Dimensions of the door panels on the boxcar */
}