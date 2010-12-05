package decoratorPattern;

public class Underpants extends PersonClothes {
	Person person;
	
	public Underpants(Person person){
		this.person = person;
	}
	
	@Override
	public String getDescription() {
		return this.person.getDescription() + ", Underpants";
	}

	@Override
	public double clothingCost() {
		return 15 + person.clothingCost();
	}

}
