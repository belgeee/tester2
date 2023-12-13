package lab11;

/*
 * Chapter 8, exercise 15, longest word in a sentence
 * plus second longest and shortest
 */


import acm.program.*;
import java.util.*;
public class lab11_14 extends ConsoleProgram {
	public void run(){
		String line = readLine("Enter a line: ");
		println("The longest word is: " + longestWord(line) + ".");
	}
	private String longestWord(String line){
		
		StringTokenizer tokenizer = new StringTokenizer(line);
		String vseg = tokenizer.nextToken();
		String longestWord = vseg;
		String secondLongestWord = vseg;
		String shortestWord = vseg;
		int vsegniiurt = vseg.length();
		int longestTokenLength = vsegniiurt;//bvgdend ni utgang ogoh
		int secondTokenLength = vsegniiurt;
		int smallestTokenLength = vsegniiurt;
		
		while(true){
			String nextVseg = tokenizer.nextToken();
			int nextTokenLength = nextVseg.length();
			if(nextTokenLength > longestTokenLength){//longest toog oloh
				secondLongestWord = longestWord;
				secondTokenLength = longestTokenLength;
				
				longestWord = nextVseg;
				longestTokenLength = nextTokenLength;
			}else if(longestTokenLength == secondTokenLength ){//herwee hamgiin urt 2 vg tentsvv baiwal
				secondLongestWord = nextVseg;
				secondTokenLength = nextTokenLength;
			}
			else if(nextTokenLength > secondTokenLength){//2dahi vg
				secondLongestWord = nextVseg;
				secondTokenLength = nextTokenLength;
			}
			if(nextTokenLength < smallestTokenLength){//hamgiin baga ni
				shortestWord = nextVseg;
				smallestTokenLength = nextTokenLength;
			}
			if(!(tokenizer.hasMoreTokens())) break;//stop
		}
		
		
		
		return "LONGEST: " + longestWord + " /SECOND LONGEST: " + secondLongestWord + " /SHORTEST: " + shortestWord;
	}
}

