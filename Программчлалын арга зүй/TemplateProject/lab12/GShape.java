package lab12;

import acm.graphics.*;

public class GShape extends GPolygon {
	
	public GShape (double width) {
		double segment = width / 3;
		addVertex(0, 0);
		addVertex(width, 0);
		addVertex(width, segment);
		addVertex(segment * 2, segment);
		addVertex(segment * 2, segment * 3);
		addVertex(segment, segment * 3);
		addVertex(segment, segment);
		addVertex(0, segment);
	}

}

