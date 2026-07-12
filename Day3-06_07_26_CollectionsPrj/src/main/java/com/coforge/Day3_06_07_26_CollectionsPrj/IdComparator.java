package com.coforge.Day3_06_07_26_CollectionsPrj;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

@Override
public int compare(Employee o1, Employee o2) {
    return o1.getEid() - o2.getEid(); // ascending order
}


}
