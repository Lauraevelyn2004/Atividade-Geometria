package geometria;

public class Rectangle {
 private int width;
 private int height;
 
 public Rectangle(int width, int height) {
	 this.width = width;
	 this.height = height;
 }
 
 public int calculateArea() {
	 return width*height;
 }
 
 public void printRectangle() {
	 for(int i=0; i < height; i++) {
		 for(int j=0; j< width; j++ ) {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
 }
}
