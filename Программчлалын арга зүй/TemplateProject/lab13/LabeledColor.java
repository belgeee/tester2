	package lab13;
	
	import java.awt.Color;
	public class LabeledColor extends Color {
		
		public LabeledColor(Color color, String colorName) {
		      super(color.getRGB()); 
		      this.color = color;
		      this.colorName = colorName;
		     
		}
		public Color getColor(){
			return color;
		}
		public String toString(){
			return colorName;
		}
		
		private String colorName;
		private Color color;
	}
