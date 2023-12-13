package lab12;

import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;

/**
* This class represents a boxcar. Like all TrainCar subclasses,
* a Boxcar is a graphical object that you can add to a GCanvas.
*/
public class Engine extends TrainCar {
/**
* Creates a new boxcar with the specified color.
* @param color The color of the new boxcar
*/
public Engine(Color color) {
super(color);
GRect a=new GRect(CAR_WIDTH/2+CAR_BASELINE,-CAR_WIDTH+3*CONNECTOR, DOOR_WIDTH+2*CAR_BASELINE-CONNECTOR+1, DOOR_HEIGHT);
a.setFilled(true);
a.setFillColor(color);
add(a);
GRect b=new GRect(CONNECTOR+CAR_BASELINE,-CAR_WIDTH+3*CONNECTOR,CAR_BASELINE,CAR_BASELINE);
b.setFilled(true);
b.setFillColor(color);
add(b);
GLine line = new GLine(CONNECTOR/2, -CAR_BASELINE,CONNECTOR ,-3*CAR_BASELINE);
add(line);
GLine line1 = new GLine(0, -CAR_BASELINE,CONNECTOR ,-3*CAR_BASELINE);
add(line1);

}
private static final double DOOR_WIDTH = 18;
private static final double DOOR_HEIGHT = 32;
}