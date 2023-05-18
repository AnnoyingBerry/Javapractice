package Javapractice.dev.lpa2.Interfaces.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

enum Geomerty{
	LINE,POINT,POLYGON;
}
enum Color{
	BLACK,BLUE,GREEN,ORANGE,RED;
}

enum PointMarkers{
	CIRCLE,PUSH_PIN,STAR,SQUARE,TRIANGLE,DIAMOND;
}

enum LineMarkers{
	DASHED,DOTTED,SOLID;
}

enum UsageType{
	BUSINESS,ENTERTAINMENT,GOVERNMENT,RESIDENTIAL,SPORTS;
}

enum UtilityType{
	ELECTRICAL,FIBER_OPTIC,GAS,WATER;
}

interface Mappable{
	String JSON_PROPERTY = """ 
		"Properties":{%s} """;

	static void mapIt(Mappable mappable){
		System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
	};
	
	//abstract metods
	String getLabel();
	String getMarker();
	Geomerty getShape();

	default String toJSON(){
		return """
				"type": "%s","label": "%s", "marker": "%s" """
				.formatted(getShape(),getLabel(),getMarker());
				
	}

}

class Building implements Mappable{
	private String name;
	private UsageType usage;

	public Building(String name, UsageType usage) {
		this.name = name;
		this.usage = usage;
	}

	@Override
	public String getLabel() {
		return name + " (" + usage + ")";
	}

	@Override
	public String getMarker() {
		return switch (usage) {
			case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.TRIANGLE;
			case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
			case RESIDENTIAL -> Color.BLUE + " " + PointMarkers.SQUARE;
			case SPORTS -> Color.ORANGE + " " + PointMarkers.PUSH_PIN;
			default -> Color.BLACK + " " + PointMarkers.CIRCLE;
		};
	}

	@Override
	public Geomerty getShape() {
		return Geomerty.POINT;
	}

	@Override
	public String toJSON() {
		
		return Mappable.super.toJSON() + """
				, "name": "%s", "Usage": "%s" """
					.formatted(name,usage);
	}

}

class UtilityLine implements Mappable{
	private String name;
	private UtilityType type;

	public UtilityLine(String name, UtilityType type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String getLabel() {
		return name + " (" + type + ")";
	}

	@Override
	public String getMarker() {
		return switch (type) {
			case ELECTRICAL -> Color.RED + " " + LineMarkers.DASHED;
			case FIBER_OPTIC -> Color.GREEN+ " " + LineMarkers.DOTTED;
			case GAS -> Color.ORANGE + " " + LineMarkers.SOLID;
			case WATER -> Color.BLUE + " " + LineMarkers.SOLID;
			default -> Color.BLACK + " " + LineMarkers.SOLID;
		};
	}

	@Override
	public Geomerty getShape() {
		return Geomerty.LINE;
	}

	@Override
	public String toJSON() {
		return Mappable.super.toJSON() + """
				, "name": "%s", "Usage": "%s" """
					.formatted(name,type);
	}

	

	
}


public class InterfaceChallenge {
	public static void main(String[] args) {
		List<Mappable> mappables = new ArrayList<>();

		mappables.add(new Building("Sydeny Town Hall",UsageType.GOVERNMENT));
		mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
		mappables.add(new Building("Stadium Australia", UsageType.SPORTS));
		
		mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
		mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));
		for(var m: mappables){
			Mappable.mapIt(m);
		}

		

		

	}
}
