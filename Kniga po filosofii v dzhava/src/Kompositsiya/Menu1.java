package Kompositsiya;

public class Menu1 {

	private String name;
	private Soup soup;
	
	private int qty;
	
	public Menu1(String name,  int qty) {
	
		this.name = name;
		this.qty = qty;
	}
	
	public void addSoup(Soup soupe) {
		this.soup = soupe;
	}
	public void createSoup() {
		this.soup = new Soup();
		soup.toString();
	}
	public Soup getSoup() {
		return soup;
	}

	
}
