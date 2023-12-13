package lab10;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class lab10_3 extends ConsoleProgram{

	RandomGenerator ran = RandomGenerator.getInstance();
	public void run() {
		println("Welcome to Math Quiz");
		int s = 0 , s1 , s2  ;
		String answer,m1,m2;
		while(s<5) {
			s1 = ran.nextInt(0 , 20);
			s2 = ran.nextInt(0 , 20);
			boolean isPlus = ran.nextBoolean();
			
			if(isPlus) {
				m1=Integer.toOctalString(s1);
				m2=Integer.toOctalString(s2);
				println("what is " + m1 + " + "  + m2 + " in 8");
				answer = Integer.toOctalString(s1 + s2);
			}
			else 
			{	int temp;				
				if(s2>s1){
					temp=s1;
					s1=s2;
					s2=temp;
				}
				m1=Integer.toOctalString(s1);
				m2=Integer.toOctalString(s2);
				println("what is " + m1 + " - "  + m2 + " in 8");
				answer = Integer.toOctalString(s1 - s2);
			}
			int result = readInt("insert your value: ");
			String hha = Integer.toOctalString(result);
			int count = 0;
			while(count < 2) {
				if(answer.equals(hha)) {
					println("Yes , That is the answer");
					break;
				}
				else {
					count++;
					result = readInt("That is incorrect, try different answer: ");
				}
			}
			if(count == 2) 
				println("The answer is " + answer);
			s++;
		}
		
		}

	public static void main(String[] args) {
		new lab10_3().start();
	}
}