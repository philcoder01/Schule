package at.ran.games.wintergames.observer;

public interface Observable {
	void addObserver(Observer observer);
	void informAll();
}
