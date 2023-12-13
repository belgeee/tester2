package lab9;

import acm.program.*;
import acm.util.*;

public class lab9_5 extends ConsoleProgram{

private RandomGenerator rgen = RandomGenerator.getInstance();

private int money = 50;

private String value = "";
public void run(){


    String instAnswer = readLine("Would you like instructions?");

    while (!instAnswer.equals("yes") && !instAnswer.equals("no")) {
        instAnswer = readLine("Answer yes or no.");
    }
    if (instAnswer.equals("yes")) println("YOU SHOUD KNOW!");
    startGame(money);
}
private void startGame(int x){
    String keepPlaying = "";
    int finalMoney = x;
    int prize = 0;
    while (finalMoney > 0){
        keepPlaying = readLine("You have $" + finalMoney +". Would you like to play?");
        while(true){ 
            if (keepPlaying.equals("yes") || keepPlaying.equals("no")) break;
            keepPlaying = readLine("Asnwer yes or no.");

        }
        if (keepPlaying.equals("no")) break;

        finalMoney--;
        prize = gamePrize();
        finalMoney += prize;
        println(value + "     -- You win $" + prize);
    }

    println("Okay, bye. You ended with $" + finalMoney);
    if(finalMoney==0){
    	println("you dont have a money");
    }
}
private int gamePrize(){
    int countBAR = 0;   //BAR == 1
    int countBELL = 0;  //BELL == 2
    int countPLUM = 0;  //PLUM == 3
    int countORANGE = 0;//ORANGE == 4
    int countCHERRY = 0;//CHERRY == 5
    value = "";


    for (int i = 1; i <= 3 ; i++){
        int x = rgen.nextInt(1, 6);

        switch(x){
            case 1:
                countBAR++;
                value += "BAR ";
                break;
            case 2:
                countBELL++;
                value += "BELL ";
                break;
            case 3:
                countPLUM++;
                value += "PLUM ";
                break;
            case 4:
                countORANGE++;
                value += "ORANGE ";
                break;
            case 5:
                countCHERRY++;
                value += "CHERRY ";
                break;
            case 6: value += "LEMON "; 
            	break;
        }

    }

    return result(countBAR, countBELL, countPLUM, countORANGE, countCHERRY);

}
private int result(int bar, int bell, int plum, int orange, int cherry){
    int prize = 0;
    if (bar == 3){
        prize = 250;
    } else if ((bell > 1 && bar ==1) || bell == 3){
        prize = 20;
    } else if ((plum > 1 && bar == 1) || plum == 3){
        prize = 14;
    } else if ((orange >1 && bar == 1) || orange == 3){
        prize = 10;
    } else switch(cherry){
        case 1: prize = 7; break;
        case 2: prize = 5; break;
        case 3: prize = 2; break;
    }
    return prize;
}
}