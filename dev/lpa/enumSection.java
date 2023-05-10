package Javapractice.dev.lpa;

import java.util.Random;

public class enumSection {
	public static void main(String[] args) {
		DayofTheWeek weekDay = DayofTheWeek.TUES;
		System.out.println(weekDay);

		for (int i = 0; i < 10; i++) {
			weekDay = getRandomDay();

			// System.out.printf("Name is %s, Ordinal Value = %d%n",
			// 	weekDay.name(), weekDay.ordinal() );
			
			// if(weekDay == DayofTheWeek.FRI){
			// 	System.out.println("Found a Friday");
			// }

			switchDayOfTheWeek(weekDay);
		}
		
		for (Topping topping : Topping.values()) {
			System.out.println(topping.name() + ": " + topping.getPrice());
		}
	}

	public static DayofTheWeek getRandomDay() {
		int randomInteger = new Random().nextInt(7);
		// returns an array of enum constant values
		var allDays = DayofTheWeek.values();

		return allDays[randomInteger];
	}

	public static void switchDayOfTheWeek(DayofTheWeek weekDay) {
		int weekDayInteger = weekDay.ordinal() + 1;

		switch (weekDay) {
			case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
			case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
			default -> System.out.println(weekDay.name().charAt(0) +
				weekDay.name().substring(1).toLowerCase() +
				"day is Day " + weekDayInteger);
		}
	}
}
/* 
	**** Enumeration
		- Wiki: A complete ordered listing of 'all the items' in a collection
		- Java: A special data type that contains predefined constants.
				- Constant: A variable whose value cannot be changed once assigned.
			
		- it is like an array with known elements, unchangable.
		- Each element can be referred to by constant name

		*** Example
			public enum DayOfTheWeek{
				SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
			}

			- like the keyword class, but instead 'enum'
		
		*** Enum type
			- a special type of class
			- used to declare a limited set of constants
			- there might be a natural order to the listing like days in a week.
			- e.g Months in the year, Compass directions, Sizes


*/
