package activities;

public class Bicycle implements BicycleParts,BicycleOperations{
	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears,int currentSpeed) {
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	
	public void applyBreak(int decreament) {
//		currentSpeed = currentSpeed-decreament;
		currentSpeed-=decreament;
		System.out.println("Current Speed after applying the break is : "+ currentSpeed);
	}
	
	public void speedUp(int increament) {
//		currentSpeed = currentSpeed+increament;
		currentSpeed+=increament;
		System.out.println("Current speed after speed up is :"+ currentSpeed);
	}
	
	public String bicycleDesc() {
		return ("no of gears are "+ gears + "\n Speed of bicycle is " + currentSpeed);
	}

}
