package lab10;
	/*
	 * Ene program daraaalsn int deer ajilna

	 * daraa ni dundajiig hewlne
	 * 
	 */
	import acm.program.*;
	public class lab10_2 extends ConsoleProgram {
		private static String K="";
		public void run(){
			
			int total = 0;
			double avrg = 0;
			double result = 0;
			
			while(true){
				String score = readLine("Enter score: ");
				if(score.equals(K)){//hoooson mor oruulhad  zogsono
					println("You entered nothing and the program stopped.");
					break;
				} else {
					int scoreToInt = Integer.parseInt(score);
					avrg=avrg+1;//hden hvn sonoog intgene
					total += scoreToInt;//niit
					result = total / avrg; //dundaj
				}
			}
			println("total is: " + total);
			println("The average is: " + result);
		}
		
}
