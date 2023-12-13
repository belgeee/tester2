package lab13;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class tester extends GraphicsProgram {
	private boolean isBouncing;
	private int BALL_RADIUS=50;
	public void run(){
		
		ball=new GOval(BALL_RADIUS,BALL_RADIUS);
		add(ball, getWidth()/2, getHeight()/2);
		ball.setFilled(true);
		ball.setColor(Color.RED);
		int dx=1;
		int dy=1;
		while(true){
			if(isBouncing == true){//if true bol move, if false bol stop
				ball.move(dx, dy);
			}
			
			pause(100 / getCurrentSpeed());
			if (ball.getY() == getHeight() - 2 * BALL_RADIUS || ball.getY() == 0) {
				dy = -dy;

			}
			
			if (ball.getX() == getWidth() - 2 * BALL_RADIUS || ball.getX() == 0) {
				dx = -dx;

			}
		}
		}
	public void init(){
		setBackground(Color.GRAY);
		JButton startBtn = new JButton("Start");
		JButton stopBtn = new JButton("Stop");
		JLabel slow = new JLabel("Slow");
		JLabel fast = new JLabel("Fast");
		speedSlider = new JSlider(0, 100, 10);
		TextField=new JTextField(15);
		TextField.addKeyListener(this);
		add(TextField, SOUTH);
		
		
		add(startBtn, SOUTH);
		add(stopBtn, SOUTH);
		add(slow, SOUTH);
		add(speedSlider, SOUTH);
		add(fast,SOUTH);
	
		addActionListeners();
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Start")){
			isBouncing=true;
		}else if(e.getActionCommand().equals("Stop")){
			isBouncing=false;
		}
	}
	private int getCurrentSpeed(){
		return speedSlider.getValue();
	}
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			String str = TextField.getText();
			label = new GLabel(str);
			label.setColor(Color.black);
			add(label,200,200);
		}
	}
	private JSlider speedSlider;
	private GOval ball;
	private JTextField TextField;
	private GLabel label;
}
