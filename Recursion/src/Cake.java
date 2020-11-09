
public class Cake {
	private int bites = 10;
	public Cake() {
		// FIXME 
	}
	
	public void takeBite() {
		if(bites <= 0) {
		System.out.println("No cake left");
		}
		else {
			bites--;
			System.out.println("tasty");
		}
		
	}
	
	public boolean isEmpty() {
		return bites == 0;
	}	
}
