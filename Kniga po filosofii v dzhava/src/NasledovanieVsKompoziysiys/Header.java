package NasledovanieVsKompoziysiys;

public class Header implements Print{
	
	String color;

	@Override
	public void print() {
		
		System.out.println("Ya pechatayu header");
		
	}
	public void changeColor() {
		this.color = "Red";
		System.out.println(this.color);
	}

}
