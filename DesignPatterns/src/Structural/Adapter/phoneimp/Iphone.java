package Structural.Adapter.phoneimp;

import Structural.Adapter.phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {
	private boolean connector;
	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector) {
			 System.out.println("recharge started"); 
			 System.out.println("recharge finished");
		  }
		  else {
			  System.out.println("connect  first");
		  }
	}

	@Override
	public void useLightning() {
		// TODO Auto-generated method stub
		connector=true;
		 System.out.println("Lightning connected");
	}

}
