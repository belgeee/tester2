package lab11;

import acm.program.ConsoleProgram;

public class lab11_11 extends ConsoleProgram{
	public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
	public void run() {
		String sentence = readLine("uguulberee oruulna uu: ");
		sentence = sentence.toLowerCase();//jijig vseg bolgosn
		String newSentence = "";
		int shifr = readInt("shifree oruulna uu");//oorcloh vg
		for(int i = 0 ; i < sentence.length() ; i++) {
			if(sentence.charAt(i) != ' ' ) {
				int index = alpha.indexOf(sentence.charAt(i));
				index = (index + shifr) % 26;
				char ch = alpha.charAt(index);
				newSentence += ch;
			}
			else{
				newSentence +=" ";
			}
		}
		println(newSentence);
	}
	public static void main(String[] args) {
		new lab11_11().start();
	}
}