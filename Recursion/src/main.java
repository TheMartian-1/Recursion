
public class main {

	public static void eatCake(Cake cake) {
		if(!cake.isEmpty()) {
		cake.takeBite();
		eatCake(cake);
		}
		return;
	}
	
	public static void main(String[] args) {
		Cake cake = new Cake();
		eatCake(cake);
		System.out.println("Done eating cake. Time to work!");

	}

}
