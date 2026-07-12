package com.coforge.Day3_06_07_26_CollectionsPrj;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Collection;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1,"apple");
		map.put(32, "orange");
		map.put(5,"banana");
		map.put(65, "watermelon");//no insertion order
		System.out.println(map);
		
		map.put(5,"pineapple");
		System.out.println(map);
		map.put(7, "orange");
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.get(7));
		
		System.out.println(map.containsKey(65));
		System.out.println(map.containsValue("orange"));
		System.out.println(map.getOrDefault(66, "no fruit"));
		System.out.println(map);
		map.put(66, "no fruit");
		System.out.println(map);
		map.replace(66, "guva");
		System.out.println(map);
		map.put(78, null);
		map.put(2,null);
		System.out.println(map);
		map.put(null, null);
		System.out.println(map);
		map.put(null, "aaaaa");
		System.out.println(map);
		System.out.println(map.get(null));
		
		Set<Entry<Integer,String>> entries=map.entrySet();
		System.out.println(entries.size());
		Iterator<Entry<Integer,String>> itr=entries.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
			
		
		// HashMap operations
		
		System.out.println("---- HashMap Operations ----");
		
		// size
		System.out.println("Size: " + map.size());
		
		// isEmpty
		System.out.println("Is Empty? " + map.isEmpty());
		
		// remove by key
		map.remove(32);
		System.out.println("After remove key 32: " + map);
		
		// remove key-value pair
		map.remove(5, "pineapple");
		System.out.println("After remove key-value (5,pineapple): " + map);
		
		// putIfAbsent
		map.putIfAbsent(1, "grapes");
		map.putIfAbsent(100, "mango");
		System.out.println("After putIfAbsent: " + map);
		
		// replace
		map.replace(1, "APPLE");
		System.out.println("After replace: " + map);
		
		// replace with condition
		map.replace(7, "orange", "ORANGE");
		System.out.println("After conditional replace: " + map);
		
		// forEach
		System.out.println("Using forEach:");
		map.forEach((k,v) -> System.out.println(k + " -> " + v));
		
		// clear (using copy so original data not lost)
		HashMap<Integer,String> tempMap = new HashMap<Integer,String>(map);
		tempMap.clear();
		System.out.println("After clear: " + tempMap);
		
		
		// LinkedHashMap operations
		
		System.out.println("---- LinkedHashMap Operations ----");
		
		LinkedHashMap<Integer,String> lmap = new LinkedHashMap<Integer,String>();
		
		lmap.put(1,"apple");
		lmap.put(2,"banana");
		lmap.put(3,"mango");
		lmap.put(4,"grapes");
		
		System.out.println("LinkedHashMap: " + lmap); // insertion order maintained
		
		// put
		lmap.put(2,"pineapple");
		System.out.println("After update: " + lmap);
		
		// get
		System.out.println("Get key 3: " + lmap.get(3));
		
		// contains
		System.out.println("Contains key 4? " + lmap.containsKey(4));
		System.out.println("Contains value mango? " + lmap.containsValue("mango"));
		
		// keySet
		System.out.println("Keys: " + lmap.keySet());
		
		// values
		Collection<String> vals = lmap.values();
		System.out.println("Values: " + vals);
		
		// entrySet iteration
		for(Entry<Integer,String> e : lmap.entrySet()) {
			System.out.println(e);
		}
		
		// remove
		lmap.remove(1);
		System.out.println("After remove: " + lmap);
		
		// size
		System.out.println("Size: " + lmap.size());
		
		// clear
		lmap.clear();
		System.out.println("After clear: " + lmap);
		
	}

}