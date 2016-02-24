package com.models;

/**
 * This class provides the details of Food
 * 
 * @author satish
 *
 */
public class Food {
	private String foodType;
	private int foodPrice;

	/**
	 * This constructor provide the values to construct Food object.
	 * 
	 * @param fType
	 * @param fPrice
	 */
	public Food(String fType, int fPrice) {
		foodType = fType;
		foodPrice = fPrice;
	}

	/**
	 * This is builder method to create Food instances.
	 * 
	 * @param foodType
	 * @param foodPrice
	 * @return
	 */
	public static Food get(String foodType, int foodPrice) {
		Food food = new Food(foodType, foodPrice);
		return food;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	@Override
	public String toString() {
		return foodType + " : " + foodPrice;
	}
}
