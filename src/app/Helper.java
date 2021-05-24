package app;

import java.util.ArrayList;

import factory.FridgeFactory;
import fridge.Chocolate;
import fridge.Fridge;

public class Helper {

	FridgeFactory fridgeFactory = new FridgeFactory();

	Fridge[] chocArray = new Fridge[25];
	Fridge[] crispsArray = new Fridge[25];
	Fridge[] softDrinksArray = new Fridge[25];

	public Helper() {

		// making 30 chocolates
		for (int i = 0; i < 25; i++) {
			chocArray[i] = fridgeFactory.getFridgeType("chocolate", i);
		}

		// making 30 crisps
		for (int i = 0; i < 25; i++) {
			crispsArray[i] = fridgeFactory.getFridgeType("crisps", i);
		}

		// making 30 soft drinks
		for (int i = 0; i < 25; i++) {
			softDrinksArray[i] = fridgeFactory.getFridgeType("soft drinks", i);
		}

	}

	public Fridge[] getChocArray() {
		return chocArray;
	}
	
	public Fridge[] getCrispsArray() {
		return crispsArray;
	}

	public Fridge[] getSoftDrinksArray() {
		return softDrinksArray;
	}
	




}
