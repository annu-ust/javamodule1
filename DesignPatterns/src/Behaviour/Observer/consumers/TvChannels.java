package Behaviour.Observer.consumers;

import Behaviour.Observer.iface.WeatherObserver;

public class TvChannels implements WeatherObserver{

	@Override
	public void doUpdate(int temperature) {
		// TODO Auto-generated method stub
		
			
			System.out.println("TV are updating temperature as " + temperature);
			//boolean result = new NewsPapers() instanceof WeatherObserver;
			//System.out.println(result);

		
	}

}
