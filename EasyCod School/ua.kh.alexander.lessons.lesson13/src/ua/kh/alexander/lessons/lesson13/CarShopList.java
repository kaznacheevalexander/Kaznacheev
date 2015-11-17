package ua.kh.alexander.lessons.lesson13;

import java.util.ArrayList;
import java.util.List;

public class CarShopList {
	private List<Car> shop;

	public CarShopList() {
		shop = new ArrayList<Car>();
	}

	public void add(Car shop) {
		((List<Car>) shop).add(shop);
	}

	public void remove(Car shop) {
		((List<Car>) shop).remove(shop);
	}

	public void remove(int index) {
		shop.remove(index);
	}

}
