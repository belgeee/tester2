package Graphics;
//apple_1
import java.awt.Color;
import acm.program.*;
import acm.graphics.GMath;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
public class Diamond extends GraphicsProgram{
	public void run(){
		double h=getHeight()/2;
		double w=getWidth()/2;
		double width = 20;
		double height = 60;
		double r = (Math.pow(width, 2) + Math.pow(height, 2)) / (4 * width);
		double angle = GMath.angle(r - (width /2), height / 2);
		GPolygon leather=new GPolygon();
        leather.addVertex(20,20);
		leather.addVertex(width / 2, 0);// x, y iin zvvn bulan
		leather.addArc(r * 2, r * 2, -angle, angle * 2);
		leather.addArc(r * 2, r * 2, 180 - angle, angle * 2);
		leather.setFilled(true);
		leather.setColor(Color.gray);
		leather.rotate(-45);
		add(leather,w+45,0);
        GPolygon apple=new GPolygon();
        apple.addVertex(20, 20);
        apple.addArc(100, 130, -100, 220);
		apple.addArc(100, 130, 60, 220);
        apple.setFilled(true);
		apple.setColor(Color.gray);	
        add(apple, w,h+70);
        GPolygon hazalt=new GPolygon();
        hazalt.addVertex(0,0);
        hazalt.addArc(100,100,180,360);
        hazalt.setFilled(true);
        hazalt.setColor(Color.white);
        add(hazalt,2*w-45,h);
        
        
	}
}

