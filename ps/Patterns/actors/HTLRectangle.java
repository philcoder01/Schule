package at.ran.games.wintergames.actors;

import org.newdawn.slick.Graphics;
import at.ran.games.wintergames.*;
import at.ran.games.wintergames.observer.Observer;

public class HTLRectangle implements Actor, Observer{
	private MoveStrategy moveStrategy;
	
	
	public HTLRectangle(MoveStrategy mr) {
		super();
		this.moveStrategy = mr;
	}

	@Override
	public void render(Graphics g) {
		g.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(), 20,20);
		
	}

	@Override
	public void update(int delta) {
		moveStrategy.update(delta);
		
	}

	@Override
	public void onInform() {
		System.out.println("Rect");		
	}
}
