package com.demo.Restaurant.model;

public class MealItem {

	private String courses;
	private String dessert;
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	@Override
	public String toString() {
		return "MealItem [courses=" + courses + ", dessert=" + dessert + ", price=" + price + "]";
	}

}
