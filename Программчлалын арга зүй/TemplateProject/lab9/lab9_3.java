package lab9;
	import acm.program.*;
	import acm.util.*;
	public class lab9_3 extends ConsoleProgram {
		private static int N=100;
	public void run() {
		int a=0,b=0;
		int r=readInt("enter radius:");
		double s=4*r*r;//dorwoljnii talbai
		double k=3.14*r*r;//booronhiin talbai
		for(int i=0;i<N;i++){
        double y=rgen.nextDouble(1, s);
        if(y>k){//dowrwoljind duudah mgadlal
        	a++;
        }
        else{//booronhiid buudalt
        	b++;
        }
		}
		println((s-k)+":"+k);
		println(a+":"+b);
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
	}
