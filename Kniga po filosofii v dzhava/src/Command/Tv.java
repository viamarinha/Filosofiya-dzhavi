package Command;

public class Tv implements Command{
	
	 private String allumer;

	@Override
	public void execute() {
		this.allumer = " I turn on Tv";
		System.out.println(allumer);
	}

}
