import acm.program.*;
public class Reserve76 extends ConsoleProgram {
public void run(){
	int s=0;
	int N=readInt("Enter n=");
	while(N>0){
		int k=N%10;
	    s=s*10+k;
		N=N/10;
	}
	println("S="+s);
}
}
