import acm.graphics.*;
import acm.program.*;

public class pyramid79 extends GraphicsProgram {
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE =13;
	public void run() {

        int height  = getHeight();
        int width   = getWidth();
        int middle  = width/2;

        for(int row=BRICKS_IN_BASE; row>0; row--) {
            int startPositionX = middle - (row/2 * BRICK_WIDTH) - ((row%2)*(BRICK_WIDTH/2));
            int startPositionY = height - ((BRICKS_IN_BASE-row+2)*BRICK_HEIGHT);
            for(int brickCounter = 0; brickCounter<row; brickCounter++) {
                int x = startPositionX+(BRICK_WIDTH*brickCounter);
                GRect brick = new GRect(x, startPositionY, BRICK_WIDTH, BRICK_HEIGHT);
                add(brick);
            }
        }

	}
}