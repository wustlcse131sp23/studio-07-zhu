package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		
	}
	
	public double add(Fraction f2) {
		if(this.denominator == f2.denominator) {
			return (this.numerator+f2.numerator)/this.denominator;
		}else {
			return (this.numerator*f2.denominator + this.denominator*f2.numerator)/(this.denominator*f2.denominator);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
