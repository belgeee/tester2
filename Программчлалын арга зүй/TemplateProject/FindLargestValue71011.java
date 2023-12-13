import acm.program.*;

public class FindLargestValue71011 extends ConsoleProgram {
    public void run() {
        println("When you enter value 0 here:");
        int n = readInt("enter:");
        int largest = n;
        int secLargest = n;
        while (true) {
            n = readInt("enter:");
            if (n == Stop) break;
            secLargest = n;
            while (true) {
                n = readInt("enter:");
                if (n == Stop) break;
                if (n > largest) {
                    secLargest = largest;
                    largest = n;
                } else if (n < largest && n > secLargest) {
                    secLargest = n;
                }
            }
            break;
        }
        println("The largest value is " + largest);
        println("The second largest value is " + secLargest);
    }

    /* Private constant */
    private static final int Stop = 0;
}