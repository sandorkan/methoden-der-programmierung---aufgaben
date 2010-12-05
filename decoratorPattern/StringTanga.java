package decoratorPattern;

public class StringTanga extends PersonClothes {

	Person person;
	
	public StringTanga(Person person){
		this.person = person;
	}
	
	@Override
	public String getDescription() {
		return this.person.getDescription() + ", String Tanga";
	}

	@Override
	public double clothingCost() {
		return 50 + person.clothingCost();
	}

}
