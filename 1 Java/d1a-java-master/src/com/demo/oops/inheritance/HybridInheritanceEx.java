package com.demo.oops.inheritance;

public class HybridInheritanceEx {

}

class Phone3 {
	public void dial() {
		System.out.println("Rotating the disc mechanically");
	}

	public void hearRingTone() {
		System.out.println("Tring tring");
	}
}


class FeaturePhone3 extends Phone3 {
	public void dial() {
		System.out.println("Press the keys");
	}
}

class SmartPhone3G3 extends FeaturePhone3 {
//	public void dial() {
//		System.out.println("Press the soft keys");
//	}
	public void authenticate() {
		System.err.println("Using Fingerprint scanner");
	}
}

class SmartPhone4G3 extends FeaturePhone3 {
//	public void dial() {
//		System.out.println("Press the soft keys");
//	}
	public void authenticate() {
		System.err.println("Using Retina Scanner");
	}
}