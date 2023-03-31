package Behaviour.Observer.main.test;

import Behaviour.Observer.consumers.Newspaper;
import Behaviour.Observer.consumers.TvChannels;
import Behaviour.Observer.subjectimp.WeatherStation;

public class TestObserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvChannels observer1 = new TvChannels(); // subscriber
		Newspaper  observer2 = new Newspaper(); // subscriber
		TvChannels observer3 = new TvChannels();
	
		WeatherStation weatherStation = new WeatherStation(33);
		weatherStation.addObserver(observer1);
		weatherStation.addObserver(observer2);
		weatherStation.addObserver(observer3);

		weatherStation.setTemparature(30);

		// weatherStation.removeObserver(observer1);

	}

}
