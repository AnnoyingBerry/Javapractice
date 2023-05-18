package Javapractice.dev.lpa3.GenericClassChallenge;

import java.util.ArrayList;
import java.util.List;

// anything taht is related to Mappable can use this class
public class Layer<T extends Mappable> {

	private List<T> layerElements;

	public Layer(T[] layerElements) {
		this.layerElements = new ArrayList<T>(List.of(layerElements));
	}

	public void addElements(T... elements){
		layerElements.addAll(List.of(elements));
	}

	public void renderLayer(){
		for (T element : layerElements){
			element.render();
		}
	}

	
}
