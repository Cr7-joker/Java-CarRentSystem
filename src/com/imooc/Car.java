package com.imooc;

public abstract class Car {
	private String name;
	private int rent;
	private int peopleVolume;
	private int thingsVolume;
	public int getPeopleVolume() {
		return peopleVolume;
	}
	public void setPeopleVolume(int peopleVolume) {
		this.peopleVolume = peopleVolume;
	}
	public int getThingsVolume() {
		return thingsVolume;
	}
	public void setThingsVolume(int thingsVolume) {
		this.thingsVolume = thingsVolume;
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
	public abstract void getVolume();
}
