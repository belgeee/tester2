import java.awt.*;
import acm.program.*;
import acm.graphics.*;

public class BouncingBall713 extends GraphicsProgram {
    public void run() {
        GOval ball = new GOval (getWidth()/2 - BALL_SIZE/2, getHeight()/2 - BALL_SIZE, BALL_SIZE, BALL_SIZE);               /* Centers the ball */
        ball.setFilled(true);
        ball.setFillColor(Color.BLUE);
        ball.setColor(Color.BLUE);
        add(ball);
        double dx = (getWidth()/N_STEPS);
        double dy = (getWidth()/N_STEPS);
        while(true) {
            ball.move(dx, dy);                                   
            pause(PAUSE_TIME);
            if (ball.getY() > getHeight() - BALL_SIZE) {        
                dy = dy * -1;                                                       
            }
            if(ball.getX() > getWidth()- BALL_SIZE) {
                dx = dx * -1;
            }
            if(ball.getY() < 0) {
                dy = dy * -1;
            }
            if(ball.getX() < 0) {
                dx = dx * -1;
            }
        }
    }
    private static final double N_STEPS = 1000;
    private static final double PAUSE_TIME = 2;
    private static final double BALL_SIZE = 50.0;
}
