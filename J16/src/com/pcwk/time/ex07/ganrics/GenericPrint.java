package com.pcwk.time.ex07.ganrics;

public class GenericPrint<T> {
		
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return material.toString();
	}
	
}
