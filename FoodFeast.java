package com.main;

/**
 * This class is main class which launches the Application.
 */
import com.listtypeservices.FoodList;
import com.listtypeservices.RestaurantList;
import com.listtypeservices.SelectionList;
import com.models.Customer;
import com.models.Food;
import com.models.FoodSelection;
import com.models.Location;
import com.models.Order;
import com.models.Response;
import com.models.Restaurant;
import com.models.RestaurantSelection;

public class FoodFeast {
	/**
	 * This is a main method which launches the Application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Customer satish = Customer.get("satish", "9490151355", "hyd");
		Location moosapet = Location.get("moosapet");
		satish.setLocation(moosapet);
		Restaurant kb = Restaurant.get("kb");
		Restaurant nb = Restaurant.get("NB");
		Restaurant rr = Restaurant.get("RR");
		RestaurantList listOfRestaurants = new RestaurantList();
		listOfRestaurants.addRestaurant(kb);
		listOfRestaurants.addRestaurant(nb);
		listOfRestaurants.addRestaurant(rr);
		moosapet.setRestaurantList(listOfRestaurants);
		Food chickenBiryani = Food.get("Chicken Biryani", 200);
		Food muttonBiryani = Food.get("Mutton Biryani", 300);
		FoodList listOfFoods = new FoodList();
		listOfFoods.addFood(muttonBiryani);
		listOfFoods.addFood(chickenBiryani);
		kb.setListOfFoods(listOfFoods);
		System.out.println(moosapet.getRestaurantList());
		System.out.println(kb.getListOfFoods());
		SelectionList selectedFoodAndRestaurant = new SelectionList();
		selectedFoodAndRestaurant.addSelection(rr, muttonBiryani.getFoodType() + ", Quantity:" + 1);
		String responseForOrder=satish.placeOrder(selectedFoodAndRestaurant);
		System.out.println(responseForOrder+"Thank you for Ordering " +satish.getCustomerName()+ " Wait a moment we will confirm your order with restaurant and let you know");
		Order satishOrder = Order.get((int) (Math.ceil(Math.random() * 100)), satish.getCustomerName(),
				satish.getMobileNo());
		satishOrder.setselectionByCustomer(selectedFoodAndRestaurant);
		// System.out.println(satishOrder.getSelectionList());
		satish.setCustomerOrder(satishOrder);
		Response orderStatus = Response.get(satishOrder);
		satishOrder = orderStatus.customerOrderDetails(satish);
		System.out.println(satishOrder);
		String responseForSatishOrder = orderStatus.orderConfirmation(
				satish.getCustomerName() + " Your order has been confirmed we will reach you in an hour");
		System.out.println(responseForSatishOrder);
	}
}
