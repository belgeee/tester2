package lab11;
import java.util.StringTokenizer;

import acm.program.*;
public class lab11_7 extends ConsoleProgram {
	public void run(){
		String bla2="";
		String str = "";
		while(true){
			str = readLine("Enter your semtence: ");
			if(str.equals(bla2)){
				break;
			} else if(isSentencePalindrome(str)){//palindrom mon bol true
				println("true");
			} else {
				println("false");//hudllaa bol false
			}
			
		}
		println("The end of testing.");
	}
	private boolean isSentencePalindrome(String str){
		String st = str.toLowerCase();//bvgdiiig ni jijig vseg bolgono
		StringTokenizer tok = new StringTokenizer(st);//next token d beltgej bn
		String zalgalt = "";
		String token = "";
		while(tok.hasMoreTokens()){//duustal ni
			zalgalt += tok.nextToken();//vgnvvdee hooorond ni zalgana
		}
		
		for(int i = zalgalt.length()-1; i >= 0; i--){//reverse hiiine
			char ch = zalgalt.charAt(i);
			token += ch;
		}
		
		if(zalgalt.equals(token)){//tentsvvyu
			return true;
		}
		
		println(zalgalt + " reverse: " + token);//hewle2
		return false;
	}
}
