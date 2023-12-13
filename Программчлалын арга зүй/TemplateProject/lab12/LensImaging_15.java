package lab12;

/*
 * This program calculate the distance and size of an image
 * placed in front of a convex lens with given focal length and at a given distance
 */
import acm.program.*;
import acm.graphics.*;
public class LensImaging_15 extends GraphicsProgram {
	public void run(){
		double a=150;//dvrsees lens hvreh zai 
		double b=150;//biyees lens hvreh zai 
		double f=(a*b)/(a+b);//focusiin zai
		double k=a-f;
		double c=b-f;
		double wLens = 50;
		double hLens = 150;
		GImage image = new GImage("candle.jpg");
		GLens lens = new GLens(wLens, hLens);
		
		
		GImage secondImage = new GImage("318629859_1312258952960377_6842696040583615493_n.jpg");//ergesen laa
		secondImage.scale(0.8);//2 zurgiin zurgiin haritsaa
		
		add(lens, (getWidth() - wLens) / 2+a, (getHeight() - hLens) / 2);//towdoo lensee nemne
		add(image, (getWidth() / 2) + a+b, (getHeight() - image.getHeight()) / 2);//add image at given x, y in front of lens
		
		//Дээрх томъёогоор тооцоолсон x, y, өндрөөр линзний ард хоёр дахь зургийг нэмнэ
		add(secondImage, getWidth() / 2 - (secondImage.getWidth() / 2), (getHeight() - secondImage.getHeight()) / 2);
		
		//Хоёр дахь зургийн байрлалыг шалгахын тулд 1 px өргөнтэй rect
		GRect rect = new GRect(1, 100);
		add(rect, getWidth() / 2 + k -(rect.getWidth() / 2), getHeight() / 2 - 50);//pokusiing zai
		GRect rect2 = new GRect(1, 100);
		add(rect2, getWidth() / 2 + a+c -(rect2.getWidth() / 2), getHeight() / 2 - 50);//pokusiing zai
	}
}
