package Kompositsiya;

public class MenuApps {

	public static void main(String[] args) {
		
		Soup soup = new Soup();
		Menu m = new Menu("Utro", soup, 45);
		System.out.println( m.toString());

	}

}
