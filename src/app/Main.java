package app;

import java.util.ArrayList;

import fridge.Chocolate;
import fridge.Fridge;

public class Main {

	public static void main(String[] args) {

		Helper helper = new Helper();

//		for (int i = 0; i < 30; i++) {
//			System.out.println("position: " + i + "Type: " + helper.getChocArray()[i].getBrand() + " Price: "
//					+ helper.getChocArray()[i].getPrice());
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 30; i++) {
//			System.out.println("position: " + i + "Type: " + helper.getCrispsArray()[i].getBrand() + " Price: "
//					+ helper.getCrispsArray()[i].getPrice());
//		}
		System.out.println();
		for (int i = 0; i < 30; i++) {
			System.out.println("position: " + i + "Type: " + helper.getASoftDrinksArray()[i].getBrand() + " Price: "
					+ helper.getASoftDrinksArray()[i].getPrice());
		}
//		System.out.println(helper.getElements(0).getBrand() + " " + helper.getElements(0).getPrice());
//
//		for (int i = 0; i < 30; i++) {
//
//			System.out.println("position: " + i + "Type: " + helper.getArrayFridge()[i].getBrand() + " Price: "
//					+ helper.getArrayFridge()[i].getPrice());
//
//		}
		
//		ArrayList[] arrayL = new ArrayList[3];
//		
//		ArrayList<Fridge> list = new ArrayList<Fridge>();
////		System.out.println(list.size());
//		double price = 1.5;
//		for(int i =0; i< 6; i++) {	
//			list.add(new Chocolate("MM", price++));
//		}
//		System.out.println(list.size());
//		list.remove(0);
//		System.out.println(list.size());
//		
//		
//		arrayL[0] = list;
//		
//		System.out.println(arrayL[0].get(0).toString());
//		arrayL[0].remove(0);
//		System.out.println(list.size());
//		System.out.println(arrayL[0].get(0).toString());
//		System.out.println(arrayL[1]);

	}
}