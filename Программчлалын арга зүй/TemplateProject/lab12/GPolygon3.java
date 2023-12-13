package lab12;

import acm.graphics.*;

public class GPolygon3 extends GPolygon {
	
	public GPolygon3(double width, double height) {
		addVertex(0, -height / 2);
		addVertex(width / 2, 0);
		addVertex(0, height / 2);
		addVertex(-width / 2, 0);
	}

}
