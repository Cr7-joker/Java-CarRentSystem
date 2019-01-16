package com.imooc;

public class PickUp extends Car {
	private String name;
	private int rent;
	private int peopleVolume;
	private int thingsVolume;
	public PickUp(String name,int rent,int peopleVolume,int thingsVolume) {
		this.name=name;
		this.rent=rent;
		this.peopleVolume=peopleVolume;
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
	public void setPeopleVolume(int peopleVolume) {
		this.peopleVolume = peopleVolume;
	}
	public void getVolume() {
		System.out.println("‘ÿ»À£∫"+peopleVolume+"»À	‘ÿªı£∫"+thingsVolume+"∂÷");
	}
	public void setThingsVolume(int thingsVolume) {
		this.thingsVolume = thingsVolume;
	}
	public int getThingsVolume() {
		return thingsVolume;
	}
	public int getPeopleVolume() {
		return peopleVolume;
	}
}
