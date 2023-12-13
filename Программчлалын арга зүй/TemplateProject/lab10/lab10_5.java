package lab10;
//2toog solih ba tusdaa solo geh class neej ajilluulna
//2toog solo class ruu damjlj as
import acm.program.ConsoleProgram;

public class lab10_5 extends ConsoleProgram{
	public void run() {
		println("Swap argiig ashiglan 2toog solidog program");
		int a = readInt("A toog oruulna uu: ");
		Solo first = new Solo(a);

		int b = readInt("B toog oruulna uu: ");
		Solo second = new Solo(b);
		
		println("Hoyr toog solihoos umnu: ");
		println(first + " & " + second);
		
		swap(first, second);
		
		println("Solisnii daraa: ");
		println(first + " & " + second);
	}
	// 2 toog solih arga
	//

	private void swap(Solo a, Solo b) {
		
		Solo temp = new Solo(a.getFirst());	
		a.setFirst((b).getFirst());
		b.setFirst(temp.getFirst());

	}


	public static void main(String[] args) {
		new lab10_5().start();
	}
}