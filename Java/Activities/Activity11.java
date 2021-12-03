package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> colours = new HashMap<Integer, String>();
		colours.put(1, "Black");
		colours.put(2, "Blue");
		colours.put(3, "Red");
		colours.put(4, "White");
		colours.put(5, "Green");
		
		System.out.println("The map is : " + colours);
		colours.remove(4);
		
		if(colours.containsValue("Green")) {
	           System.out.println("Green exists in the Map");
	       } else {
	           System.out.println("Green does not exist in the Map");
	       }
		
		System.out.println("The size of the map is : " + colours.size());

	}

}
