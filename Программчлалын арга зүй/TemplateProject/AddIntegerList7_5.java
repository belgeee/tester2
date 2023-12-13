import acm.program.*;
public class AddIntegerList7_5 extends ConsoleProgram{
public void run(){
	double a;
	int n=readInt("heden suragch shalgalt ogson:");
	int i=0;
	double s=0;
   while(i<n){
	   a=readInt("value");
	   if(a>0){
		   
	   i++;
	   s=s+a;
	     }else if(a==0){
	    	 n--;
	     }
	     else{
	    	 println("buruu utga");
	     }
   }
   println("dundaj:"+s/n);
}
}
