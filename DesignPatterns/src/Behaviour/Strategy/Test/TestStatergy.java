package Behaviour.Strategy.Test;

import Behaviour.Strategy.context.SocialmediaContext;
import Behaviour.Strategy.iface.ISocialmedia;
import Behaviour.Strategy.impl.FacebookStrategy;
import Behaviour.Strategy.impl.GoogleplusStrategy;
import Behaviour.Strategy.impl.OrkutStrategy;
import Behaviour.Strategy.impl.TwitterStrategy;

public class TestStatergy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating social Media Connect Object for connecting with friend by
	    // any social media strategy.
	    SocialmediaContext context = new SocialmediaContext();
	 
	    // Setting Facebook strategy.
	    context.setSocialmediaStrategy(new FacebookStrategy());
	    context.connect("James Gosling");
	 
	    System.out.println("====================");
	 
	    // Setting Twitter strategy.
	    context.setSocialmediaStrategy(new TwitterStrategy());
	    context.connect("Rod Johnson");
	 
	    System.out.println("====================");
	 
	    // Setting GooglePlus strategy.
	    context.setSocialmediaStrategy(new GoogleplusStrategy());
	    context.connect("Larry Page");
	 
	    System.out.println("====================");
	 
	    // Setting Orkut strategy.
	    context.setSocialmediaStrategy(new OrkutStrategy());
	    context.connect("Sundar");

	}

}
