package com.kita.first.level2;

public class ArrayCopy {
	public static void main(String[] args) {
		int [] arr1 = {1, 2, 3, 4}; // arr1[0] == 1
		int [] arr2 = arr1;
		// {0, 2, 3, 4}
		arr2[0] = 0;
		
		System.out.println(arr1[0]);
		
		int[] arr3 = new int[arr1.length];
		// {0, 0, 0, 0}
		
 		// arr3[0] = arr1[0];
		// arr3[1] = arr1[1];
		// arr3[2] = arr1[2];
		// arr3[3] = arr1[3];
	
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		}

}
