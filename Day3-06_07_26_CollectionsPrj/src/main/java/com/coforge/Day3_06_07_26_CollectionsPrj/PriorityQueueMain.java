package com.coforge.Day3_06_07_26_CollectionsPrj;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueMain {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(87);
		pq.add(76);
		pq.add(34);
		pq.add(25);
		pq.add(88);
		pq.add(9);
		pq.add(34);
		pq.add(25);
		
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);
		System.out.println(pq.offer(10));
		System.out.println(pq);
		System.out.println(pq.poll());
		
//		System.out.println(pq.poll());
//		System.out.println(pq.poll());
//		System.out.println(pq);

	
		
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(89);
		ad.add(67);
		ad.addFirst(45);//void
		ad.addLast(34);
		
		ad.offerFirst(67);//boolean
		
		
		// Priority queue operations
		
		System.out.println("---- PriorityQueue Operations ----");
		
		// peek (head element)
		System.out.println("Peek: " + pq.peek());
		
		// element (throws exception if empty)
		System.out.println("Element: " + pq.element());
		
		// remove (removes head)
		System.out.println("Remove: " + pq.remove());
		System.out.println("After remove: " + pq);
		
		// contains
		System.out.println("Contains 34? " + pq.contains(34));
		
		// size
		System.out.println("Size: " + pq.size());
		
		// isEmpty
		System.out.println("Is Empty? " + pq.isEmpty());
		
		// iteration
		System.out.println("Iterating PQ:");
		for(Integer i : pq) {
			System.out.println(i);
		}
		
		// clear (using copy)
		PriorityQueue<Integer> tempPQ = new PriorityQueue<Integer>(pq);
		tempPQ.clear();
		System.out.println("After clear: " + tempPQ);
		
		
		// Arraydeque operations
		
		System.out.println("---- ArrayDeque Operations ----");
		
		System.out.println("Deque: " + ad);
		
		// offerLast
		ad.offerLast(100);
		System.out.println("After offerLast: " + ad);
		
		// peek
		System.out.println("Peek First: " + ad.peekFirst());
		System.out.println("Peek Last: " + ad.peekLast());
		
		// poll
		System.out.println("Poll First: " + ad.pollFirst());
		System.out.println("After pollFirst: " + ad);
		
		System.out.println("Poll Last: " + ad.pollLast());
		System.out.println("After pollLast: " + ad);
		
		// remove
		ad.removeFirst();
		System.out.println("After removeFirst: " + ad);
		
		ad.add(200);
		ad.add(300);
		
		ad.removeLast();
		System.out.println("After removeLast: " + ad);
		
		// contains
		System.out.println("Contains 200? " + ad.contains(200));
		
		// size
		System.out.println("Size: " + ad.size());
		
		// isEmpty
		System.out.println("Is Empty? " + ad.isEmpty());
		
		// iteration
		System.out.println("Iterating Deque:");
		Iterator<Integer> itr = ad.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// clear
		ad.clear();
		System.out.println("After clear: " + ad);

	}

}