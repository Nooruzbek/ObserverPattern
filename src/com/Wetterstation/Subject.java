package com.Wetterstation;

import java.util.HashSet;
import java.util.Set;

public class Subject<T> {
	private Set<Observer<T>> observers;

	public void addObserver(Observer<T> newObserver){
		if (observers == null){
			observers = new HashSet<>();
		}
		checkObjectToNull(newObserver);
		this.observers.add(newObserver);
	}

	public void deleteObserver(Observer<T> observer){
		checkObjectToNull(observer);
		observers.remove(observer);
	}

	public void notifyObservers(T type){
		observers.forEach(tObserver -> {
			tObserver.update(type);
		});
	}

	private void checkObjectToNull(Observer<T> observer){
		if (observer == null){
			throw new IllegalArgumentException("Observer cant be null");
		}
	}
}
