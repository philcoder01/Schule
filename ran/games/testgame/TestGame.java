package at.ran.games.testgame;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.BigImage;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.particles.ParticleSystem;

public class TestGame extends BasicGame {
	public static final int WIDTH = 640;
	public static final int HEIGHT = 480;
	private Ball ball;
	private Image image;
	private ParticleSystem ps;
	private boolean showExplosion = false;
	

	public TestGame(String title) {
		super(title);

		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		System.out.println("init");
		this.ball = new Ball();
		this.image = new Image("testdata/logo.png");
		System.out.println(gc.getWidth());
		Explosion ex = new Explosion();
		this.ps = ex.getExplosionSystem();
		

	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		this.ps.update(delta);
		ball.update(delta);

	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		
		// explosions
		if (this.showExplosion) {
			this.ps.render();
		}
		
		
		// ball
		g.draw(ball.getShape());
		g.fill(ball.getShape());
		
		// image
		image.draw(70, 70, 0.5f);
		image.rotate(2);
		image.setCenterOfRotation(70, 90);
		
		
		// String
		g.drawString("Das ist ein guter Tag...", 300, 400);

		// System.out.println("in render");
	}

	@Override
	public void keyPressed(int key, char c) {
		System.out.println(key);
		switch (key) {
		case 203:
			this.showExplosion = true;
			break;
		case 205:
			this.showExplosion = false;
			break;
		default:
			break;
		}

	}

	public static void main(String[] args) {
		try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new TestGame("Simple Slick Game"));
			appgc.setDisplayMode(TestGame.WIDTH, TestGame.HEIGHT, false);
			appgc.start();

		} catch (SlickException ex) {
			Logger.getLogger(TestGame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
