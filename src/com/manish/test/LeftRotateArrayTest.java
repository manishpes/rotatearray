package com.manish.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.manish.rotate.LeftRotateArray;

class LeftRotateArrayTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testLeftRotate() {
		LeftRotateArray lra = new LeftRotateArray();
		int input [] = {1, 2, 3, 4, 5, 6}; 
		int ouput[]  = lra.leftRotate(input, 2);
		for (int i : ouput) {
			System.out.print(i+" ");
		}
		
	}

}
