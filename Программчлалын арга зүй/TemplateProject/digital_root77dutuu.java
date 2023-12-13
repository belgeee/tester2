import acm.program.*;

public class digital_root77dutuu extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n:");
		int s = 0;
		int a;
		int i = 1;
		while (n > 0) {
			s = 0;
			while (n > 0) {
				a = n % 10;
				s = s + a;
				n = n / 10;
			}
			println("step" + i + ":" + s);
			if (s > 9) {
				n = s;
			}
			i++;
		}
	}
}