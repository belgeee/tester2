package lab12;
import acm.program.*;

public class PatchworkQuilt extends GraphicsProgram {
	
	public void run() {
		int x = 0; int y = 0;
		for (int j = 0; j < 3; j++) {
			x=0;
			for(int i=0; i<3; i++){
				add(getLCB(), x, y+spacer*j);
				add(getNSB(), x + spacer, y+spacer*j);
				add(getILJB(), x + i * spacer, y+spacer*j);
				x += 2 * spacer;
		}
		}
	
	}
	
	private LogCabinBlock getLCB() {
		LogCabinBlock block = new LogCabinBlock();
		return block;
	}
	
	private NestedSquareBlock getNSB() {
		NestedSquareBlock block = new NestedSquareBlock();
		return block;
	}
	
	private ILoveJavaBlock_11 getILJB() {
		ILoveJavaBlock_11 block = new ILoveJavaBlock_11();
		return block;
	}
	
	private int spacer =  QuiltBlock.getBlockSize();
}
