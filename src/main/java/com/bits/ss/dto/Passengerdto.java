package com.bits.ss.dto;

public class Passengerdto {
	private String name;
	private int age;
	private boolean frequentFlier;
	private String seatPreference;
	private int price;
	private String meals;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFrequentFlier() {
		return frequentFlier;
	}

	public void setFrequentFlier(boolean frequentFlier) {
		this.frequentFlier = frequentFlier;
	}

	public String getSeatPreference() {
		return seatPreference;
	}

	public void setSeatPreference(String seatPreference) {
		this.seatPreference = seatPreference;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

}
