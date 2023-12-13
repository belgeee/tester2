
import acm.program.*;

import java.awt.Color;

import acm.graphics.*;
 
public class CheckerBoard712 extends GraphicsProgram {
   public void run() {
      double sqSize = (double) getHeight() / NROWS;
      for (int i = 0; i < NROWS; i++) {
         for (int j = 0; j < NCOLUMNS; j++) {
            double x = j * sqSize;
            double y = i * sqSize;
            GRect sq = new GRect(x, y, sqSize, sqSize);
            sq.setFilled((i + j) % 2 != 0);
            add(sq);
         }
      }
for(int i=0; i<NROWS/2-1;i++){
for(int j=0; j<NCOLUMNS; j++){
	double x=j*sqSize;
	double y=i*sqSize;
	GOval ov=new GOval(x,y, sqSize, sqSize);
	if((i+j)%2!=0)
	add(ov);
	ov.setColor(Color.blue);
	ov.setFilled(true);
		

	
}
}
for(int i=NROWS/2+1; i<NROWS;i++){
for(int j=0; j<NCOLUMNS; j++){
	double x=j*sqSize;
	double y=i*sqSize;
	GOval ov=new GOval(x,y, sqSize, sqSize);
	if((i+j)%2!=0)
	
	add(ov);
	ov.setColor(Color.red);
	ov.setFilled(true);
}
}

   }

   private static final int NROWS = 10;     /* Number of rows    */
   private static final int NCOLUMNS = 10;  /* Number of columns */
 
}