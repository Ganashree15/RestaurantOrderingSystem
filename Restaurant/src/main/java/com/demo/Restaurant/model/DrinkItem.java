package com.demo.Restaurant.model;

public class DrinkItem {
	private String drink;
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	@Override
	public String toString() {
		return "DrinkItem [drink=" + drink + ", price=" + price + "]";
	}

}
