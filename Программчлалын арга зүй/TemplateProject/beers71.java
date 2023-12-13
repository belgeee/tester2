import acm.program.ConsoleProgram;
public class beers71 extends ConsoleProgram {
public void run() {
int beerNum = 99;
String word = "bottles";
while (beerNum > 0) {
   if (beerNum == 1) {
       word = "bottle";
   }
   println(beerNum + " " + word + " of beer on the wall");
   println(beerNum + " " + word + " of beer");
   println("Take one down.");
   println("Pass it around.");
   beerNum = beerNum -1;
   if (beerNum > 0) {
      println(beerNum + " " + word + " of beer on the wall");
   }
   else {
      println("No more bottles of beer on the wall");
   }
}
    }
}
