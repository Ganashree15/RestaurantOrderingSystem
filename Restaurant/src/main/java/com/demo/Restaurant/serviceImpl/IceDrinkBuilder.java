package com.demo.Restaurant.serviceImpl;

import com.demo.Restaurant.model.DrinkItem;
import com.demo.Restaurant.service.DrinkBuilder;

public class IceDrinkBuilder implements DrinkBuilder {

	private DrinkItem drinkitem;

	public IceDrinkBuilder() {
		drinkitem = new DrinkItem();

	}

	public void buildDrink() {
		drinkitem.setDrink("IceTea");

	}

	public DrinkItem getDrinkItem() {

		return drinkitem;
	}

	public void buildprice() {
		drinkitem.setPrice(25.0f);
	}

}
