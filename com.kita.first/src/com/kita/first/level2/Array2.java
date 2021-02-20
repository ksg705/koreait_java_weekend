package com.kita.first.level2;

import java.util.Arrays;

public class Array2 {
	public static void main(String args) {
		// {1, 2, 3, 4, 5}
		// { {1, 2}, {1, 3}, {2, 3} }
		
		int[][] arr = new int[3][2];
		// { {0, 0}, {0, 0}, {0, 0} }
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[2][0] = 2;
		
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[0].length; z++) {
				arr[i][z] = 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
