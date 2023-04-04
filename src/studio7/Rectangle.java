package studio7;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		length = 1.0;
		width = 2.0;
	}
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
		
	}
	
	public double area() {
		
		return this.length*this.width;
	}
	
	public double perimeter () {
		
		return 2*(this.length+this.width);
	}
	
	public boolean compare (Rectangle r2) {
		
		if(this.area() > r2.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean squareCheck() {
		if(this.length == this.width) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(1.0,2.0);
		Rectangle r2 = new Rectangle(3.0,4.0);
//		System.out.println(r1.squareCheck());
		System.out.println(r1);
	}

}