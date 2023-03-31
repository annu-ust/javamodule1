package Behaviour.Observer.consumers;

import Behaviour.Observer.iface.WeatherObserver;

public class Newspaper implements WeatherObserver {
	
public void doUpdate(int temperature) {
		
		System.out.println("Newspapers are updating temperature as " + temperature);
		//boolean result = new NewsPapers() instanceof WeatherObserver;
		//System.out.println(result);

	}

}
