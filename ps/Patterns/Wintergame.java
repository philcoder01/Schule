package at.ran.games.wintergames;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tests.AnimationTest;

import at.ran.games.wintergames.actors.Actor;
import at.ran.games.wintergames.actors.HTLCircle;
import at.ran.games.wintergames.actors.HTLRectangle;
import at.ran.games.wintergames.observer.Observable;
import at.ran.games.wintergames.observer.Observer;
import at.ran.games.wintergames.singletone.singletone;
import at.ran.games.wintergames.*;

public class Wintergame extends BasicGame implements Observable {
	private List<Actor> actors;
	private ArrayList<Observer> observer = new ArrayList<>();
	singletone singletoneObject = singletone.getInstance(); 

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
		MoveStrategy mr1 = new MoveRight(0,0,0.3f);
		MoveStrategy mr2 = new MoveLeft(500,100,0.1f);
		MoveStrategy mr3 = new MoveLeft(540,200, 0.2f);
		
		HTLCircle c1 = new HTLCircle(mr1);
		HTLCircle c2 = new HTLCircle(mr2);
		HTLRectangle r1 = new HTLRectangle(mr3);

		this.actors.add(c1);
		this.actors.add(c2);
		this.actors.add(r1);
		
		this.addObserver(r1);
		this.addObserver(c1);

	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		for (Actor actor : actors) {
			actor.update(delta);
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

	@Override
	public void addObserver(Observer observer) {
		this.observer.add(observer);
	}

	@Override
	public void informAll() {
		for (Observer ob : this.observer) {
			ob.onInform();
		}
	}
	
	@Override
	public void keyPressed(int key, char c) {
		super.keyPressed(key, c);
		
		if(key == Input.KEY_ENTER) {
			singletonObject.showMessage();
			this.informAll();
		}
	}
}
