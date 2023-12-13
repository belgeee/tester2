package lab13;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.program.*;

public class test2 extends GraphicsProgram{
	public void init(){
		label=new GLabel("");
		add(label);
		addMouseListeners();
	}
	public void mouseMoved(MouseEvent e){
		int x=e.getX();
		int y=e.getY();
		label.setLabel("(" + x + ", " + y + ")");
		label.setLocation(x,y);
	}
private GLabel label;
}
