package Structural.Adapter.wrap;

import Structural.Adapter.phoneifaces.LightningPhone;
import Structural.Adapter.phoneifaces.MicroUsbPhone;

public class LightningToMicroUsbAdapter implements MicroUsbPhone{
	
	  private final LightningPhone lightningPhone;

	    public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
	        this.lightningPhone = lightningPhone;
	    }

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		 lightningPhone.recharge();
		
		
	}

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		System.out.println("MicroUsb connected");
        lightningPhone.useLightning();
	}

}
