package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		
		int sum=0;
		int a[] = {10,77,10,54,-11,10};
		System.out.println("Original array is "+ Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			if(a[i]==10) {
				sum=sum+a[i];
			}
		}
		System.out.println("The sum of 10's in array is "+ sum);
		
		if(sum==30) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}