package com.coforge.Day3_06_07_26_CollectionsPrj;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductMain {
	
	public static void main(String[] args) {
//		TreeSet<Product> productTree = new TreeSet<Product>();
//
//		productTree.add(new Product(101, "Laptop", 55000.00, 10));
//
//		productTree.add(new Product(102, "Mouse", 799.00, 50));
//
//		productTree.add(new Product(103, "Keyboard", 1499.00, 30));
//
//		productTree.add(new Product(104, "Monitor", 12500.00, 15));
//
//		productTree.add(new Product(105, "Printer", 8500.00, 8));
//
//		productTree.add(new Product(106, "Webcam", 2200.00, 20));
//
//		productTree.add(new Product(107, "Headphones", 3200.00, 25));
//
//		productTree.add(new Product(108, "Speaker", 4500.00, 12));
//
//		productTree.add(new Product(109, "Pendrive", 650.00, 100));
//
//		productTree.add(new Product(110, "SSD", 7200.00, 18));
//		
//		for(Product p:productTree)
//		System.out.println(p);
		
		
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(67);
		tree.add(34);
		tree.add(90);
		tree.add(31);
		tree.add(89);
		tree.add(11);
		tree.add(56);
		tree.add(99);
		//System.out.println(tree);
		
//		Set<Integer>  set = tree.descendingSet();
//		System.out.println(set);
//		
//		
//		Iterator<Integer> itr=tree.descendingIterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		
		System.out.println(tree.ceiling(28));//will return nearest large element of the given element
		System.out.println(tree.floor(28));//nearest small element
		System.out.println(tree.floor(10));//no further min, null will be returned
		System.out.println(tree.ceiling(31));
		System.out.println(tree.floor(31));
		System.out.println("--------------------");
		System.out.println(tree.lower(28));
		System.out.println(tree.higher(28));
		System.out.println(tree.lower(31));
		System.out.println(tree.higher(31));
		
		
		//TreeSet operations
		
		System.out.println("---- TreeSet Operations ----");
		
		// first & last
		System.out.println("First: " + tree.first());
		System.out.println("Last: " + tree.last());
		
		// size
		System.out.println("Size: " + tree.size());
		
		// contains
		System.out.println("Contains 56? " + tree.contains(56));
		
		// isEmpty
		System.out.println("Is Empty? " + tree.isEmpty());
		
		// pollFirst & pollLast
		System.out.println("Poll First: " + tree.pollFirst());
		System.out.println("After pollFirst: " + tree);
		
		System.out.println("Poll Last: " + tree.pollLast());
		System.out.println("After pollLast: " + tree);
		
		// addAll
		TreeSet<Integer> tree2 = new TreeSet<Integer>();
		tree2.add(5);
		tree2.add(15);
		tree2.add(25);
		
		tree.addAll(tree2);
		System.out.println("After addAll: " + tree);
		
		// remove
		tree.remove(25);
		System.out.println("After remove 25: " + tree);
		
		// headSet (elements less than given value)
		Set<Integer> head = tree.headSet(50);
		System.out.println("HeadSet (<50): " + head);
		
		// tailSet (elements greater or equal)
		Set<Integer> tail = tree.tailSet(50);
		System.out.println("TailSet (>=50): " + tail);
		
		// subSet
		Set<Integer> sub = tree.subSet(15, 90);
		System.out.println("SubSet (15 to 90): " + sub);
		
		// descendingSet
		Set<Integer> desc = tree.descendingSet();
		System.out.println("Descending Set: " + desc);
		
		// descendingIterator
		System.out.println("Descending Iteration:");
		Iterator<Integer> itr = tree.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		// clear
		TreeSet<Integer> temp = new TreeSet<Integer>(tree);
		temp.clear();
		System.out.println("After clear: " + temp);
		
	}

}