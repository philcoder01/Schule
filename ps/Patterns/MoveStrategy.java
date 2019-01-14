package at.ran.games.wintergames;

public interface MoveStrategy {
	public float getX();
	public float getY();
	public void update(int delta);
}
