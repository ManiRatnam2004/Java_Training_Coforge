package com.coforge.Day3_06_07_26_CollectionsPrj;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetMain {

	public static void main(String[] args) {
	
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(67);
		hset.add(45);
		hset.add(12);
		hset.add(1);
		hset.add(89);
		hset.add(12);
		hset.add(56);
		hset.add(12);//no insertion order,no duplicates
//		hset.add(null);
//		hset.add(null);//multiple null values not possible
		
		
		System.out.println(hset);
		
		
		HashSet<Integer> hset1=new HashSet<Integer>();
		hset1.add(65);
		hset1.add(85);
		hset1.add(13);
		hset1.add(1);
		hset1.add(89);
		hset1.add(121);
		hset1.add(56);
		hset1.add(78);
		
		System.out.println(hset1);
		
		hset.retainAll(hset1);//will update hset with common elements
		System.out.println(hset);
		
		Object[] obj= hset.toArray();
		
		for(Object i:obj)
			System.out.println(i);
		
		Integer[] arr=hset.toArray(new Integer[0]);
		
		for(Integer i:arr)
			System.out.println(i);
		
		
		// Hashset operations
		
		System.out.println("---- HashSet Operations ----");
		
		HashSet<Integer> hset2 = new HashSet<Integer>();
		hset2.add(10);
		hset2.add(20);
		hset2.add(30);
		
		// addAll
		hset2.addAll(hset1);
		System.out.println("After addAll: " + hset2);
		
		// remove
		hset2.remove(10);
		System.out.println("After remove: " + hset2);
		
		// contains
		System.out.println("Contains 20? " + hset2.contains(20));
		
		// size
		System.out.println("Size: " + hset2.size());
		
		// isEmpty
		System.out.println("Is Empty? " + hset2.isEmpty());
		
		// removeAll
		hset2.removeAll(hset1);
		System.out.println("After removeAll: " + hset2);
		
		// clear
		hset2.clear();
		System.out.println("After clear: " + hset2);
		
		
		// LinkedHashSet operations
		
		System.out.println("---- LinkedHashSet Operations ----");
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(5);
		lhs.add(15);
		lhs.add(25);
		lhs.add(35);
		lhs.add(15); // duplicate
		
		System.out.println("LinkedHashSet: " + lhs);
		
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		lhs1.add(25);
		lhs1.add(35);
		lhs1.add(45);
		
		// addAll
		lhs.addAll(lhs1);
		System.out.println("After addAll: " + lhs);
		
		// retainAll (intersection)
		lhs.retainAll(lhs1);
		System.out.println("After retainAll: " + lhs);
		
		// remove
		lhs.remove(25);
		System.out.println("After remove: " + lhs);
		
		// contains
		System.out.println("Contains 35? " + lhs.contains(35));
		
		// size
		System.out.println("Size: " + lhs.size());
		
		// iteration
		for(Integer i : lhs) {
			System.out.println(i);
		}
		
		// clear
		lhs.clear();
		System.out.println("After clear: " + lhs);
		
	}

}