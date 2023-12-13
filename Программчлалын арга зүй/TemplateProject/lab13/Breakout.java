package lab13;

import acm.graphics.*;

import acm.program.*;
import acm.util.RandomGenerator;
//import java.applet.*;
import java.awt.Color;
import java.awt.event.*;
public class Breakout extends GraphicsProgram {
	public static final int APPLICATION_WIDTH = 1300;
	public static final int APPLICATION_HEIGHT = 600;

	private static final int WIDTH = 1300;
	private static final int HEIGHT = 600;

	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;
	private static final int NBRICKS_PER_ROW = 10;

	private static final int NBRICK_ROWS = 10;

	private static final int BRICK_SEP = 4;
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

	private static final int BRICK_HEIGHT = 8;

	private static final int BALL_RADIUS = 10;

	private static final int NTURNS = 3;

	private double dx, dy;

	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int DELAY = 10;
	public void run(){
		setBackground(Color.GRAY);
		gameSetUp();
		brickCounter = 5;
		for(i = 0; i < NTURNS; i++){
			playGame();
			if(brickCounter == 0){
				winner();
				ball.setVisible(false);
				break;
			} else if(i == 2){
				exhaustedTurns();
				break;
			}
		}
	}

	private void gameSetUp(){
		bricks();
		paddle();
	}
	
	
	private void bricks(){
		for(int row = 0; row < NBRICK_ROWS; row++){
			for(int col = 0; col < NBRICKS_PER_ROW; col++){
				double x = col * (BRICK_WIDTH + 4) ;
				double y = row * (BRICK_HEIGHT + 5) + 70;
				brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				brick.setFilled(true);
				if(row <= 1){
					brick.setColor(Color.RED);
				} else if(row > 1 && row <= 3){
					brick.setColor(Color.ORANGE);
				} else if(row > 3 && row <= 5){
					brick.setColor(Color.YELLOW);
				} else if(row > 5 && row <= 7){
					brick.setColor(Color.GREEN);
				} else if(row > 7 && row <= 9){
					brick.setColor(Color.CYAN);
				}
				add(brick);
			}
		}
	}
	
	private void paddle(){
		double paddleX = (getWidth() - PADDLE_WIDTH) / 2;
		double paddleY = getHeight() - 70;
		paddle = new GRect(paddleX, paddleY, PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		add(paddle);
		addKeyListeners();
	}
	
	public void keyPressed(KeyEvent e){
		if(paddle.getX() > 0 && e.getKeyCode() == KeyEvent.VK_LEFT){
			paddle.move(-10, 0);
		} else if((paddle.getX() + paddle.getWidth()) < getWidth() && e.getKeyCode() == KeyEvent.VK_RIGHT){
			paddle.move(10, 0);
		}
	}
	
	private void ball(){
		double ballX = getWidth() / 2 - BALL_RADIUS;
		double ballY = getHeight() / 2 - BALL_RADIUS;
		ball = new GOval(ballX, ballY, BALL_RADIUS * 2, BALL_RADIUS * 2);
		ball.setFilled(true);
		add(ball);
		
	}
	private void getBallVelocity(){
		dx = 2;
		dy = 1;
	}
	
	private void bounceBall(){
			ball.move(dx, dy);
			if ( ball.getY() < 0) {
				dy = -dy;	
			}
			if (ball.getX() > getWidth() - 2 * BALL_RADIUS || ball.getX() < 0) {
				dx = -dx;
			}
			collider = getCollidingObject();
			if(collider == paddle){
				dy = -dy;
			} else if(collider != null){
				remove(collider);
				brickCounter--;
				dy = -dy;
			} 
			pause(DELAY);
	}
	
	private GObject getCollidingObject(){
		if(getElementAt(ball.getX(), ball.getY()) != null){
			ball.setColor(rgen.nextColor());
			return getElementAt(ball.getX(), ball.getY());
		} else if(getElementAt(ball.getX(), ball.getY() + 2 * BALL_RADIUS) != null){
			ball.setColor(Color.black);
			return getElementAt(ball.getX(), ball.getY() + 2 * BALL_RADIUS);
		} else {
			return null;
		}
	}
	
	private void playGame(){
		GLabel play = new GLabel("Click to play");
		play.setFont("bold-20");
		add(play, (getWidth() - play.getWidth()) / 2, getHeight() - 150);
		
		turnsRemained = new GLabel("You have: " + (NTURNS - i) + " turns remained.");
		add(turnsRemained, (getWidth() - turnsRemained.getWidth()) / 2, getHeight() - 120);
		
		waitForClick();

		getBallVelocity();
		remove(play);
		remove(turnsRemained);
		ball();
		while(true){			
			bounceBall();
			if(ball.getY() >= getHeight()){
				break;
			} 
			if(brickCounter == 0){
				break;
			}
		}
		
	}
	
	private void winner(){
		GLabel winner = new GLabel("You won in: " +  i + " turns.Congratulations!");
		add(winner, (getWidth() - winner.getWidth()) / 2, HEIGHT - 100);
	}
	
	private void exhaustedTurns(){
		GLabel exhaustedTurns = new GLabel("You exhausted all 3 turns.");
		exhaustedTurns.setFont("bold-20");
		add(exhaustedTurns, (getWidth() - exhaustedTurns.getWidth()) / 2, HEIGHT - 150) ;
	}
	
	/* Private instance variables */
	private GRect paddle;
	private GRect brick;
	private GOval ball;
	private GObject collider;
	private int brickCounter;
	private GLabel turnsRemained;
	private int i;
	
	
}
