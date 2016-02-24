package com.listtypeservices;

/**
 * This class provide the list of restaurants in the specific location. 
 */
import java.util.ArrayList;

import com.models.Restaurant;

public class RestaurantList {
	private ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();

	public ArrayList<Restaurant> getRestaurentList() {
		return restaurantList;
	}

	public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
		this.restaurantList = restaurantList;
	}

	/**
	 * This method adds the restaurant to restaurant list.
	 * 
	 * @param restaurent
	 */
	public void addRestaurant(Restaurant restaurant) {
		restaurantList.add(restaurant);
	}

	@Override
	public String toString() {
		return "List Of Restaurants in this Location: " + restaurantList;
	}
}
