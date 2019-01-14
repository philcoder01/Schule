package at.ps.Patterns;

public class MoveLeftStrategy {
	private static final float SPEED=0.5f;
    private float x, y;

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public void update(int delta) {
        this.x-=SPEED*delta;
    }
}
  