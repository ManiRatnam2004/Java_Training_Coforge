package com.coforge.Day3_06_07_26_CollectionsPrj;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new LinkedList<Employee>();

		employeeList.add(new Employee("Amit", 101, "Hyderabad", "IT", 65000));
		employeeList.add(new Employee("Priya", 102, "Bangalore", "HR", 55000));
		employeeList.add(new Employee("Rahul", 103, "Chennai", "Finance", 70000));
		employeeList.add(new Employee("Amit", 104, "Pune", "IT", 65000));
		employeeList.add(new Employee("Sneha", 105, "Delhi", "Sales", 60000));

		employeeList.add(new Employee("Priya", 106, "Mumbai", "Marketing", 55000));
		employeeList.add(new Employee("Karan", 107, "Hyderabad", "Finance", 85000));
		employeeList.add(new Employee("Meera", 108, "Bangalore", "IT", 92000));
		employeeList.add(new Employee("Rahul", 109, "Pune", "HR", 70000));
		employeeList.add(new Employee("Sneha", 110, "Chennai", "Sales", 60000));

		employeeList.add(new Employee("Rohit", 111, "Delhi", "IT", 98000));
		employeeList.add(new Employee("Divya", 112, "Hyderabad", "Marketing", 61000));
		employeeList.add(new Employee("Karan", 113, "Mumbai", "Finance", 85000));
		employeeList.add(new Employee("Meera", 114, "Bangalore", "HR", 92000));
		employeeList.add(new Employee("Rohit", 115, "Pune", "IT", 98000));

		employeeList.add(new Employee("Divya", 116, "Chennai", "Marketing", 61000));
		employeeList.add(new Employee("Amit", 117, "Hyderabad", "Sales", 65000));
		employeeList.add(new Employee("Priya", 118, "Delhi", "Finance", 55000));
		employeeList.add(new Employee("Rahul", 119, "Mumbai", "IT", 70000));
		employeeList.add(new Employee("Sneha", 120, "Bangalore", "Sales", 60000));
		
		for(Employee emp:employeeList)
			System.out.println(emp);
		
		
//		Collections.sort(employeeList);
//		
//		System.out.println("After sorting.....");
//		
//		for(Employee emp:employeeList)
//			System.out.println(emp);
//		
		
		employeeList.sort(new CityComparator()
				.thenComparing(new DepartmentComparator()
				.thenComparing(new SalaryComparator())));
		System.out.println("After sorting on city then on Dept....................");
		for(Employee emp:employeeList)
			System.out.println(emp);
		
        // ================= Dept → City → Salary =================
        employeeList.sort(new DepartmentComparator()
                .thenComparing(new CityComparator()
                .thenComparing(new SalaryComparator())));
        System.out.println("After sorting on Dept then on City....................");
        for(Employee emp:employeeList)
            System.out.println(emp);


        // ================= EmpID → City → Dept =================
        employeeList.sort(new IdComparator()
                .thenComparing(new CityComparator()
                .thenComparing(new DepartmentComparator())));
        System.out.println("After sorting on EmpID then on City....................");
        for(Employee emp:employeeList)
            System.out.println(emp);


        // ================= Salary → City → Dept =================
        employeeList.sort(new SalaryComparator()
                .thenComparing(new CityComparator()
                .thenComparing(new DepartmentComparator())));
        System.out.println("After sorting on Salary then on City....................");
        for(Employee emp:employeeList)
            System.out.println(emp);


        // ================= Name → City → Dept =================
        employeeList.sort(new NameComparator()
                .thenComparing(new CityComparator()
                .thenComparing(new DepartmentComparator())));
        System.out.println("After sorting on Name then on City....................");
        for(Employee emp:employeeList)
            System.out.println(emp);


        // ================= City → Dept → Salary → EmpID =================
        employeeList.sort(new CityComparator()
                .thenComparing(new DepartmentComparator()
                .thenComparing(new SalaryComparator()
                .thenComparing(new IdComparator()))));
        System.out.println("After sorting on City → Dept → Salary → EmpID....................");
        for(Employee emp:employeeList)
            System.out.println(emp);


        // ================= City → Dept → Salary (Descending) =================
        employeeList.sort(new CityComparator()
                .thenComparing(new DepartmentComparator()
                .thenComparing(new SalaryComparator().reversed())));
        System.out.println("After sorting on City → Dept → Salary (DESC)....................");
        for(Employee emp:employeeList)
            System.out.println(emp);
		

	}

}
