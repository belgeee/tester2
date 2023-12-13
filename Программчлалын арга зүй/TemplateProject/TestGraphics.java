import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class TestGraphics extends GraphicsProgram{
		private static final int r = 20;
		public void run() {
			int i=0;
			int n=5;
			double centerX = (double) getWidth()/2;
			double centerY = (double) getHeight()/2;
			while(i<n){
				double s=n*r;
				GOval o = new GOval(centerX - (s)/2, centerY - (s)/2, s, s);
				add(o);
				if(n%2==0){
					o.setColor(Color.white);
					o.setFilled(true);
					o.setFillColor(Color.white);
				}
				else if(n%2==1){
					o.setColor(Color.red);
					o.setFilled(true);
					o.setFillColor(Color.red);
				}
				n--;
			}	
	}
	public static void main(String[] args) {
		new TestGraphics().start();
	}
}
