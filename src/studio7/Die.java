package studio7;

public class Die {
	private int sideNum;
	
	public Die(int sideNum) {
		
		this.sideNum = sideNum;
		
	}
	public int throwDie() {
		return 	(int)(Math.random()*(this.sideNum) + 1);
	}

	public static void main(String[] args) {
		Die d1 = new Die(6);
		d1.throwDie();
		System.out.println(d1.throwDie());

	}

}
