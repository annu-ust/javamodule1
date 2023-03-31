package Behaviour.Strategy.impl;

import Behaviour.Strategy.iface.ISocialmedia;

public class TwitterStrategy implements ISocialmedia{
	public void connectTo(String friendName) 
	  {
	    System.out.println("Connecting with " + friendName + " through Twitter");
	  }
}
