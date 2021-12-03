package activities;

public class Activity12 {

	public static void main(String[] args) {
		Addable var1 = (a,b) -> (a + b);
		Addable var2 = (int a, int b) -> {
			return (a+b);
		};
		
		System.out.println(var1.add(100, 50));
		System.out.println(var2.add(50,25));

	}

}
