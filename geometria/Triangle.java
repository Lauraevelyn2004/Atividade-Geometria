package geometria;

public class Triangle {
	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base =base;
		this.height = height;
		
	}
	
	public double calculateArea() {
		return (base*height)/2.0;
	}
	
	public void printTriangle() {
		for(int i=1; i<=height;i++){
			int stars = (int)Math.round(((double)i/height)*base);
			
			  for (int s = 0; s < base - stars; s++) {
		            System.out.print(" ");
		      }
			  for(int j = 0; j<stars;j++){
				System.out.print(" * ");
			  }
			System.out.println();
		}
		
	}

}
