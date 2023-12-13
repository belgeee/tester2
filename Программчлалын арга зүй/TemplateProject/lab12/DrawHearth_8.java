package lab12;
import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
public class DrawHearth_8 extends GraphicsProgram {
	public void run(){
		double x = getWidth()/2;
		double y = getHeight()/2;
		GPolygon heart = new GPolygon();
		heart.addVertex(-70, 0);
		heart.addEdge(70, 70);
		heart.addEdge(70, -70);
		heart.addArc(100, 100, -45, 180);
		heart.addArc(100, 100, 45, 180);
		heart.setFilled(true);
		heart.setColor(Color.RED);	
		add(heart, x, y);		
	}
}