package Javapractice.dev.lpa3.GenericsExtra;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends Student & QueryItem>{
	private List<T> items;

	public QueryList(List<T> items){
		this.items = items;
	}
	/*
	 	without <T extends QueryItem> aka a generic method, an error will occured with a T 
		bceause the class's type parameter cannot be used for a static method
		the Generic class's type parameter only has meaning for an instance, for an instance method
		At, class level, it is unknown. because when the generic class is loaded in the memory,
		it is not loaded with any type parameter, hence you cant use it in a static method

		the <T extends QueryItem> "T" here in this method means that it is completely different type
		from the class itself

	 */
	public static <S extends QueryItem> List<S> getMatches(List<S> items, String field,String value){
		List<S> matches = new ArrayList<>();
		for (var item : items) {
			if(item.matchFieldValue(field, value)){
				matches.add(item);
			}
		}
		return matches;
	}

	public List<T> getMatches(String field,String value){
		List<T> matches = new ArrayList<>();
		for (var item : items) {
			if(item.matchFieldValue(field, value)){
				matches.add(item);
			}
		}
		return matches;
	}
}
