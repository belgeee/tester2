package lab13;

import java.awt.Font;

import acm.gui.DoubleField;
import acm.gui.IntField;

public class CalculatorDisplay extends DoubleField {
	/* Creates a new calculator display */
	public CalculatorDisplay(){
		setEditable(false);
		setFont(new Font("SansSerif", Font.PLAIN, 24));
		setValue(0);
		setText("");
		startNewValue = false;
		op = null;
	}
	public void addDigit(String digit){
		value = (startNewValue) ? "" : getText();
		setText(value + digit);
		startNewValue = false;
	}
	
	public void addPoint(String str){
		value = (startNewValue) ? "" : getText();
		if(!value.contains(str)){
			value += str; 
		} 
		setText(value);
		startNewValue = false;
	}
	public void setOperator(OperatorButton button){
		if(op == null){
			memory = Double.parseDouble(getText());
		} else {
			double fl = Double.parseDouble(getText());
			memory = op.apply(memory, fl);
			
			setValue(memory);
		}
		op = button;
		startNewValue = true;
	}
	
	/* Private instance variables */
	private OperatorButton op;     /* The last operator button pressed */
	private double memory;            /* The value to which the operator is applied */
	private boolean startNewValue; /* Set after an operator to start a new value */
	private String value;
	
	
}
