package Kompositsiya;

public class MenuApps {

	public static void main(String[] args) {
		
		Soup soup = new Soup();
		Menu m = new Menu("Utro", soup, 45);
		System.out.println( m.toString());
		
		Menu1 menu1 = new Menu1("Menu1",50);
		menu1.addSoup(soup);
		
		Soup soup2 = menu1.getSoup();
		String string = soup2.toString();
		System.out.println(string);

	}

}
