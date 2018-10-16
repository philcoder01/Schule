package at.ran.games.testgame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Shape;

public class ImageActor {
	Image sprite;
	
	public ImageActor() {
		// TODO Auto-generated constructor stub
		try {
			sprite = new Image("testdata/logo.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void draw(Graphics g){
		sprite.draw(100, 100);
	}
	

}
