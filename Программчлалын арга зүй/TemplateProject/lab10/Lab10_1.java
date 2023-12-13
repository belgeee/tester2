package lab10;
/*
 * ene program 16t iig 10t ruu hewlene 
 * Таны программыг хэрэглэгч 0 хүртэл арван hex утгыг үргэлжлүүлэн унших ёстой
 * 
 */
import acm.program.*;

public class Lab10_1 extends ConsoleProgram {
	public void run(){
		println("This program converts hexadecimal to decimal until 0 is entered.");
		while(true){
			String hex = readLine("Enter a hexadecimal number: ");
			hex=hex.toUpperCase();//tom vseg bolgono
			int dec = Integer.parseInt(hex, 16);//16t aas 10t ruu shiljuuleh
			if(dec == 0)break;//0 bol zogsono
			println(hex + " hex = " + dec + " decimal.");
		}
		println("You entered 0 and the programm stopped.");//0g oruulbal zogsono
		
	}
}