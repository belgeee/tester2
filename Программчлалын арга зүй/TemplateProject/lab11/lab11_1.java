package lab11;
/*
 * isEnglishConsonant(ch) аргыг хэрэгжүүлэх. Англи хэлний ch нь гийгүүлэгч байвал үнэнийг буцаана.
 */
import acm.program.*;

public class lab11_1 extends ConsoleProgram {
	public void run(){
		println("Ene program vnn eswel hudlaag butsaana .");
		String consonants = "";
		for(char i = 'A'; i <= 'Z';i++){
			if(isEnglishConsonant(i)){//ig ni yu ve gedgiig ni shalgaj bn
				consonants += i;//giigvvlegcheee tsugluulna
			}
		}
		println(consonants);//zowhon giigvvlegchiig hewlene
		
	}
	private boolean isEnglishConsonant(char ch){
		switch (ch) {
			case 'A': case 'E': case 'I': case 'O': case 'U':
				return false;//hudlaa utga butsaana
			default: 
				return true;//giigvvlegch bol vnnn butsaana
		}
	}
}
