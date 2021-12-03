package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private int maxPassengers;
	private List<String> passengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Plane(int maxPassangers) {
		this.maxPassengers=maxPassangers;
		this.passengers=new ArrayList<>();
		
	}
	
	public void onboard(String passangers) {
		this.passengers.add(passangers);
	}
	
	public Date takeOff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}
	
	public void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	
	public Date lastTimeLanded() {
		return lastTimeLanded;
	}
	
	public List<String> getPassangers() {
		return this.passengers;
	}

}
