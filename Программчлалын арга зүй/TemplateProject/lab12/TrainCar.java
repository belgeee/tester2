package lab12;

import acm.graphics.*;
import java.awt.*;
/** This abstract class defines what is common to all train cars */
public abstract class TrainCar extends GCompound {
/**
* Creates the frame of the car using the specified color.
* @param color The color of the new train car
*/
public TrainCar(Color color) {
double xLeft = CONNECTOR;
double yBase = -CAR_BASELINE;
add(new GLine(0, yBase, CAR_WIDTH + 2 * CONNECTOR, yBase));
addWheel(xLeft + WHEEL_INSET, -WHEEL_RADIUS);
addWheel(xLeft + CAR_WIDTH - WHEEL_INSET, -WHEEL_RADIUS);
double yTop = yBase - CAR_HEIGHT;
GRect r = new GRect(xLeft, yTop, CAR_WIDTH, CAR_HEIGHT);
r.setFilled(true);
r.setFillColor(color);
add(r);
}
/* Adds a wheel centered at (x, y) */
private void addWheel(double x, double y) {
GOval wheel = new GOval(x - WHEEL_RADIUS, y - WHEEL_RADIUS,
2 * WHEEL_RADIUS, 2 * WHEEL_RADIUS);
wheel.setFilled(true);
wheel.setFillColor(Color.GRAY);
add(wheel);
}
/* Private constants */
protected static final double CAR_WIDTH = 75;
protected static final double CAR_HEIGHT = 36;
protected static final double CAR_BASELINE = 10;
protected static final double CONNECTOR = 6;
protected static final double WHEEL_RADIUS = 8;
protected static final double WHEEL_INSET = 16;
}