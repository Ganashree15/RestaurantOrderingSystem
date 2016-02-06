package com.demo.Restaurant.serviceImpl;

import com.demo.Restaurant.model.MealItem;
import com.demo.Restaurant.service.ItemBuilder;

public class ItalianItemBuilder implements ItemBuilder {

	private MealItem mealitem;

	public ItalianItemBuilder() {
		mealitem = new MealItem();

	}

	public void buildCourse() {
		mealitem.setCourses("Pasta");

	}

	public void buildDessert() {
		mealitem.setDessert("cheesecake");

	}

	public MealItem getMealItem() {
		return mealitem;
	}

	public void buildprice() {
		mealitem.setPrice(50.0f);
	}

}
