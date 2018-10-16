package at.ran.games.testgame;

import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Ball {
	private Circle ball;
	int cnt = 0;
	int direction = 0;
	int x = 300;
	int y = 0;
	int time = 0;
	

	public Ball() {

		ball = new Circle(x, y, 5);

	}

	public void update(int delta) {
		time += delta;
		double sec = (double) time / 250;
		int yd = (int) (5d * sec * sec);
		this.y = (int) yd;
		if (this.y > 500) {
			this.y = 0;
			this.time = 0;
		}

		this.x = (int) (sec * 50d);
		//System.out.println("new y:" + y + " time:" + this.time / 1000);
	}

	public Shape getShape() {
		ball.setX(x);
		ball.setY(y);

		return ball;
	}

}
