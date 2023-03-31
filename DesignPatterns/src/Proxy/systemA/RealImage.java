package Proxy.systemA;

import Proxy.iface.Image;

public class RealImage implements Image{
	private final String filename;

	public RealImage(String filename) {
		super();
		this.filename = filename;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		
		System.out.println("Loading ...... "+filename);
	}

	@Override
	public void showImage() {
		
		System.out.println("Dispalying Image..... "+filename);
	}
}
