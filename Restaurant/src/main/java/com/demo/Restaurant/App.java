package com.demo.Restaurant;

import java.util.Scanner;

import com.demo.Restaurant.model.DrinkItem;
import com.demo.Restaurant.model.MealItem;
import com.demo.Restaurant.service.DrinkBuilder;
import com.demo.Restaurant.service.ItemBuilder;
import com.demo.Restaurant.serviceImpl.IceDrinkBuilder;
import com.demo.Restaurant.serviceImpl.ItalianItemBuilder;
import com.demo.Restaurant.serviceImpl.MexcianItemBuilder;
import com.demo.Restaurant.serviceImpl.PolishItemBuilder;

public class App {
	public static void main(String[] args) {
		System.out.println("Type of order to enter:");
		System.out.println("");
		System.out.println("1. Food");
		System.out.println("2. Drink");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();

		if (choice == 1) // FOOD Menu
		{
			System.out.println("Food Name:");
			System.out.println("");
			System.out.println("1. Italian");
			System.out.println("2. Polish");
			System.out.println("3. Mexcian");
			Scanner input1 = new Scanner(System.in);
			int choice1 = input1.nextInt();

			if (choice1 == 1) {
				ItemBuilder itembuilder = new ItalianItemBuilder();
				Lunch lunch = new Lunch(itembuilder);
				lunch.constructLunch();
				MealItem mealitem = lunch.getMealItem();
				System.out.println("It is Italian Cusine" + mealitem);
			}

			if (choice1 == 2) {

				ItemBuilder itembuilder = new PolishItemBuilder();
				Lunch lunch = new Lunch(itembuilder);
				lunch.constructLunch();
				MealItem mealitem = lunch.getMealItem();
				System.out.println("It is Polish Cusine" + mealitem);
			}
			if (choice1 == 3) {
				ItemBuilder itembuilder = new MexcianItemBuilder();
				Lunch lunch = new Lunch(itembuilder);
				lunch.constructLunch();
				MealItem mealitem = lunch.getMealItem();
				System.out.println("It is Mexcian Cusine" + mealitem);
			}

		} else if (choice == 2) // Drink Menu
		{
			System.out.println("Drink Name");
			System.out.println("");
			System.out.println("1. IceDrink");
			System.out.println("2. LemonDrink");
			Scanner input2 = new Scanner(System.in);
			int choice2 = input2.nextInt();

			if (choice2 == 1) {
				DrinkBuilder drinkbuilder = new IceDrinkBuilder();
				Drink drink = new Drink(drinkbuilder);
				drink.constructDrink();
				DrinkItem drinkitem = drink.getDrinkItem();
				System.out.println("It is Ice drink" + drinkitem);
			}

			if (choice2 == 2) {

				DrinkBuilder drinkbuilder = new IceDrinkBuilder();
				Drink drink = new Drink(drinkbuilder);
				drink.constructDrink();
				DrinkItem drinkitem = drink.getDrinkItem();
				System.out.println("It is Lemon drink" + drinkitem);
			}
		}

	}
}
