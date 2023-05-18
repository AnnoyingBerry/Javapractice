package Javapractice.dev.lpa3.GenericClassChallenge;

import java.util.Arrays;

public interface Mappable {

	// public by default
	void render();

	static double[] stringToLatLon(String location){
		// takes in a string value of lat and long delimited by ','
		// split it in to a string[]
		var splits = location.split(",");
		double lat = Double.valueOf(splits[0]);
		double lng = Double.valueOf(splits[1]);

		// return a double array object containing lat and long
		return new double[]{lat,lng};
	}
}

// abstract class dont have to override a interface abstract methods
abstract class Point implements Mappable{

	
	private double[] location = new double[2];

	public Point(String location){
		this.location = Mappable.stringToLatLon(location);
	}

	@Override
	public void render() {
		System.out.println("Render " + this + " as POINT (" + location() + ")");
		
	}
	
	private String location(){
		return Arrays.toString(location);
	}


}

abstract class Line implements Mappable{

	// store an array of lan and long
	private double[][] locations;

	// takes in multiple arguments, each represent a Point(lan,long)
	public Line(String... locations){
		//initialise the array with fix length
		this.locations = new double[locations.length][];
		int index = 0;
		// each Point(lan,long) in the array
		for(var l : locations){
			// store the coordnates in each row, from double[]
			this.locations[index++] = Mappable.stringToLatLon(l);
		}
	}

	

	@Override
	public void render() {
		System.out.println("Render " + this + " as LINE (" + locations() + ")");		
	}



	private String locations() {
		return Arrays.deepToString(locations);
	}
}