	package lab12;
	import acm.graphics.*;
	public class GLens extends GPolygon {
		public GLens(double width, double height){
			double r = (Math.pow(width, 2) + Math.pow(height, 2)) / (4 * width);
			double angle = GMath.angle(r - (width /2), height / 2);
	
			addVertex(0, 0);
			addArc(r * 2, r * 2, -angle, 2*angle);
			addArc(r * 2, r * 2, 180- angle, 2*angle );
		}
	}
	
