package com.listtypeservices;

import java.util.*;

import com.models.Restaurant;

public class SelectionList {
	HashMap<Restaurant, String> selectionOfCustomer = new HashMap<Restaurant, String>();

	public void addSelection(Restaurant restaurant, String food) {
		selectionOfCustomer.put(restaurant, food);
	}

	@Override
	public String toString() {
		return "Restaurant Selected By The Customer: " + selectionOfCustomer.keySet()
				+ ", Food and Quantity Selected By The Customer: " + selectionOfCustomer.values();
	}
}
