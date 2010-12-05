package decoratorPattern;

public class Trousers extends PersonClothes{
	Person person;
	
	public Trousers(Person person){
		this.person = person;
	}
	
	@Override
	public String getDescription() {
		return this.person.getDescription() + ", Trousers";
	}

	@Override
	public double clothingCost() {
		return 120 + person.clothingCost();
	}

}
