package lab11;
/*
 */
import acm.program.*;
public class lab11_12 extends ConsoleProgram {
	public void run(){
		while(true){
			String digits = readLine("Enter a number: ");
			if(digits.length() == 0) break;
			println(addCommas(digits));
		}
	}
	private String addCommas(String digits){
		String reversedNumber = "";
		String number = "";
		for(int i = 0; i < digits.length(); i++){//i aar gvilgene
			char ch = digits.charAt((digits.length()-1) - i);//ihees ni baga ruu
			if(i % 3 == 0 && i != 0){
				reversedNumber += ',';//taslal nemeh
			}
			reversedNumber += ch;//vgee hoino hoino ni zalgaad ghdee urwuu
		}
		for(int i = 0; i < reversedNumber.length(); i++){
			char ch = reversedNumber.charAt((reversedNumber.length()-1) - i);
			number += ch;
		}
		return number;
	}
}