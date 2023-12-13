package lab12;

import java.awt.Color;

import acm.program.GraphicsProgram;
public class DrawTrain13 extends GraphicsProgram{

	public void run(){
		int x=getWidth();
		Train train = new Train();
		train.append(new Engine(Color.black));
		train.append(new Boxcar(Color.GREEN));
		train.append(new Boxcar(Color.blue));
		train.append(new Boxcar(Color.magenta));
		train.append(new Caboose(Color.red));
		add(train,x,getHeight()/2);
		int dx=-1;
		int dy=0;
		while(true) {
			pause(10);
			train.move(dx,dy);
			x+=dx;
		}
		
	}
	public static void main(String[] args) {
		new DrawTrain13().start();
	}
}