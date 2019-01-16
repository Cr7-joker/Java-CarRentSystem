package com.imooc;

public class ThingsCar extends Car {
	private String name;
	private int rent;
	private int thingsVolume;
	public ThingsCar(String name,int rent,int thingsVolume) {
		this.name=name;
		this.rent=rent;
		this.thingsVolume=thingsVolume;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getThingsVolume() {
		return thingsVolume;
	}
	public void setThingsVolume(int thingsVolume) {
		this.thingsVolume = thingsVolume;
	}
	public void getVolume() {
		System.out.println("‘ÿªı£∫"+thingsVolume+"∂÷");
	}
}
