package decoratorPattern;

public class Pullover extends PersonClothes {

	Person person;
	
	public Pullover(Person person){
		this.person = person;
	}
	
	@Override
	public String getDescription() {
		return this.person.getDescription() + ", Pullover";
	}

	@Override
	public double clothingCost() {
		return 80 + person.clothingCost();
	}

}
