package lab11;

import acm.program.*;
public class lab11_6 extends ConsoleProgram {
	public void run(){
		String str = readLine("Enter a word to check if it is palindrome: ");
		println(isPalindrome(str));
	}
	private boolean isPalindrome(String str){
		String reverse = "";
		for(int i = str.length()-1;i >= 0;i-- ){//hoinoos uragsh ni gvilgene
			char ch = str.charAt(i);//
			reverse += ch;//horwuulne
			if(str.equals(reverse)){//horwuulsen ni tentsej bgaag shalgana
				return true;//utga butsaana
			} 
		}
		return false;
	}
}
