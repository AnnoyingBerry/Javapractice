package Javapractice.dev.lpa4.domain;

import java.util.Comparator;

public class Employee {

	public static class EmployeeCompartor<T extends Employee> 
		implements Comparator<Employee> {
		
		private String sortType;

		
		public EmployeeCompartor() {
			this("name");
		}


		public EmployeeCompartor(String sortType) {
			this.sortType = sortType;
		}


		@Override
		public int compare(Employee o1, Employee o2) {
			// does not work because there is not getter, and its private attribute
			//return o1.yearStarted -o2.yearStarted;

			if(sortType.equalsIgnoreCase("yearStarted")){
				return o1.yearStarted-o2.yearStarted;
			}
			return o1.getName() .compareTo(o2.getName());
		}	
	}
	private int employeeid;
	private String name;
	private int yearStarted;

	public Employee(){

	}

	public Employee(int employeeid, String name, int yearStarted) {
		this.employeeid = employeeid;
		this.name = name;
		this.yearStarted = yearStarted;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "%d %-8s %d".formatted(employeeid,name,yearStarted);
	}

	
}
