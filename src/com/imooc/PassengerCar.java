package com.imooc;

public class PassengerCar extends Car {
	private String name;
	private int rent;
	private int peopleVolume;
	public PassengerCar(String name,int rent,int peopleVolume) {
		this.name=name;
		this.rent=rent;
		this.peopleVolume=peopleVolume;
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
	public int getPeopleVolume() {
		return peopleVolume;
	}
	public void getVolume() {
		System.out.println("‘ÿ»À£∫"+peopleVolume+"»À"); 
	}
	public void setPeopleVolume(int peopleVolume) {
		this.peopleVolume = peopleVolume;
	}
	
}
