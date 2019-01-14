package at.ran.games.wintergames.factory;
import org.newdawn.slick.Graphics;
import at.ran.games.wintergames.*;

import at.ran.games.wintergames.actors.Actor;

public class ShapeFactory implements Actor {
	
	private int width, height;
	
	public ShapeFactory(MoveStrategy MoveStrategy, int width, int height) {
        super();
        this.width = width;
        this.height = height;
	}

	@Override
	public void render(Graphics g) {
		g.drawOval(111,111, height, width);
	}

	@Override
	public void update(int delta) {
	}
}
