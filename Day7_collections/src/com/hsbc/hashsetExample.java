package com.hsbc;
import java.util.*;

public class hashsetExample {
	public static void main(String[] args) {
		List<Item> set1 = new ArrayList<Item>();
		set1.add(new Item("Sugar", 4.1, 100));
		set1.add(new Item("Rice", 5.2, 200));
		set1.add(new Item("Mills", 8.5, 150));
		set1.add(new Item("Maize", 7.1, 590));
		set1.add(new Item("Pizza", 2.2, 350));
		set1.add(new Item("Pizza", 2.2, 1350));
		System.out.println("Size "+set1.size());
//		for(Item ite: set1) {
//			System.out.println(ite);
//		}
		System.out.println("******************************");
		SortOuter so = new SortOuter();
		//SortOuter.SortDataByName sortId2 = new SortOuter.SortDataByName();
		Collections.sort(set1, so.new SortDataById());
		for(Item ite: set1) {
			System.out.println(ite);
		}
		Collections.sort(set1, so.new SortDataByName());
		System.out.println("******************************");
		for(Item ite: set1) {
			System.out.println(ite);
		}
		Collections.sort(set1, so.new SortDataByPrice());
		System.out.println("******************************");
		for(Item ite: set1) {
			System.out.println(ite);
		}
		Collections.sort(set1, so.new SortDataByRating());
		System.out.println("******************************");
		for(Item ite: set1) {
			System.out.println(ite);
		}
	}
}
