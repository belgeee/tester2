package lab9;
	import acm.program.*;
	import acm.util.*;
	// function asuult asuuj ehlene.
	// sanamsargui temdeg zurna nemeh eswel hasah mgdlltai
	// Хоёрдахь санамсаргүй тоонд ашиглагдах хоёр дахь хувьсагчийг эхлүүлнэ
	// Арифметик бодлогын сайн хариултыг хадгалах хувьсагчийг эхлүүлнэ
	// Хэрэв зурсан тэмдэг нь + байвал 0-ээс 20-x (getRandomYPlus арга) хооронд, эсвэл зурсан тэмдэг нь - бол 0-ээс x хооронд (getRandomYMinus арга) хоёр дахь санамсаргүй тоог зурна.
	// Хариулт нь 20-оос их эсвэл тэгээс бага байхаар тоонууд нь ийм байх ёстой тул би хоёр аргыг үүсгэсэн.
	// Санамсаргүй хоёр тоо болон санамсаргүй тэмдэг бүхий арифметик бодлого гаргана
	// Хариултын тоог тоолох хувьсагчийг эхлүүлнэ
	// Оюутнууд зөв хариулт өгөх гурван боломжийг олгодог
	// Гурван буруу хариултын дараа програм зөв хариулт өгч, өөр бодлого руу шилждэг
	// 0-ээс 20-ийн хооронд санамсаргүй тоо сонгох арга
	
	public class lab9_7 extends ConsoleProgram {

	    private static final int NUMBER_OF_QUESTIONS = 5;
	    public void run() {

	        println("Welcome to MathQuiz");
       for (int i=0; i < NUMBER_OF_QUESTIONS; i++) {
	            int x = getRandomX();
	            String sign = getPlusOrMinus(); 
	            int y = 0;
	            int goodanswer = 0;
	            if (sign == "+") {
	            	y = getRandomYPlus(x);
	                goodanswer = x + y;
	            } else {
	                y = getRandomYMinus(x);
	                goodanswer = x-y;

	            }
	            int answer = readInt("What is " + x + sign + y + "? ");
	            int count = 0;
	            while (answer != goodanswer && count !=3) {

	                answer = readInt("That`s incorrect - try a different answer: ");

	                count ++;
	            }

	            if (answer == goodanswer) {

	                println(hariuhha());
	            } else {

	                println ("No, the answer is " + goodanswer + ".");
	            }
	        }

	    }
	    private int getRandomX() {

	        int x = 0;

	        x = rgen.nextInt(0,20);

	        return x;
	    }
	    private String getPlusOrMinus() {

	        String sign = null;

	        sign = rgen.nextBoolean() ? "+" : "-";

	        return sign;
	    }
	    private int getRandomYPlus(int x) {

	        int y = 0;

	        y = rgen.nextInt(0,20); 

	        return y;
	    }

	    private int getRandomYMinus(int x) {

	        int y = 0;

	        y = rgen.nextInt(0,20);

	        return y;
	    }
	    private  String hariuhha (){
		    String value = "";
		    for (int i = 1; i <= 1 ; i++){
		        int x = rgen.nextInt(1, 4);

		        switch(x){
		            case 1:
		                value += "You got it ";
		                break;
		            case 2:
		                value += "Correct ";
		                break;
		            case 3:
		                value += "That is the answer ";
		                break;
		            case 4:
		            	value +="Yoo gal gal bro";
		            	break;
		        }

		    }
		    return value;
		}
	    private RandomGenerator rgen = new RandomGenerator();
	   
	
	}
