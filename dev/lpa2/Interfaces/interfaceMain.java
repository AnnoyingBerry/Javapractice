package Javapractice.dev.lpa2.Interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

enum FlightStages implements Trackable{
	
	GROUNDED,LAUNCH,CRUISE,DATA_COLLECTION;

	@Override
	public void track() {
		if(this!= GROUNDED){
			System.out.println("Monitoring " + this);
		}
	}

	public FlightStages getNextStage(){

		// store all values in the enum in to this array
		FlightStages[] allStages = values();
		// return an element from the array
		// except 4 mod 4 = 0 // gives you first stage
		System.out.println((ordinal()+1) % allStages.length);
		return allStages[(ordinal()+1) % allStages.length];
	}

}

record DragonFly(String name,String type) implements FlightEnhabled{

	@Override
	public void takeoff() {
		
	}

	@Override
	public void land() {
		
	}

	@Override
	public void fly() {
		
	}
	
}

class Satellite implements OrbitEarth{

	FlightStages stage = FlightStages.GROUNDED;

	public void achieveOrbit(){
		transition("Orbit is achieved");
	}

	@Override
	public void takeoff() {
		transition("Taking Off");
	}

	@Override
	public void land() {
		transition("Landing");
	}

	@Override
	public void fly() {
		achieveOrbit();
		transition("Data Collection whole Orbiting");
	}

	public void transition(String description){
		System.out.println(description);
		stage = transition(stage);
		stage.track();
	}

}

interface OrbitEarth extends FlightEnhabled{
	void achieveOrbit();

	private static void log(String description){
		var today = new java.util.Date();
		System.out.println(today + ": " + description);
	}

	private void logStage(FlightStages stage,String description){
		description = stage + ": " + description;
		log(description);
	}

	@Override
	default FlightStages transition(FlightStages stage) {
		FlightStages nexStage = FlightEnhabled.super.transition(stage);
		logStage(stage, "Begining Transition to " + nexStage);
		return nexStage;
	}

}

interface FlightEnhabled {
/*
	// both methods 'public','abstract' are reduntdant, not necessary to declare
	public abstract void takeoff(); // it compliles
	abstract void land(); // it compliles

	// preferred declaration,public and abstract are implied
	void fly(); // it compliles
*/

	// not really instant fields
	// they are public, static and final
	// its okay to put those keywords in, but its pointless
	double MILES_TO_KM = 1.60934; // constants
	double KM_TO_MILES = 0.621371; // constants
	void takeoff();
	void land();
	void fly();

	/* 
		default methods
			- A concrete method
			- It prevents all classes that implements this method to break down
			- we do not need to override this method in all classes unlike abstract methods
			- Classes have a choice to implement this method when they are ready
	*/
	default FlightStages transition(FlightStages stage){

		// //it is common to write a print like this 
		// // to tell the developer that this method is not implemented
		// System.out.println("transition not implemented on "
		// // this.getclass() 'this' can be removed because it is implicit in non-static methods
		// // including default method in interface
		// 			+ getClass().getName());
		// return null;

		FlightStages nextStage = stage.getNextStage();
		System.out.println("Transitioning from " + stage + " to "+ nextStage);
		return nextStage;
	}

}

interface Trackable{
	/* 
		void track(){}
		// this will have compile error
		// because it is assume that this method is public and abstract
		// hence it cannot have method body
	*/
	void track();

}


abstract class Animal{
	public abstract void move();
}

class Bird extends Animal implements FlightEnhabled,Trackable{

	@Override
	public void move() {
		System.out.println("Flaps wings");
	}

	@Override
	public void track() {
		System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
	}

	@Override
	public void takeoff() {
		System.out.println(getClass().getSimpleName() + " is taking off");
	}

	@Override
	public void land() {
		System.out.println(getClass().getSimpleName() + " it is landing");
	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName() + " it is flying");
	}

}

class jet implements FlightEnhabled,Trackable{

	@Override
	public void track() {
		System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
	}

	@Override
	public void takeoff() {
		System.out.println(getClass().getSimpleName() + " is taking off");
	}

	@Override
	public void land() {
		System.out.println(getClass().getSimpleName() + " it is landing");
	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName() + " it is flying");
	}

	@Override
	public FlightStages transition(FlightStages stage) {
		System.out.println(getClass().getSimpleName() + " transitioning");

		// jet class does not have a superclass,
		// implements interface is not a class/part of a class,
		// or an object that is created as a class
		// therefore 'FlightEnhabled is needed'
		return FlightEnhabled.super.transition(stage);
	}

}

class truck implements Trackable{

	@Override
	public void track() {
		System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
	}

}


public class interfaceMain {
	public static void main(String[] args) {
		// usual initalizing an instance
		// Bird is also an Animal,FlightEnable and Trackable
		Bird bird = new Bird();

		// can be refered by other 3 types
		Animal animal = bird;
		System.out.println(animal.getClass().getName());
		FlightEnhabled flier= bird;
		System.out.println(flier.getClass().getName());
		Trackable tracked = bird;
		System.out.println(tracked.getClass().getName());

		
		animal.move();
		// Both interfaces does not have move() in them
		// the compliler only care about the declared type
		// flier.move(); // it wont compile
		// tracked.move(); // it wont compile


		// flier.takeoff();
		// flier.fly();
		// tracked.track();
		// flier.land();

		inFlight(flier);
		inFlight(new jet());

		// works because it is using the trackable interface
		Trackable truck = new truck();
		
		truck.track();

		double kmTraveled = 100;
		double milesTraveled = kmTraveled * FlightEnhabled.KM_TO_MILES;

		System.out.printf("The truck traveled %.2f km or %.2f miles%n",
							kmTraveled,milesTraveled);

		
		LinkedList<FlightEnhabled> fliers = new LinkedList<>();
		fliers.add(bird);

		List<FlightEnhabled> betterFliers = new LinkedList<>();
		betterFliers.add(bird);

		triggerFliers(fliers);
		flyFliers(fliers);
		landFliers(fliers);

		triggerFliers(betterFliers);
		flyFliers(betterFliers);
		landFliers(betterFliers);

		// OrbitEarth.log("Testing " + new Satellite());

		Orbit(new Satellite());


	}
	private static void Orbit(OrbitEarth flier) {
		flier.takeoff();
		flier.fly();
		flier.land();
	}

	private static void inFlight(FlightEnhabled flier) {
		flier.takeoff();
		flier.transition(FlightStages.LAUNCH);
		flier.fly();
		if(flier instanceof Trackable tracked){
			tracked.track();
		}

		flier.land();
	}

	private static void triggerFliers(List<FlightEnhabled> fliers) {

		for (var flier : fliers) {
			flier.takeoff();
		}
		
	}

	private static void flyFliers(List<FlightEnhabled> fliers) {

		for (var flier : fliers) {
			flier.fly();
		}
		
	}

	private static void landFliers(List<FlightEnhabled> fliers) {

		for (var flier : fliers) {
			flier.land();
		}
		
	}
}
