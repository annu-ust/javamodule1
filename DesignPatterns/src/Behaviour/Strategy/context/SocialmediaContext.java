package Behaviour.Strategy.context;

import Behaviour.Strategy.iface.ISocialmedia;

public class SocialmediaContext {
	ISocialmedia smStrategy;
	 
	  public void setSocialmediaStrategy(ISocialmedia smStrategy) 
	  {
	    this.smStrategy = smStrategy;
	  }
	 
	  public void connect(String name) 
	  {
	    smStrategy.connectTo(name);
	  }
}
