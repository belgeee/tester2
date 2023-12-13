import acm.graphics.*;
import acm.program.*;
 
public class Headline714 extends GraphicsProgram {
     
    public void run() {
//bairlal
        double x = getWidth();
        double y = getHeight()*0.8;
        GLabel headline = new GLabel("SE, Belegdemberel 21B1NUM2890", x, y);
        headline.setFont("sansSerif-90");
        add(headline);
//scroll
        int dx = -1;
        int dy = 0;
        while (true) {
            headline.move(dx, dy);
            pause(PAUSE_TIME);
        }
    }
    // Constants
    private static final int PAUSE_TIME = 5;
}