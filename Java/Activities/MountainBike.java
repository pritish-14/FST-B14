package activities;

public class MountainBike extends Bicycle{
	
	public int seatHight;

	public MountainBike(int gears, int currentSpeed,int startHeight) {
		super(gears, currentSpeed);
		seatHight = startHeight;
	}
	
	public void setHeight(int newValue) {
		seatHight = newValue;
	}
	
	public String bicycleDesc() {
		return (super.bicycleDesc()+ "\n seat height is "+ seatHight);
	}

}
