package lab11;
/*
 //+ing zalgadag
 */
import acm.program.*;
public class lab11_9 extends ConsoleProgram {
	public void run(){
		String word = "";
		while(true){
			word = readLine("Enter a word: ");//vgee oruulna
			if(word.equals("")){//hooson bol zogsono
				break;
			} else if(isWord(word)){
				println(createPresentParticiple(word));
			} else {
				println("Not a word.");
			}
		}
		println("Blank line. Program ended.");
	}
	private String createPresentParticiple(String word){
		String presentParticiple = word;
		String trimedEndE = "";
		char lastCh=word.charAt(word.length()-1);
		char secondLastCh = word.charAt(word.length() - 2);
		if(isEnglishConsonant(lastCh)){
			presentParticiple += "ing";
		}else if(isEnglishConsonant(secondLastCh)){
			trimedEndE = word.substring(0, word.length() - 1);//svvliiing ni egshig svvleesee 2dahi ni 
			//giigvvlegch bol negiig hasaad zalgana
			trimedEndE +="ing";
			presentParticiple=trimedEndE;
		}else{
			presentParticiple += "ing";//2egshig daraalj bwl shuud zalgana
		}
		return presentParticiple;
	}
	private boolean isWord(String word){
		for(int i = 0; i < word.length(); i++){
			char ch = word.charAt(i);
			if(!Character.isLetter(ch)) return false;
		}
		return true;
	}
	private boolean isEnglishConsonant(char ch){
		switch (Character.toLowerCase(ch)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				return false;
			default: 
				return true;
		}
	}
}
