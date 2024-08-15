package observer.subject;

import observer.observer.Observer;

public interface Subject {

	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
