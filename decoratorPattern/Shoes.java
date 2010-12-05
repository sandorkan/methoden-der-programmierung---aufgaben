package decoratorPattern;

public class Shoes extends PersonClothes {

	Person person;
	
	public Shoes(Person person){
		this.person = person;
	}
	
	@Override
	public String getDescription() {
		return this.person.getDescription() + ", Shoes";
	}

	@Override
	public double clothingCost() {
		return 60 + person.clothingCost();
	}

}
