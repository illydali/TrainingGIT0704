package com.demo.oops.inheritance;

public class SingleInheritanceEx {

}

class Phone {
	public void dial() {
		System.out.println("Rotating the disc mechanically");
	}

	public void hearRingTone() {
		System.out.println("Tring tring");
	}
}

class FeaturePhone extends Phone {
	public void dial() {
		System.out.println("Press the keys");
	}
}