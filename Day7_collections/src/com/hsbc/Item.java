package com.hsbc;

public class Item {
	private int itemId;
	private String name;
	private double ratings;
	private int price;
	private static int index = 1;
	
	
	public Item(String name, double ratings, int price) {
		super();
		this.itemId = index++;;
		this.setName(name);
		this.ratings = ratings;
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public double getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", ratings=" + ratings + ", price=" + price + "]";
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + price;
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (price != other.price)
			return false;
		return true;
	}
}
