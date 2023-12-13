package lab11;
	/*
	 * Санамсаргүй байдлаар бүтээгдсэн "үг"-ийг буцаадаг randomWord аргыг бич.
	 * санамсаргүй байдлаар сонгосон үсгүүдээс бүрддэг. Үг дэх үсгийн тоо
	 * -ийн утгуудын хоорондох тоог сонгох замаар мөн санамсаргүй байдлаар сонгох ёстой
	 * нэрлэсэн тогтмолууд MIN_LETTERS ба MAX_LETTERS. Туршилт хийдэг ConsolePorgram бичнэ үү
	 * санамсаргүй таван үгийг харуулах замаар таны арга.
	 */
	import acm.program.*;
	import acm.util.RandomGenerator;
	public class lab11_2 extends ConsoleProgram {
		public void run(){
			for(int i = 0; i < 5; i++){//5vg bvteene
				randomWord();//random
			}
		}
		private void randomWord(){
			int wordLength = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);//iim 2 vsegnii hoorond songono
			String word = "";//saw
			for(int i = 0; i <= wordLength; i++){//duustal ni
				char ch = randomLetter();//heden vseg bh ni
				word += ch;//vsgee tsugluulna
			}
			println(word);
		}
		private char randomLetter(){
			char a=(char) rgen.nextInt('a', 'z');//random vseg sugalna
			return a; 
		}
		public final static int MIN_LETTERS = 3;
		public final static int MAX_LETTERS = 9;
		
		private RandomGenerator rgen = RandomGenerator.getInstance();
	}
