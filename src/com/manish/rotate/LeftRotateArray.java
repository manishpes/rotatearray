package com.manish.rotate;

public class LeftRotateArray {

	public int[] leftRotate(int []input, int rotateBy) {
		if(input == null || input.length <= 1) {
			return input;
		}
		int n = input.length;
		for(int k = 0; k < rotateBy; k++) {
			for(int i = n-1; i > 0; i--) {
				int temp = input[i];
				input[i] = input[i-1];
				input[i-1] = temp;
			}
		}
		return input;

	}
}
