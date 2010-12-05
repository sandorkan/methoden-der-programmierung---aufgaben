package decoratorPattern;

public class TShirt extends PersonClothes {
	
	Person person;
	
	public TShirt(Person person){
		this.person = person;
	}
	
	@Override
	public String getDescription() {
		return this.person.getDescription() + ", T-Shirt";
	}

	@Override
	public double clothingCost() {
		return 30 + person.clothingCost();
	}
}
