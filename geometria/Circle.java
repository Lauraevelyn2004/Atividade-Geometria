package geometria;

public class Circle {
	private int radius;
	
	public Circle(int radius) {
		this.radius =radius;
	}
	
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	public void printCircle() {
		for(int i = -radius; i <= radius; i++) {
			for(int j = -radius; j <= radius; j++){
			double distance = Math.sqrt(i*i+j*j);
			
			if(distance <= radius + 0.5) {
				System.out.print("*");
			}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}		
	}
}
