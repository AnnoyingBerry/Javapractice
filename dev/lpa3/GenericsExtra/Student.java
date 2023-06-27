package Javapractice.dev.lpa3.GenericsExtra;

import java.util.Random;

public class Student implements QueryItem {
	private String name;
	private String course;
	private int yearStarted;

	protected static Random random = new Random();

	// its private static to prevent instances/objects to have this data
	private static String [] firstNames = {"Ann","Bill","Cathy","John","Tim"};
	private static String [] courses = {"C++","Java", "Python"};

	public Student(){
		// 65 is the value of capital 'A' and '91' is the value of Capital 'Z'
		// basically from 'A' to 'Z' in caps
		int lastNameIndex = random.nextInt(65,91);

		// randomly pick a name in the array 0-4
		name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
		// randomly pick the course 0-2
		course = courses[random.nextInt(3)];
		//randomly pick a enrolled year 2019-2022
		yearStarted = random.nextInt(2018,2023);

	}

	@Override
	public String toString() {
		// left justified with 15 width
		return "%-15s %-15s %d".formatted(name,course,yearStarted);
	}

	public int getYearStarted() {
		return yearStarted;
	}

	@Override
	public boolean matchFieldValue(String fieldname, String value) {
		String fName = fieldname.toUpperCase();
		return switch (fName) {
			case "NAME" -> name.equalsIgnoreCase(value); // return boolean
			case "COURSE" -> course.equalsIgnoreCase(value);
			case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
			default -> false;
		};
	}
}
