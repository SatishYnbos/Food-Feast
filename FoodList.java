package com.listtypeservices;

/**
 * This class provides the details of FoodList.
 */
import java.util.ArrayList;

import com.models.Food;

public class FoodList {
	ArrayList<Food> listOfFoods = new ArrayList<Food>();

	public ArrayList<Food> getListOfFoods() {
		return listOfFoods;
	}

	public void setListOfFoods(ArrayList<Food> listOfFoods) {
		this.listOfFoods = listOfFoods;
	}

	/**
	 * This method adds the Food to FoodList.
	 * 
	 * @param foodType
	 */
	public void addFood(Food foodType) {
		listOfFoods.add(foodType);
	}

	@Override
	public String toString() {
		return "List of Foods in this Restaurant: " + listOfFoods;
	}
}
