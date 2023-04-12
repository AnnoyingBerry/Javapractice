package Javapractice.OOP.Inheritance.Inheritance_p2;

public class main2 {
	
	
	public static void main(String[] args) {

		Employee tim = new Employee("Tim","11/09/1985","01/01/2020");

		System.out.println(tim);
		System.out.println("Tim's Age = " + tim.getAge());
		System.out.println("Tim pay = " + tim.collectPay());
		System.out.println();

		SalariedEmployee joe = new SalariedEmployee("joe", "13/09/1986", "01.01.2011",35000);

		System.out.println(joe);
		System.out.println("Joe's Age = " + joe.getAge());
		System.out.println("Joe pay = $" + joe.collectPay());
		joe.retire();
		System.out.println("Joe pay = $" + joe.collectPay());
		System.out.println();

		HourlyEmployee mary = new HourlyEmployee("Mary", "13/10/1998", "01.01.2021", 15);

		System.out.println(mary);
		System.out.println("Mary's Pay = " + mary.collectPay());
		System.out.println("Mary's extra pay = " + mary.getDoublePay());
		System.out.println();
		

	}
}
