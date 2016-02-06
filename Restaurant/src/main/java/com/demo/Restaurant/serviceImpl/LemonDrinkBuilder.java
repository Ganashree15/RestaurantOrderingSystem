package com.demo.Restaurant.serviceImpl;

import com.demo.Restaurant.model.DrinkItem;
import com.demo.Restaurant.service.DrinkBuilder;

public class LemonDrinkBuilder implements DrinkBuilder {

	private DrinkItem drinkitem;

	public LemonDrinkBuilder() {
		drinkitem = new DrinkItem();

	}

	public void buildDrink() {
		drinkitem.setDrink("LemonTea");

	}

	public DrinkItem getDrinkItem() {

		return drinkitem;
	}

	public void buildprice() {
		drinkitem.setPrice(35.0f);
	}
}
