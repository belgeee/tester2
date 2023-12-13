package lab11;

import acm.program.*;
//10 dotr tohioldold neg awsn 10 aas ih tohioldold neig awsn
//11, 12, 13 deer th hewlene//
public class lab11_10 extends ConsoleProgram {
	public void run(){
		int n;
		while(true){
			n = readInt("Enter a cardinal number: ");
			if(n == 0){
				break;
			} else {
				println("ordinal form " + n + " is: " + createOrdinalForm(n));
			}
		}
		println("Ended.");
	}
	private String createOrdinalForm(int n){
		String cardinalForm = Integer.toString(n);
		String ordinalForm = "";

//		
	
		if(cardinalForm.length() > 0){
			if(cardinalForm.equals("11")){
				ordinalForm = cardinalForm + "th";
			}else if(cardinalForm.equals("12")){
				ordinalForm = cardinalForm + "th";
			}else if(cardinalForm.equals("13")){
				ordinalForm = cardinalForm + "th";
			}
			else if(cardinalForm.endsWith("1")){
				ordinalForm = cardinalForm + "st";
		    }
			else if(cardinalForm.endsWith("2")){
				ordinalForm = cardinalForm + "nd";
			}
			else if(cardinalForm.endsWith("3")){
				ordinalForm = cardinalForm + "rd";
			} else {
				ordinalForm = cardinalForm + "th";
			}
		}
		return ordinalForm;
	}
}
