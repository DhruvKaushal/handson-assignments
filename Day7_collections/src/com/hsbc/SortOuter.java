package com.hsbc;

import java.util.Comparator;
//All sorting in descending order
public class SortOuter{
	public class SortDataByName implements Comparator<Item>{
		public int compare(Item i1, Item i2) {
			// TODO Auto-generated method stub
			return i2.getName().compareTo(i1.getName()); // 5 - 4 = +ve, 4 - 5 = -ve
		}
	}
	public class SortDataById implements Comparator<Item>{
		public int compare(Item i1, Item i2) {
			// TODO Auto-generated method stub
			return i2.getItemId() - i1.getItemId();  // 5 - 4 = +ve, 4 - 5 = -ve
		}
	}
	public class SortDataByPrice implements Comparator<Item>{
		public int compare(Item i1, Item i2) {
			// TODO Auto-generated method stub
			return (int) (i2.getPrice() - i1.getPrice());  // 5 - 4 = +ve, 4 - 5 = -ve
		}
	}
	public class SortDataByRating implements Comparator<Item>{
		public int compare(Item i1, Item i2) {
			// TODO Auto-generated method stub
			return (int) (i2.getRatings() - i1.getRatings());  // 5 - 4 = +ve, 4 - 5 = -ve
		}
	}
}
