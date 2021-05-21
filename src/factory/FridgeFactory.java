package factory;

import java.util.Random;

import fridge.Chocolate;
import fridge.Crisps;
import fridge.Fridge;
import fridge.SoftDrinks;

public class FridgeFactory {

	public FridgeFactory() {

	}

	public Fridge getFridgeType(String fridgeType, int posInFridge) {

		if (fridgeType.equalsIgnoreCase("chocolate")) {
			return new Chocolate(getChocolateType(posInFridge), 1.20);
		} else if (fridgeType.equalsIgnoreCase("crips")) {
			return new Crisps(getCrispsType(posInFridge), 1.20);
		} else if (fridgeType.equalsIgnoreCase("soft drinks")) {
			return new SoftDrinks(getSoftDrinksType(posInFridge), 1.20);
		} else

			return null;

	}

	private String getChocolateType(int posInFridge) {	
			if(posInFridge>=0 && posInFridge<6) return "MM";
			if(posInFridge>=6 && posInFridge<12) return "Lacta";
			if(posInFridge>=12 && posInFridge<18) return "Mars";
			if(posInFridge>=18 && posInFridge<24) return "Teasers";
			if(posInFridge>=24 && posInFridge<30) return "Kinder Bueno";
			return null;
	}

	private String getCrispsType(int posInFridge) {	
				if(posInFridge>=0 && posInFridge<6) return "Tayto";
				if(posInFridge>=6 && posInFridge<12) return "Doritos";
				if(posInFridge>=12 && posInFridge<18) return "Tags";
				if(posInFridge>=18 && posInFridge<24) return "Lays";
				if(posInFridge>=24 && posInFridge<30) return "Walkers";
				return null;
	}
	private String getSoftDrinksType(int posInFridge) {
		if(posInFridge>=0 && posInFridge<6) return "Coke";
		if(posInFridge>=6 && posInFridge<12) return "Sprite";
		if(posInFridge>=12 && posInFridge<18) return "Fanta";
		if(posInFridge>=18 && posInFridge<24) return "Dr Peppers";
		if(posInFridge>=24 && posInFridge<30) return "Pepsi";
		return null;


	}

}
