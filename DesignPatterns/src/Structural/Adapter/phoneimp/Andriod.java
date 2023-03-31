package Structural.Adapter.phoneimp;

import Structural.Adapter.phoneifaces.MicroUsbPhone;

public class Andriod implements MicroUsbPhone {
    private boolean connector;
	@Override
	public void recharge() {
		// TODO Auto-generated method stub
  if(connector) {
	 System.out.println("recharge started"); 
	 System.out.println("recharge finished");
  }
  else {
	  System.out.println("connect microusb first");
  }
	}

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
 connector=true;
 System.out.println("microusb connected");
	}

}
