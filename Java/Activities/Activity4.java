package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int a[] = {9,6,2,10,9,30,5,82};
		sortArray(a);
		System.out.println("Sorted array in asscending order :" );
		System.out.println(Arrays.toString(a));

	}
	
	static void sortArray(int a[]){
		for (int i=1;i<a.length;i++) {
			int key = a[i];
			int j=i-1;
			
			while(j>=0 && key < a[j]) {
				a[j+1] = a[j];
				--j;
			}
			a[j+1]=key;
		}
	}

}
