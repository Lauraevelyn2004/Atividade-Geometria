package geometria;

public class Square {
	private int side;
	
	public Square(int side) {
		this.side= side;
	}
	
	public int calcArea(){
		return side*side;
	}
	
	public void printSquare(){
		for(int i =0; i< side;i++) {
			for(int j =0; j<side;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}