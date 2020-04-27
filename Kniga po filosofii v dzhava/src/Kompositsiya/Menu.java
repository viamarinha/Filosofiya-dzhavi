package Kompositsiya;

public class Menu {
	
	private String name;
	private Soup soup;
	private int qty;
	
	public Menu(String name, Soup soup, int qty) {
	
		this.name = name;
		this.soup = soup;
		this.qty = qty;
	}
	
	public String toString() {
		String menu ="";
		return  menu =  this.name.concat("\n") +
				this.soup.toString().concat("\n")+
				this.qty;
				
	}
	
	

}
