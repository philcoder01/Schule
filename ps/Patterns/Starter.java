spackage at.ps.Patterns;


import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import at.jd.Patterns.Circle;

public class Starter extends BasicGame{

	private ArrayList<Circle> circles;
	private ArrayList<Actors> actors;
	
	public Starter(String Patterns) {
		super("Patterns");
		
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		for (Actors a : actors){
			a.render(g);
		}
		
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		this.actors = new ArrayList<>();
		this.actors.add(new Circle(123, 123, 124));
		
	}

	@Override
	public void update(GameContainer gc, int millisSinceLastCall) throws SlickException {
	
		for (Circle c : circles) {
			c.move();
		} 
		
	}
	public static void main(String[] argv) {
		try {
			AppGameContainer container =  new AppGameContainer(
					new Starter("Patterns"));
			container.setDisplayMode(900, 800, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
