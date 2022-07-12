package com.demo.oops.inheritance;

public class HierarchicalInheritance {

}


class SmartPhone11  {
	public void dial() {
		System.out.println("Press the soft keys");
	}
}

class SmartPhone3G extends SmartPhone11 {
//	public void dial() {
//		System.out.println("Press the soft keys");
//	}
	public void authenticate() {
		System.err.println("Using Fingerprint scanner");
	}
}

class SmartPhone4G extends SmartPhone11 {
//	public void dial() {
//		System.out.println("Press the soft keys");
//	}
	public void authenticate() {
		System.err.println("Using Retina Scanner");
	}
}