package com.ipartek.formacion.clases.pajareria;

public class Canary extends Bird {
	private boolean canSing;
	

	public Canary() {
		super();
		this.canSing = false;
	}
	
	public Canary(boolean canSing) {
		super();
		this.canSing = canSing;
	}

	
	public boolean isCanSing() {
		return canSing;
	}

	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}

	
	@Override
	public String toString() {
		return super.toString() + "canSing=" + canSing;
	}
}
