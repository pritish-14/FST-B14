package activities;

public class Activity8 {

	public static void main(String[] args) {
		
		try {
			Activity8.exceptionTest("non-null string");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("Won't execute because Exception is thrown");
		} catch (CustomException e) {
			System.out.println("Inside catch block: " + e.getMessage());
		}

	}
	
	static void exceptionTest(String str) throws CustomException{
		if(str == null) {
			throw new CustomException("String value is null");
		}else {
			System.out.println("String value is " + str);
		}
		
	}

}
