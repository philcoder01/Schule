package at.ran.games.wintergames.actors;

import org.newdawn.slick.Graphics;

public interface Actor {
	public void render(Graphics g);
	public void update(int delta);
}
