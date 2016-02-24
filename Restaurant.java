package com.models;

/**
 * This class provides the details of Restaurant.
 */
import com.listtypeservices.FoodList;

public class Restaurant {
	private String restaurantName;
	private FoodList listOfFoods;

	/**
	 * This constructor provides the values to construct the Restaurant Object.
	 * 
	 * @param rName
	 */
	public Restaurant(String rName) {
		restaurantName = rName;
	}

	/**
	 * This is a builder method to create Restaurant instances.
	 * 
	 * @param restaurantName
	 * @return
	 */
	public static Restaurant get(String restaurantName) {
		Restaurant restaurent = new Restaurant(restaurantName);
		return restaurent;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public FoodList getListOfFoods() {
		return listOfFoods;
	}

	public void setListOfFoods(FoodList listOfFoods) {
		this.listOfFoods = listOfFoods;
	}

	@Override
	public String toString() {
		return restaurantName;
	}

}
