package Structural.Adapter.main;

import Structural.Adapter.phoneifaces.LightningPhone;
import Structural.Adapter.phoneifaces.MicroUsbPhone;
import Structural.Adapter.phoneimp.Andriod;
import Structural.Adapter.phoneimp.Iphone;
import Structural.Adapter.wrap.LightningToMicroUsbAdapter;

public class AdapterMainDemo {
	public static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
		phone.useMicroUsb();
		phone.recharge();
	}

	public static void rechargeLightningPhone(LightningPhone phone) {
		phone.useLightning();
		phone.recharge();
	}

	public static void main(String[] args) {
		Andriod android = new Andriod();
		Iphone iPhone = new Iphone();
		
		boolean result = android instanceof MicroUsbPhone;
		System.out.println(result);
		

		System.out.println("Recharging android with MicroUsb");
		rechargeMicroUsbPhone(android);

		System.out.println("Recharging iPhone with Lightning");
		rechargeLightningPhone(iPhone);

				
		System.out.println("Recharging iPhone with MicroUsb");
	    rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iPhone));// call goes to  line#11
	}
	

}
