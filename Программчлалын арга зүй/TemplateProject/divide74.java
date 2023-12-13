import acm.program.*;
public class divide74 extends ConsoleProgram {
    public void run()  {
    	int n=1;
    	while (n<=100){
        if(n%6 == 0 || n%7==0){
       println("n:"+n);
        }
        n=n+1;
    	}
    }
}
