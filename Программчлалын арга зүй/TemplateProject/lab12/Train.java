package lab12;

import acm.graphics.*;
/**
 * This class defines a GCompound that represents a train.
 * The primary operation is append, which adds a TrainCar
 * at the end of the train.
 */
public class Train extends GCompound {
/**
 * Creates a new train that contains no cars. Clients can add
 * cars at the end by calling append.
 */
 public Train() {
 /* No operations necessary */
 }
/**
 * Adds a new car to the end of the train.
 * @param car The new train car
 */
 public void append(TrainCar car) {
 double width = getWidth();
 double x = width - TrainCar.CONNECTOR+15;
 add(car, x, 0);
 }
}