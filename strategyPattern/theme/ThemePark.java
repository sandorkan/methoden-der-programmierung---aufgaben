package theme;

public class ThemePark {
	
	private Theme theme;
	
	/*
	 * You can choose 3 different themes
	 * 1. ThemeHorror
	 * 2. ThemeKid
	 * 3. ThemeAdult
	 */
	
	public void setTheme(Theme t){
		this.theme = t;
	}
	
	public void showTheme(){
		this.theme.printTheme();
	}
	
	public static void main(String[] args) {
		ThemePark p = new ThemePark();
		
		p.setTheme(new ThemeHorror());
		
		p.showTheme();
		
		p.setTheme(new ThemeAdult());
		
		p.showTheme();
		
		
	}
	
	

}
