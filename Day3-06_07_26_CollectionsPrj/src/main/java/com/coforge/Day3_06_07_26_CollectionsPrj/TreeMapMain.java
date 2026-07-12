package com.coforge.Day3_06_07_26_CollectionsPrj;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {

        TreeMap<Integer, Product> productMap = new TreeMap<>();

        productMap.put(101, new Product(101, "Laptop", 65000.00, 15));
        productMap.put(102, new Product(102, "Mouse", 799.00, 120));
        productMap.put(109, new Product(103, "Keyboard", 1499.00, 80));
        productMap.put(104, new Product(104, "Monitor", 12500.00, 25));
        productMap.put(100, new Product(105, "Printer", 9500.00, 18));
        productMap.put(106, new Product(106, "Speaker", 2999.00, 40));
        productMap.put(107, new Product(107, "Webcam", 2199.00, 35));
        productMap.put(111, new Product(108, "SSD 1TB", 5999.00, 50));
        productMap.put(119, new Product(109, "Power Bank", 1799.00, 70));
        productMap.put(103, new Product(110, "USB Hub", 999.00, 90));

        // Display all entries
        System.out.println("---- Entry Set ----");
        for (Entry<Integer, Product> entry : productMap.entrySet()) {
            System.out.println(entry);
        }

        // Keys
        System.out.println("\n---- Keys ----");
        Set<Integer> keys = productMap.keySet();
        System.out.println(keys);

        // Values
        System.out.println("\n---- Values ----");
        Collection<Product> values = productMap.values();
        for (Product p : values) {
            System.out.println(p);
        }

        // Get value
        System.out.println("\nGet key 104: " + productMap.get(104));

        // Contains
        System.out.println("Contains key 100: " + productMap.containsKey(100));
        System.out.println("Contains value Laptop: " +
                productMap.containsValue(new Product(101, "Laptop", 65000.00, 15)));

        // First & Last Entry
        System.out.println("\nFirst Entry: " + productMap.firstEntry());
        System.out.println("Last Entry: " + productMap.lastEntry());

        // First & Last Key
        System.out.println("First Key: " + productMap.firstKey());
        System.out.println("Last Key: " + productMap.lastKey());

        // Higher, Lower, Ceiling, Floor
        System.out.println("\nCeiling Key (105): " + productMap.ceilingKey(105));
        System.out.println("Floor Key (105): " + productMap.floorKey(105));
        System.out.println("Higher Key (105): " + productMap.higherKey(105));
        System.out.println("Lower Key (105): " + productMap.lowerKey(105));

        // Descending order keys
        System.out.println("\n---- Descending Keys ----");
        Set<Integer> descKeys = productMap.descendingKeySet();
        for (Integer k : descKeys) {
            System.out.println(k);
        }

        // SubMap (range)
        System.out.println("\n---- SubMap (102 to 107) ----");
        Map<Integer, Product> subMap = productMap.subMap(102, true, 107, true);
        for (Entry<Integer, Product> e : subMap.entrySet()) {
            System.out.println(e);
        }

        // HeadMap
        System.out.println("\n---- HeadMap (<105) ----");
        Map<Integer, Product> headMap = productMap.headMap(105);
        System.out.println(headMap);

        // TailMap
        System.out.println("\n---- TailMap (>=105) ----");
        Map<Integer, Product> tailMap = productMap.tailMap(105);
        System.out.println(tailMap);

        // Remove
        productMap.remove(100);
        System.out.println("\nAfter removing key 100:");
        System.out.println(productMap);

        // Replace
        productMap.replace(101, new Product(101, "Gaming Laptop", 85000.00, 10));
        System.out.println("\nAfter replacing key 101:");
        System.out.println(productMap);

        // Clear
        // productMap.clear();
        // System.out.println("After clear: " + productMap);

        // Size
        System.out.println("\nSize of map: " + productMap.size());

        // Check empty
        System.out.println("Is empty: " + productMap.isEmpty());
    }
}