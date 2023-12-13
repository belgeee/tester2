import acm.program.*;

public class oldman72 extends ConsoleProgram {

    public void run() {
        String word = "";
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1: word = "thumb"; break;
                case 2: word = "shoe"; break;
                case 3: word = "knee"; break;
                case 4: word = "door"; break;
                case 5: word = "hive"; break;
                case 6: word = "sticks"; break;
                case 7: word = "up to heaven"; break;
                case 8: word = "pate"; break;
                case 9: word = "spine"; break;
                case 10: word = "shin"; break;
            }
            println("This old man, he played " + i);
            println("He played knick-knack on my " + word + ".");
            println("With a knick-knack, paddy-whack, Give your dog a bone.");
            println("This old man came rolling home.");
        }
    }

}