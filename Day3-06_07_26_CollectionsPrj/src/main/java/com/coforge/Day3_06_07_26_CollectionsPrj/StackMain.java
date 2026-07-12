package com.coforge.Day3_06_07_26_CollectionsPrj;

import java.util.Stack;

public class StackMain {
	
	public static void main(String[] args) {
		//stack follows Last in first out -- LIFO
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=1;i<=10;i++)
			//stack.push((int)(Math.round( Math.random()*100)));
			stack.push(i*3);
		System.out.println(stack);
		
		
		//System.out.println(stack.pop());
		System.out.println(stack.search(42));//will not return index, will return a number from top most element starting top most is at 1
		
		
		
		// Stack operations
		
		System.out.println("---- Stack Operations ----");
		
		// peek (top element without removing)
		System.out.println("Peek (top element): " + stack.peek());
		
		// pop (removes top element)
		System.out.println("Pop: " + stack.pop());
		System.out.println("After pop: " + stack);
		
		// push (add element)
		stack.push(999);
		System.out.println("After push: " + stack);
		
		// search
		System.out.println("Search 999: " + stack.search(999));
		
		// contains
		System.out.println("Contains 15? " + stack.contains(15));
		
		// size
		System.out.println("Size: " + stack.size());
		
		// isEmpty
		System.out.println("Is Empty? " + stack.isEmpty());
		
		// iterate using for-each
		System.out.println("Iterating elements:");
		for(Integer i : stack) {
			System.out.println(i);
		}
		
		// get element by index
		System.out.println("Element at index 2: " + stack.get(2));
		
		// set (replace element)
		stack.set(2, 555);
		System.out.println("After set: " + stack);
		
		// remove by index
		stack.remove(2);
		System.out.println("After remove index 2: " + stack);
		
		// clear stack
		stack.clear();
		System.out.println("After clear: " + stack);
		
	}

}