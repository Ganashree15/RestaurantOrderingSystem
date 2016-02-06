package com.demo.Restaurant.serviceImpl;

import com.demo.Restaurant.model.MealItem;
import com.demo.Restaurant.service.ItemBuilder;

public class PolishItemBuilder implements ItemBuilder {
	private MealItem mealitem;

	public PolishItemBuilder() {
		mealitem = new MealItem();

	}

	public void buildCourse() {
		mealitem.setCourses("Pierogi with mushrooms ");

	}

	public void buildDessert() {
		mealitem.setDessert("Donnet");

	}

	public MealItem getMealItem() {
		return mealitem;
	}

	public void buildprice() {
		mealitem.setPrice(75.0f);
	}

}
