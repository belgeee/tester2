package lab9;
//10000atomaas ehelne

//Атом бүрийн задралын процессыг хийнэ. Атом бүр 50% задрах магадлалтай.
// Санамсаргүй тоо үүсгэгчийн жишээ хувьсагч үүсгэх */
	import acm.program.*;
	import acm.util.RandomGenerator;

	public class lab9_4 extends ConsoleProgram {
	    private static final int NATOMS = 10000;

	    public void run() {
	        println("There are " + NATOMS + " atoms initially.");
	        int remainingAtoms = NATOMS;
	        int year = 0;
	        while (remainingAtoms > 0) {
	            
	            for (int i = remainingAtoms; i > 0; i--) {
	                if (rgen.nextBoolean()) {
	                    remainingAtoms--;
	                }
	            }
	            year++;
	            println("There are " + remainingAtoms + " atoms at the end of year " + year);
	        }
	    }
	    private RandomGenerator rgen = RandomGenerator.getInstance();
	}
