package Javapractice.dev.lpa4.domain;

import java.util.Comparator;

public class StoreEmployee extends Employee{

	private String store;
	

	public StoreEmployee() {		
	}



	public StoreEmployee(int employeeid, String name, int yearStarted, String store) {
		super(employeeid, name, yearStarted);
		this.store = store;
	}

	


	@Override
	public String toString() {
		return "%-8s%s".formatted(store,super.toString());
	}


	public class StoreComparator<T extends StoreEmployee>
		implements Comparator<StoreEmployee>{


		@Override
		public int compare(StoreEmployee o1, StoreEmployee o2) {
			int result = o1.store.compareTo(o2.store);
			// if employees work at the same store
			if(result == 0){
				// if yes, return the year the employee started
				// and compare both stores
				return new Employee.EmployeeCompartor<>(
					"yearStarted").compare(o1, o2);
			}
			return result;
		}
			
		}
}
