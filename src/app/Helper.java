package app;

import java.util.ArrayList;

import factory.FridgeFactory;
import fridge.Chocolate;
import fridge.Fridge;

public class Helper {

	FridgeFactory fridgeFactory = new FridgeFactory();

	Fridge[] chocArray = new Fridge[30];
	Fridge[] crispsArray = new Fridge[30];
	Fridge[] softDrinksArray = new Fridge[30];

	public Helper() {

		// making 30 chocolates
		for (int i = 0; i < 30; i++) {
			chocArray[i] = fridgeFactory.getFridgeType("chocolate", i);
		}

		// making 30 crisps
		for (int i = 0; i < 30; i++) {
			crispsArray[i] = fridgeFactory.getFridgeType("chocolate", i);
		}

		// making 30 soft drinks
		for (int i = 0; i < 30; i++) {
			softDrinksArray[i] = fridgeFactory.getFridgeType("chocolate", i);
		}

	}

	public Fridge[] getChocArray() {
		return chocArray;
	}
	
	public Fridge[] getCrispsArray() {
		return crispsArray;
	}

	public Fridge[] getASoftDrinksArray() {
		return softDrinksArray;
	}



}
