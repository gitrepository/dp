package com.ch07;

public class AdapterTurkey implements IDuck {
	ITurkey turkey;

	public AdapterTurkey(ITurkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		//Turkey need to more times to cover the distance flew by Duck
		for(int i=0; i<5; i++){
			turkey.fly();
		}
	}
}
