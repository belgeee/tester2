import acm.program.*;
public class oddnumbers73 extends ConsoleProgram{
	public void run(){
		int N=readInt("N=");
		int s=0;
		for(int i=1; i<=N; i++){
		int k=i*2-1;
		s=s+k;

		}
		println("niilber="+s);
	}

}