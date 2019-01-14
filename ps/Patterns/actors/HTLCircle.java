package at.ran.games.wintergames.actors;

import org.newdawn.slick.Graphics;
import at.ran.games.wintergames.*;
import at.ran.games.wintergames.observer.Observer;

public class HTLCircle implements Actor, Observer{
	private MoveStrategy moveStrategy;
	
	public HTLCircle(MoveStrategy mr) {
		super();
		this.moveStrategy = mr;
	}

	@Override
	public void render(Graphics g) {
		g.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 25,25);
	}

	@Override
	public void update(int delta) {
		moveStrategy.update(delta);
	}

	@Override
	public void onInform() {
		System.out.println("Circle");
	}
}
