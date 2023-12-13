package lab12;

/*
 * Chapter 9, ex. 10, Pascal Triangle
 */
import acm.program.*;
import acm.graphics.*;
public class PascalTriangle_10 extends GraphicsProgram {
	public void run(){
		int n = 0;
		double r = 20;//bombogiin radius
		String combinations = "";//хослолын үр дүнг мөр болгох бүхэл тоо
		GLabel label = new GLabel("");// combinations(); funtstsiin vr dvn
		double y = 50;// dugui bolon labeliin y
		double x = getWidth() / 2 - label.getWidth() / 2;//label bolon duguin x 

		for(int k = 0; k <= n; k++){
			combinations = Integer.toString(combinations(n, k));//integer to string combinations-ii vr dvn
			label = new GLabel(combinations);
			add(label, x, y);
			
			GOval circle = new GOval(2 * r, 2 * r);
			add(circle, x - r , y - r );
			pause(500);
			x+=60;//60aar hajuutiisheegee hodolno
			
			if(k == n){
				//huwisagchaa shinechelne
				n++;
				y+=50;
				k = -1;
				x = getWidth() / 2 - (((label.getWidth() * n) / 2 + 60 * (n)) / 2 );
			}
			//herwee dugui tsonhnii gadna ochwol zogsono - break
			if(circle.getY() > getHeight()) break;
		}
		
	}
	private int combinations(int n, int k){
		return factorial(n) / (factorial(k) * factorial(n - k));
	}
	private int factorial(int n){
		int result = 1;
		for(int i = 1; i <= n; i++){
			result *= i;
		}
		return result;
	}
}
