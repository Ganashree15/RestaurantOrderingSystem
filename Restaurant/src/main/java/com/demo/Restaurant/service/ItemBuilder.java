package com.demo.Restaurant.service;

import com.demo.Restaurant.model.MealItem;

public interface ItemBuilder {

	public void buildCourse();

	public void buildDessert();

	public MealItem getMealItem();

	public void buildprice();

}
