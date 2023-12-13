package lab13;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawStarMap5 extends GraphicsProgram {
	public void init(){
		setBackground(Color.GRAY);
		clearBtn = new JButton("Clear");
		clearBtn.setActionCommand("Clear");
		clearBtn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				removeAll();
			}
		});
		add(clearBtn, SOUTH);
		sizeSlider = new JSlider(MIN_SIZE, MAX_SIZE, INITIAL_SIZE);
		add(new JLabel(" Small"), SOUTH);
		add(sizeSlider, SOUTH);
		add(new JLabel("Large "), SOUTH);
		initColorChooser();
		add(colorChooser, SOUTH);
		
		add(new JLabel(" Star name "), SOUTH);
		textField = new JTextField(15);
		textField.addKeyListener(this);

		add(textField, SOUTH);
		
		addMouseListeners();
		addKeyListeners();
		addActionListeners();
	
	}
	private void initColorChooser(){
		colorChooser = new JComboBox();
		colorChooser.addItem(new LabeledColor(Color.WHITE, "WHITE"));
		colorChooser.addItem(new LabeledColor(Color.RED, "RED"));
		colorChooser.addItem(new LabeledColor(Color.YELLOW, "YELLOW"));
		colorChooser.addItem(new LabeledColor(Color.ORANGE, "ORANGE"));
		colorChooser.addItem(new LabeledColor(Color.GREEN, "GREEN"));
		colorChooser.addItem(new LabeledColor(Color.BLUE, "BLUE"));
		colorChooser.addItem(new LabeledColor(Color.BLACK, "BLACK"));
		colorChooser.addItem(new LabeledColor(Color.MAGENTA, "MAGENTA"));
		colorChooser.addItem(new LabeledColor(Color.CYAN, "CYAN"));
		colorChooser.setSelectedItem(new LabeledColor(Color.WHITE, "WHITE"));
	}
	
	private double getCurrentSize(){
		return sizeSlider.getValue();
	}
	public void mouseClicked(MouseEvent e){
		if(gobj != null) {
			gobj.sendToFront();
		} else if(gobj == null){
			star = new GStar(getCurrentSize());
			star.setFilled(true);
			star.setColor((Color)colorChooser.getSelectedItem()); 
			add(star, e.getX(), e.getY());
		}
	 
	}
	public void mousePressed(MouseEvent e){
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
	}
	
	public void mouseDragged(MouseEvent e){
		if(gobj != null){
  			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
  			last = new GPoint(e.getPoint());
  			label.setLocation(last);
  		}
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			String str = textField.getText();
			label = new GLabel(str);
			label.setColor((Color)colorChooser.getSelectedItem());
			addGLabel(label);
		}
	}
	
	
	

	public void addGLabel(GLabel label){
		add(label, star.getX() + star.getWidth(), star.getY());
	}

	private static final int MIN_SIZE = 1;
	private static final int MAX_SIZE = 50;
	private static final int INITIAL_SIZE = 16;
	
	private JSlider sizeSlider;
	private JComboBox colorChooser;
	private JTextField textField;
	private GLabel label;
	private JButton clearBtn;
	
	private GObject gobj;
	private GPoint last;
	private GStar star;
}
