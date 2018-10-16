package at.ran.games.testgame;

public class TestFlight {

	public static void main(String[] args) {
		
		for (int i=0;i<100;i++){
			double t = (double)i;
			double c1 = 5*t*t;
			double co = 50;
			
			double y = c1 - co;
			System.out.println(y);
		}

	}

}
