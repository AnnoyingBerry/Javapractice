package Javapractice.dev.lpa4.domain;

import java.util.ArrayList;
import java.util.List;

public class StaticNestedMain {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>(List.of(
		new Employee(10001, "Ralph", 2015),
		new Employee(10005, "Carole", 2021), 
		new Employee(10022, "Jane", 2013), 
		new Employee(13151, "Laura", 2020), 
		new Employee(10050, "Jim", 2018)));

		// var comparator = new EmployeeCompartor<>();
		// employees.sort(comparator);

		employees.sort(new Employee.EmployeeCompartor<>("yearStarted")
			.reversed());
		for (Employee e : employees) {
			System.out.println(e);
		}

		System.out.println("Store Members");

		List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
			new StoreEmployee(10015,"Meg",2019,"Target"),
			new StoreEmployee(10515, "Joe", 2021, "Walmart"),
			new StoreEmployee(10105, "Tom", 2020, "Macys"),
			new StoreEmployee(10215, "Marty", 2018, "Walmart"),
			new StoreEmployee(10322, "Bud", 2016, "Target")
		));
		
		/*  
			access the employee compartor class through the storeEmployee class 
			hence static nested classes are inherited by subclasses
			var comparator = new StoreEmployee.EmployeeCompartor<>();
			
			Does not work because an inner class requires an instance
			of the outer class to be used, to instantiate an inner class
			right here we only create an instance of storeEmployee class and calling
			the store comparator class hence it doesnt work 

			//var comparator = new StoreEmployee.StoreCompartor<>();
		*/

		/*
			var generic Employee = new StoreEmployee();
			var comparator = new genericEmployee.StoreComparator<>();

			does not work yet because we are still creating an object of storeEmployee
			and not creating an object for storeComparator class

			working:

			var genericEmployee = new StoreEmployee();
			var comparator = genericEmployee.new StoreComparator<>();
			
			or

			StoreEmployee genericEmployee = new StoreEmployee();
			StoreEmployee.StoreComparator<StoreEmployee> comparator = genericEmployee.new StoreComparator<>();
		 
		 */

		 
		// the "new " with a space is not calling a method but it will
		// create a new instance of an inner class
		var comparator = new StoreEmployee().new StoreComparator<>();
		storeEmployees.sort(comparator);

		for (StoreEmployee e : storeEmployees) {
			System.out.println(e);
		}


	}
}
