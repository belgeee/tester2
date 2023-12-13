package lab11;

/*
 * numbers to words huwirgah
 */
import acm.program.*;
public class lab11_13 extends ConsoleProgram {
	public void run(){
		
		while(true){
			int n = readInt("Enter a number: ");
				println(numberToWords(n));
		}
	}
	
	private static String numberToWords(int n){
		String num = "";
			if(n == 0) return "zero";
			
			if((n / BILLION) > 0){
				num += numberToWords(n / BILLION) + " billions ";
				n %= BILLION;
			}
			if((n / MILLION) > 0){
				num += numberToWords(n / MILLION) + " millions ";
				n %= MILLION;
			}
			
			if ((n / THOUSAND) > 0) {
				num += numberToWords(n / THOUSAND) + " thousand ";
				n %= THOUSAND;
			}
			
			if((n / HUNDRED) > 0){
				num += numberToWords(n / HUNDRED) + " hundred ";
				n %= HUNDRED;
			}
			if(n > 0){
				// n ni 0ees ih esehiig ni shalgana, 0tei tentsvv bol duusna
				if(n < 20){
					// numNames-аас тохирох утгыг татах
					num += numNames.values()[n];
				} else if(n>=20){
					// tensNames-аас тохирох утгыг авна
					num += tensNames.values()[(n / 10)];
					num += " s"+num2.values()[(n % 10)];
					
				}
			}
		return num;
	}
	private enum tensNames  {
		zero,// Учир нь энэ нь 0-ээс ... хүртэлх индексүүдийг тоолдог.
	    ten,
	    twenty,
	    thirty,
	    forty,
	    fifty,
	    sixty,
	    seventy,
	    eighty,
	    ninety,
	  };
	  
	  private enum numNames {
		  zero,// Учир нь энэ нь 0-ээс ... хүртэлх индексүүдийг тоолдог.
		  one,
		  two,
		  three,
		  four,
		  five,
		  six,
		  seven,
		  eight,
		  nine,
		  ten,
		  eleven,
		  twelve,
		  thirteen,
		  fourteen,
		  fifteen,
		  sixteen,
		  seventeen,
		  eighteen,
		  nineteen
	  }
	  private enum num2{
		  zero,// Учир нь энэ нь 0-ээс ... хүртэлх индексүүдийг тоолдог.
		  one,
		  two,
		  three,
		  four,
		  five,
		  six,
		  seven,
		  eight,
		  nine,
		  ten, 
	  }
	  private static final int BILLION = 1000000000;
	  private static final int MILLION = 1000000;
	  private static final int THOUSAND = 1000;
	  private static final int HUNDRED = 100;
}
