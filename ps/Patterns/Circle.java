package at.ps.Patterns;

import org.newdawn.slick.Graphics;
import at.jd.Patterns.Actors;

public class Circle implements Actors{
	
	private int x;
	private int y;
	private int radius;

	
	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void render(Graphics g){
		g.drawOval(this.x, this.y, this.radius, this.radius);
	}
	
	public void move(){		
		this.y++;
	}
	 
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	

}
