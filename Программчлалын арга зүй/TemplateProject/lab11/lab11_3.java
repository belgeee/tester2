package lab11;
import acm.program.*;
public class lab11_3 extends ConsoleProgram {
	public void run(){
		String str = readLine("Enter a string: ");
		println(capitalize(str));
		
	}
	private String capitalize(String str){
		String firstCap = "";
		String restOfWord = "";
		String head = str.substring(0, 1);//ehnii vsgiig awna
		String body = str.substring(1);//vlsen vg
			firstCap = head.toUpperCase();//tom bolgono
			restOfWord = body.toLowerCase();//jijig bolgono
		return firstCap + restOfWord;
	}
	
}

