package lab11;

/*
 * Chapter 8, exercise 16, Acronym
 */
import acm.program.*;
import java.util.*;
public class lab11_15 extends ConsoleProgram {
	public void run(){
		String line=readLine ("Since the problem is to translate.");
		println("The acronum for the " + "\"" + line+ "\"" + " is: " + acronym(line));
	}
	private String acronym(String str){
		String acronym = "";
		StringTokenizer letter = new StringTokenizer(str);
		while(letter.hasMoreTokens()){//vgnvvd duustal
			String token = letter.nextToken();
			char ch = token.charAt(0);//ehnii vzgiig ni awna
			acronym += ch;//zalgaad ywcina
		}
			
		return acronym;
	}
}
