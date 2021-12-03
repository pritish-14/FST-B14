package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		plane.onboard("abc");
		plane.onboard("def");
		plane.onboard("xyz");
		
		System.out.println("Plane took of at " + plane.takeOff());
		System.out.println("Passangers on the plane is" + plane.getPassangers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Plane landed at " + plane.lastTimeLanded());
		System.out.println("Passangers on the plane after landing " + plane.getPassangers());

	}

}
