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
		} else if (fridgeType.equalsIgnoreCase("crisps")) {
			return new Crisps(getCrispsType(posInFridge), 1.20);
		} else if (fridgeType.equalsIgnoreCase("soft drinks")) {
			return new SoftDrinks(getSoftDrinksType(posInFridge), 1.20);
		} else

			return null;

	}

	private String getChocolateType(int posInFridge) {	
			if(posInFridge>=0 && posInFridge<5) return "MM";
			if(posInFridge>=5 && posInFridge<10) return "Lacta";
			if(posInFridge>=10 && posInFridge<15) return "Mars";
			if(posInFridge>=15 && posInFridge<20) return "Teasers";
			if(posInFridge>=20 && posInFridge<25) return "Kinder Bueno";
			return null;
	}

	private String getCrispsType(int posInFridge) {
		if(posInFridge>=0 && posInFridge<5) return "Tayto";
		if(posInFridge>=5 && posInFridge<10) return "Doritos";
		if(posInFridge>=10 && posInFridge<15) return "Tags";
		if(posInFridge>=15 && posInFridge<20) return "Lays";
		if(posInFridge>=20 && posInFridge<25) return "Wakers";
		return null;
		

	}
	private String getSoftDrinksType(int posInFridge) {
		if(posInFridge>=0 && posInFridge<5) return "Coke";
		if(posInFridge>=5 && posInFridge<10) return "Sprite";
		if(posInFridge>=10 && posInFridge<15) return "Fanta";
		if(posInFridge>=15 && posInFridge<20) return "Dr Peppers";
		if(posInFridge>=20 && posInFridge<25) return "Pepsi";
		return null;


	}

}
