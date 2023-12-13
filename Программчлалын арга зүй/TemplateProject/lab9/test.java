package lab9;

import acm.program.ConsoleProgram;

public class test extends ConsoleProgram {
		public void run(){
			String title = "Java";
			String author = "belge";
			int catalogNumber = 12345;
			String publisher = "hhaha";
			int year = 2007;
			boolean circulating = false;
			LibraryRecord record = new LibraryRecord(title, author, catalogNumber, publisher, year, circulating);
			println(record);
		}
		
}
