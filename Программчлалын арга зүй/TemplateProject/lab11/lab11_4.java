package lab11;
import acm.program.*;
public class lab11_4 extends ConsoleProgram{
	public void run(){
		int day = readInt("Enter the day: ");//toog shuud hewlne
		int month = readInt("Enter the month: ");
		
		int year = readInt("Enter the year: ");//println
		println(day + "-" + getMonth(month) + "-" + getYear(year));
	}
	private String getMonth(int month) {//saruudiig hargalzuulna
		switch(month){
		case 1: return "Jan";
		case 2: return "Feb";
		case 3: return "Mar";
		case 4: return "Apr";
		case 5: return "May";
		case 6: return "Jun";
		case 7: return "Jul";
		case 8: return "Aug";
		case 9: return "Sep";
		case 10: return "Oct";
		case 11: return "Nov";
		case 12: return "Dec";
		default: return "wrong value";
		}
	}
	
	private String getYear(int year){
		String fullYear = Integer.toString(year);//int to string convert
		String twoDigitsYear = fullYear.substring(2);//3dahi gishvvnees hoishih toog awna
		return twoDigitsYear;
	}
}

