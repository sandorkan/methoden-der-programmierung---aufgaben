package decoratorPattern;

public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person julie = new Julie();
		Person pedro = new Pedro();
		
		julie = new Trousers(julie);
		julie = new Shoes(julie);
		julie = new Pullover(julie);
		
		Trousers t = new Trousers(pedro);
		Pullover p = new Pullover(t);
		Underpants u = new Underpants(p);
		
		System.out.println(u.getDescription() + u.clothingCost());
		
		System.out.println(julie.getDescription());

	}

}
