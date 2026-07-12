package com.coforge.Day3_06_07_26_CollectionsPrj;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		
		Vector<Integer> vector=new Vector<Integer>();
//		vector.add(56);
//		vector.add(67);
//		vector.add(78);
		for(int i=1;i<=10;i++)
		vector.add(i);
		System.out.println(vector);
		System.out.println(vector.capacity());
		
		vector.add(11);
		System.out.println(vector.capacity());//vector capacity gets doubled
		//ArrayList capacity is going to be increased by half of its original capacity when
		//initial capacity gets exhausted

		Enumeration<Integer> enumeration= vector.elements();
		while(enumeration.hasMoreElements())
			System.out.println(enumeration.nextElement());//concurrent modifications 
		//are not possible on enumeration like iterator
		
		
		
		
		// Vector operations
		
		System.out.println("---- Vector Operations ----");
		
		// add element at specific index
		vector.add(0, 100);
		System.out.println("After adding at index 0: " + vector);
		
		// get element
		System.out.println("Element at index 2: " + vector.get(2));
		
		// set (replace element)
		vector.set(2, 999);
		System.out.println("After set: " + vector);
		
		// remove by index
		vector.remove(2);
		System.out.println("After remove index 2: " + vector);
		
		// remove element
		vector.remove(Integer.valueOf(5));
		System.out.println("After removing element 5: " + vector);
		
		// contains
		System.out.println("Contains 10? " + vector.contains(10));
		
		// size
		System.out.println("Size: " + vector.size());
		
		// isEmpty
		System.out.println("Is Empty? " + vector.isEmpty());
		
		// firstElement & lastElement
		System.out.println("First Element: " + vector.firstElement());
		System.out.println("Last Element: " + vector.lastElement());
		
		// indexOf & lastIndexOf
		vector.add(10);
		System.out.println("Index of 10: " + vector.indexOf(10));
		System.out.println("Last Index of 10: " + vector.lastIndexOf(10));
		
		// subList
		List<Integer> sub = vector.subList(1, 5);
		System.out.println("SubList (1 to 5): " + sub);
		
		// iteration using for-each
		System.out.println("Iterating:");
		for(Integer i : vector) {
			System.out.println(i);
		}
		
		// clear
		vector.clear();
		System.out.println("After clear: " + vector);
		
	}

}