package Behaviour.Observer.subject;

import Behaviour.Observer.iface.WeatherObserver;

public abstract class Observable {
	 public abstract void addObserver(WeatherObserver weatherObserver);
		public abstract void removeObserver(WeatherObserver weatherObserver);
		public abstract void doNotify(); // update


}
