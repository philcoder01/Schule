package at.ran.games.wintergames.actors;

import org.newdawn.slick.Graphics;

public class HTLRectangle implements Actor {
	private float x, y;

	public HTLRectangle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void render(Graphics g) {
		g.drawRect(this.x, this.y, 40, 40);

	}

	@Override
	public void update(int delta) {
		this.x += delta * 0.4;
		this.y += delta * 0.4;
	}

}
