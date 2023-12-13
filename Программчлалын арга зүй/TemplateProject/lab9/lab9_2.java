package lab9;

import acm.program.*;
import acm.util.*;

public class lab9_2 extends ConsoleProgram{
public void run(){

 int flipCounter=0; 
 int headsFlip = 0; 

 while (headsFlip < 3){

 String flip = coinFlip();
 println(flip);

  if (flip.equals("heads")){
    headsFlip++;
  }
  else {
	  headsFlip=0;
  }
 flipCounter++;
 flip = coinFlip();
 } 
 if(headsFlip==3){
 println("It took " + flipCounter + "flips to reach 3 consecutive heads.");
 } 
}
private String coinFlip (){
String flip = rgen.nextBoolean() ? "heads" : "tails";
return flip; 

}

private RandomGenerator rgen = RandomGenerator.getInstance();

}