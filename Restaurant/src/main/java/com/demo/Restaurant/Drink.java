package com.demo.Restaurant;

import com.demo.Restaurant.model.DrinkItem;
import com.demo.Restaurant.service.DrinkBuilder;

public class Drink {
	private DrinkBuilder drinkbuilder = null;

	public Drink(DrinkBuilder drinkbuilder) {
		this.drinkbuilder = drinkbuilder;
	}

	public DrinkItem getDrinkItem() {
		return drinkbuilder.getDrinkItem();
	}

	public void constructDrink() {
		drinkbuilder.buildDrink();
		drinkbuilder.buildprice();

	}

}
