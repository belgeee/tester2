package lab12;

/*
 * Chapter 9, exercise 3
 * this program has to ways of displaying labels
 * one static with random positions and random colors different from labels
 * second displays labels in the center of window in a loop
 * assigning random colors to random labels and color of the label
 * is chosen randomly and is never the same as text label 
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import acm.util.*;
public class LabelsColor3 extends GraphicsProgram {
	public void run(){
		
		String text = "";
		GLabel label = new GLabel(text);
		label.setFont("Arial-bold-48");
		double xLabel = (getWidth() - label.getWidth()) / 2;
		double yLabel = (getHeight() - label.getHeight()) / 2;
		add(label, xLabel, yLabel);
		while(true){
			
			int labelText = rgen.nextInt(1, 7);
			int colorNum = rgen.nextInt(1, 7);
			while(labelText==colorNum){
				colorNum = rgen.nextInt(1, 7);
			}
			Color randomColor = chooseColor(colorNum);
			switch(labelText){
			case 1: text = "RED"; break;
			case 2: text = "ORANGE"; break;
			case 3: text = "YELLOW"; break;
			case 4: text = "GREEN"; break;
			case 5: text = "CYAN"; break;
			case 6: text = "BLUE"; break;
			case 7: text = "MAGENTA"; break;
			default: break;
			}
			label.setLabel(text);
			label.setLocation((getWidth() - label.getWidth()) / 2, yLabel);
			label.setColor(randomColor);
			
			pause(500);
			
		}
	}
	private Color chooseColor(int rNum){
		
		switch(rNum){
		case 1: return Color.RED;
		case 2: return Color.ORANGE;
		case 3: return Color.YELLOW;
		case 4: return Color.GREEN;
		case 5: return Color.CYAN;
		case 6: return Color.BLUE;
		case 7: return Color.MAGENTA;
		default: return Color.BLACK;
		}
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
