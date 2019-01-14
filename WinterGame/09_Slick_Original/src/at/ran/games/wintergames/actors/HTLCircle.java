package at.ran.games.wintergames.actors;

import org.newdawn.slick.Graphics;

public class HTLCircle implements Actor{
	private float x,y;
	
	
	public HTLCircle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void render(Graphics g) {
		g.drawOval(this.x, this.y, 20,20);
		
	}

	@Override
	public void update(int delta) {
		this.x += delta * 0.3;
		
	}


	
}
