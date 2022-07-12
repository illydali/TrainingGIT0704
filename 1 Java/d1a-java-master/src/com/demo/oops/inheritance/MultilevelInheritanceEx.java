package com.demo.oops.inheritance;

public class MultilevelInheritanceEx {

}

class Phone1 {
	public void dial() {
		System.out.println("Rotating the disc mechanically");
	}

	public void hearRingTone() {
		System.out.println("Tring tring");
	}
}

class FeaturePhone1 extends Phone1 {
	public void dial() {
		System.out.println("Press the physical buttons");
	}
}

class SmartPhone1 extends FeaturePhone1 {
	public void dial() {
		System.out.println("Press the soft keys");
	}
}