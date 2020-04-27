package NasledovanieVsKompoziysiys;

public class Report {

	
	private Print header , body, footer ;
	Header headerClass;
	
	void initLesinterfaces(){
		
		headerClass = new Header();
		
		header = new Header();
		body = new Body();
		footer = new Footer();
	}

	public void print() {
		
		headerClass.changeColor();
		headerClass.print();
		header.print();
		body.print();
		footer.print();
	}

}
