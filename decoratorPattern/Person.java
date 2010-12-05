package decoratorPattern;

public abstract class Person {
	
	private String name;
	private String description = "Generic Person";
	
	public String getDescription(){
		return this.name;
	}
	
	public abstract double clothingCost();
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(){
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	

}
