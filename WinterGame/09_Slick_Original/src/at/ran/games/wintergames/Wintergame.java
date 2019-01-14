package at.ran.games.wintergames;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tests.AnimationTest;

import at.ran.games.wintergames.actors.Actor;
import at.ran.games.wintergames.actors.HTLCircle;
import at.ran.games.wintergames.actors.HTLRectangle;

public class Wintergame extends BasicGame {
	private List<Actor> actors;

	public Wintergame() {
		super("Wintergame");
	}

	@Override
	public void render(GameContainer gc, Graphics graphics) throws SlickException {
		for (Actor actor : actors) {
			actor.render(graphics);
		}

	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		this.actors = new ArrayList<>();
		HTLCircle c1 = new HTLCircle(40, 40);
		HTLCircle c2 = new HTLCircle(20, 30);
		HTLRectangle r1 = new HTLRectangle(40, 200);

		this.actors.add(c1);
		this.actors.add(c2);
		this.actors.add(r1);

	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		for (Actor actor : actors) {
			actor.update(delta);;
		}
	}
	
	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new Wintergame());
			container.setDisplayMode(800,600,false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
