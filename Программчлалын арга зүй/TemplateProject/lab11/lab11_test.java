package lab11;
import java.util.StringTokenizer;

import acm.program.*;
public class lab11_test extends ConsoleProgram{
	public void run(){
		String reverse="";
	StringTokenizer st = new StringTokenizer("this is a test");
       while(st.hasMoreTokens()){
			reverse += st.nextToken();
		}
    println(reverse);
}
}