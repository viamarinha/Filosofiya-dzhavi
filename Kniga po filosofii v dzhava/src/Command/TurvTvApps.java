package Command;

public class TurvTvApps {

	public static void main(String[] args) {
		
		Command tv = new Tv();
		Invoker in = new Invoker();
		in.setCommand(tv);
		in.turnTvon();
	}

}
