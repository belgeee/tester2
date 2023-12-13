/* File: GCTest.java
 * -----------------
 * Program shows garbage collection 
 * and object memory allocation
 */

package lab10;

import acm.program.*;
import lab9.Rational;

public class lab10_4 extends ConsoleProgram {
		
	public void run() {
		Runtime myRuntime = Runtime.getRuntime();
		long x = myRuntime.freeMemory();
		println("taraahiin omnoh sul zai: " + x);
		println("100000 rational taraaj bn: ");
		for (int i = 0; i < 100000; i++) {
			 new Rational();
		}
		x = myRuntime.freeMemory();
		println("taraasnii daraah sul zai: " + x);
		
		myRuntime.gc();
		x = myRuntime.freeMemory();
		println("garbage collectionii daraah memorynii sul zai: " + x);
	}

}