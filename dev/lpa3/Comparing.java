package Javapractice.dev.lpa3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Comparing {
	public static void main(String[] args) {

		// Comparable for and Int value
		Integer five = 5;
		Integer[] others = {0,5,10,-50,50};

		for (Integer i : others) {
			int val = five.compareTo(i);
			System.out.printf("%d %s %d: ComparedTo = %d%n",five,val == 0 ? "==" : 
				(val<0) ? "<" : ">",i,val);
		}

		//comparable for String value
		String banana = "banana";
		String[] fruit = {"apple", "banana", "pear", "BANANA"};

		for (String s : fruit) {
			int val = banana.compareTo(s);
			System.out.printf("%s %s %s: compareTo = %d%n",banana,
				(val == 0 ? "==" : (val<0) ? "<" : ">"),s,val);
		}

		// arrays are mutable hence, fruit is being manupilated directly
		// therefore the sort method is void
		Arrays.sort(fruit);
		System.out.println(Arrays.toString(fruit));
		//chars are stored in positive integer values in memory
		// we use compareTo method to comapre the values of the integer in the strings
		System.out.println("A:"+(int)'A' + " " + "a:"+(int)'a');
		System.out.println("B:"+(int)'B' + " " + "b:"+(int)'b');
		System.out.println("P:"+(int)'P' + " " + "p:"+(int)'p');

		Student tim = new Student("Tim");
		Student [] students = {new Student("Zach"), new Student("Tim"),
			new Student("Ann")};

		//unable to use this because this class is not part of comparable
		// hence implement it
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));

		// RETUNRS 32 which is the difference bettwen the upper case letter and lowercase letter
		System.out.println("results = " + tim.compareTo(new Student("TIM")));

		Comparator<Student> gpaSorter = new StudentGPAComparator();

		// this sort function will call the comparator<Student> class method internally
		// when sorting the students array
		// https://stackoverflow.com/questions/31587301/how-does-the-sort-method-of-the-collection-class-call-the-comparables-compare
		Arrays.sort(students, gpaSorter.reversed());
		System.out.println(Arrays.toString(students));
		
	}


	

}
class StudentGPAComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
	}
	
}
class Student implements Comparable<Student>{

	private static int Last_ID = 1000;
	private static Random random = new Random();

	String name;
	private int id;
	protected double gpa;


	public Student(String name) {
		this.name = name;
		// no other student will get the same id since we increment it
		id= Last_ID++;
		// set the gpa lower limit and upper limit
		gpa = random.nextDouble(1.0,4.0);
	}

	@Override
	public String toString() {
		return "%d - %s (%.2f)".formatted(id,name,gpa);
	}

	@Override
	public int compareTo(Student o) {
		return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
	}
	
	// Type Erasure error
	// @Override
	// public int compareTo(Object o) {
	// 	bad way to code compareTO method
	// 	// raw version of using it
	// 	Student other = (Student) o;
	// 	return name.compareTo(other.name);
	// }
}
