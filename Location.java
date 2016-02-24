package com.models;

/**
 * This class provides the details of Location.
 */
import com.listtypeservices.RestaurantList;

public class Location {
	private String selectArea;
	private RestaurantList restaurantList;

	/**
	 * This constructor provides the values to construct the Location object.
	 * 
	 * @param area
	 */
	public Location(String area) {
		selectArea = area;
	}

	/**
	 * This is a builder method to create Location instances.
	 * 
	 * @param selectArea
	 * @return
	 */
	public static Location get(String selectArea) {
		Location location = new Location(selectArea);
		return location;
	}

	public String getSelectArea() {
		return selectArea;
	}

	public void setSelectArea(String selectArea) {
		this.selectArea = selectArea;
	}

	public RestaurantList getRestaurantList() {
		return restaurantList;
	}

	public void setRestaurantList(RestaurantList restaurantList) {
		this.restaurantList = restaurantList;
	}

	@Override
	public String toString() {
		return "Location [selectArea=" + selectArea + ", restaurantList=" + restaurantList + "]";
	}

}
