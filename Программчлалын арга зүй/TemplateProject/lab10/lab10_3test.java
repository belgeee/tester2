package lab10;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class lab10_3test extends ConsoleProgram{

	RandomGenerator ran = RandomGenerator.getInstance();
	public void run() {
		println("Welcome to Math Quiz");
		int s = 0 , s1 , s2  ;
		String answer;
		while(s<5) {
			s1 = ran.nextInt(0 , 20);
			s2 = ran.nextInt(0 , 20);
			boolean isPlus = ran.nextBoolean();
			if(isPlus) {
				println("what is " + s1 + " + "  + s2 + " in 8");
				answer = Integer.toOctalString(s1 + s2);
			}
			else 
			{
				println("what is " + s1 + " - "  + s2 + " in 8");
				answer = Integer.toOctalString(s1 - s2);
			}
			String result = readLine("insert your value: ");
			int count = 0;
			while(count < 2) {
				if(answer.equals(result)) {
					println("Yes , That is the answer");
					break;
				}
				else {
					count++;
					result = readLine("That is incorrect, try different answer: ");
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