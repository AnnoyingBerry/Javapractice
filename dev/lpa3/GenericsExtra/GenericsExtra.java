package Javapractice.dev.lpa3.GenericsExtra;

import java.util.ArrayList;
import java.util.List;
record Employee(String name) implements QueryItem{

	@Override
	public boolean matchFieldValue(String fieldname, String value) {
		return false;
	}	
	
}
public class GenericsExtra {
	public static void main(String[] args) {
		int studentCount = 10;

		List<Student> students = new ArrayList<>();

		for (int i = 0; i < studentCount; i++) {

			// invoke default constructor that get random student data
			students.add(new Student());
		}
		// this confirms that we can add any type of student to the list
		students.add(new LPAStudent());
		//printList(students);
		printMoreList(students);

		List<LPAStudent> lapstudents = new ArrayList<>();

		for (int i = 0; i < studentCount; i++) {

			// invoke default constructor that get random student data
			lapstudents.add(new LPAStudent());
		}
		//printList(lapstudents);
		printMoreList(lapstudents);

		testList(new ArrayList<String>(List.of("Able","Barry","Charlie")));
		testList(new ArrayList<Integer>(List.of(1,2,3)));
		
		// in this case, java has enough infomation since it is passed to the constructor
		// to do an assignment
		var querylist = new QueryList<>(lapstudents);
		var a = new ArrayList<>(lapstudents);
		var matches = querylist.getMatches("Course", "Python");
		printMoreList(matches);	

		// we can specify type argument for a generic method that is a static method on a class
		/*var students2021 = QueryList.<Student>getMatches(new ArrayList<>(), "YearStarted", "2021");
		printMoreList(students2021);
		*/
		
		// we can specify type argument for a generic method that is a static method on a class
		var students2021 = QueryList.getMatches(students, "YearStarted", "2021");
		printMoreList(students2021);
	
	// Error not within its bound, which means employee is not a subtype of student
	// so it is not a valid type in querylist
	// QueryList<Employee> employeeList = new QueryList<>();

	}
	// syntax of a generic method
	//we can set the upperbound to only student and its subtypes

	public static void printMoreList(List<? extends Student> students) {

		// the compiler do not have enough infomation to do the type checking rule
		// it cant safely say if the object is a list of student or LPAStudent or a mix
		// Student last = students.get(students.size()-1);
		// students.set(0, last);

		for (var student: students) {
			System.out.println(student);

		}
		System.out.println();
	}

	// public static void testList(List<String> list ) {
	// 	for (var element : list) {
	// 		System.out.println("String: " + element.toUpperCase());
	// 	}
	// }

	// public static void testList(List<Integer> list ) {
	// 	for (var element : list) {
	// 		System.out.println("Integer: " + element.floatValue());
	// 	}
	// }

	public static void testList(List<?> list) {
		for (var element : list) {
			if(element instanceof String s){
				System.out.println("String: " + s.toUpperCase());
			}else if(element instanceof Integer i){
				System.out.println("Integer: " + i.floatValue());
			}
		}
	}

	// public static <T extends Student> void printList(List<T> students) {
	// 	for (var student: students) {
	// 		System.out.println(student.getYearStarted() + ": " + student);

	// 	}
	// 	System.out.println();
	// }
}
