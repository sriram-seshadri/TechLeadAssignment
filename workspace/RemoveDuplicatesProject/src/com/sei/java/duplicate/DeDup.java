package com.sei.java.duplicate;

import com.sei.java.duplicate.utils.CommonUtils;

public class DeDup {

	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34,
			86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3, 20, 17, 8, 15,
			6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17,
			16, 3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17,
			10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public static void main(String[] args) {

		DeDup dupObject = new DeDup();

		// Method 1

		int[] uniqueIntegers = CommonUtils
				.removeDuplicatesList(dupObject.randomIntegers);

		System.out.println("Method 1 - Using List");

		CommonUtils.print(uniqueIntegers);

		// Method 2

		uniqueIntegers = CommonUtils
				.removeDuplicatesSet(dupObject.randomIntegers);

		System.out
				.println("Method 2 - Using Set - Both Random Numbers and Unique Numbers");

		CommonUtils.print(dupObject.randomIntegers); // Random Integers retained
														// in original order

		CommonUtils.print(uniqueIntegers);

		// Method 3

		dupObject.randomIntegers = CommonUtils
				.removeDuplicates(dupObject.randomIntegers);

		System.out.println("Method 3 - Using Arrays");

		CommonUtils.print(dupObject.randomIntegers);
	}

}
