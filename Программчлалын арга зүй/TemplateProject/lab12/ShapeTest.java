package lab12;
import acm.program.*;

public class ShapeTest extends GraphicsProgram {
	
	public void run() {
		GPolygon3 d = new GPolygon3(100, 150);
		add(d, 500, 200);
		GTrapeziod t = new GTrapeziod(200, 300, 150);
		add(t, 150, 150);
		GTriangle g=new GTriangle(300);
		add(g, 300,530);
		GShape L=new GShape(200);
		add(L,100,350);
		
	}

}

