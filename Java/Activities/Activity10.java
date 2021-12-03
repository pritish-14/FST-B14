package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Ankush");
		hs.add("Bhagya");
		hs.add("Sushma");
		hs.add("Ashik");
		hs.add("Harish");
		hs.add("Aditya");
		
		System.out.println("The set is : " + hs);
		System.out.println("The size of the hashset is "+ hs.size());
		hs.remove("Harish");
		hs.remove("aditya");
		
		if(hs.contains("Ashik")) {
			System.out.println("The name is in the set");
		}else {
			System.out.println("The name is not in the set");
		}
		
		System.out.println("The final set is : " + hs);

	}

}
