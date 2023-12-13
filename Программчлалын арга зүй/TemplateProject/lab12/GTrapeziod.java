package lab12;

import acm.graphics.*;

public class GTrapeziod extends GPolygon {
	
	public GTrapeziod(int a, int b, int h) {
		addVertex(0, 0);
		addVertex(a, 0);
		addVertex(a + ( (b - a) / 2), h);
		addVertex( -((b - a) / 2), h);
	}

}
