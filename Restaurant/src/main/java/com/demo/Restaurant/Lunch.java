package com.demo.Restaurant;

import com.demo.Restaurant.model.MealItem;
import com.demo.Restaurant.service.ItemBuilder;

public class Lunch {
	private ItemBuilder itembuilder = null;

	public Lunch(ItemBuilder itembuilder) {
		this.itembuilder = itembuilder;

	}

	public void constructLunch() {
		itembuilder.buildCourse();
		itembuilder.buildDessert();
		itembuilder.buildprice();
	}

	public MealItem getMealItem() {
		return itembuilder.getMealItem();
	}

}
