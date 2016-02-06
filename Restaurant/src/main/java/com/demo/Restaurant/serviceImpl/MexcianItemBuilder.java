package com.demo.Restaurant.serviceImpl;

import com.demo.Restaurant.model.MealItem;
import com.demo.Restaurant.service.ItemBuilder;

public class MexcianItemBuilder implements ItemBuilder {
	private MealItem mealitem;

	public MexcianItemBuilder() {
		mealitem = new MealItem();

	}

	public void buildCourse() {
		mealitem.setCourses("Mexcian Rice");

	}

	public void buildDessert() {
		mealitem.setDessert("cupcake");

	}

	public MealItem getMealItem() {
		return mealitem;
	}

	public void buildprice() {
		mealitem.setPrice(45.0f);
	}

}
