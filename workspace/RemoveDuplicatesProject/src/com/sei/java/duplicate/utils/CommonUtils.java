package com.sei.java.duplicate.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CommonUtils {

	/**
	 * @param originalArray
	 * @return
	 * 
	 *         Method to remove duplicates using the ArrayList of Collections
	 *         API
	 * 
	 */
	public static int[] removeDuplicatesList(int[] originalArray) {

		ArrayList<Integer> uniqueIntegers = new ArrayList<Integer>();
		for (int i = 0; i < originalArray.length; i++) {
			if (!uniqueIntegers.contains(originalArray[i])) {
				uniqueIntegers.add(originalArray[i]);
			}
		}

		int[] uniqueArray = toInt(uniqueIntegers);

		return uniqueArray;
	}

	/**
	 * @param originalArray
	 * @return
	 * 
	 *         Method to remove duplicates using the Set of Collections API
	 * 
	 */
	public static int[] removeDuplicatesSet(int[] originalArray) {

		Set<Integer> uniqueSet = new HashSet<Integer>();
		for (int pickInteger : originalArray) {
			uniqueSet.add(pickInteger);
		}

		int[] uniqueArray = toInt(uniqueSet);

		return uniqueArray;
	}

	/**
	 * @param originalArray
	 * @return
	 * 
	 *         Method to remove duplicates using the Arrays and List Class of
	 *         Collections API
	 * 
	 */
	public static int[] removeDuplicates(int[] originalArray) {

		// Sorting array of elements

		for (int i = 0; i < originalArray.length; i++) {
			for (int j = i; j < originalArray.length; j++) {
				if (originalArray[i] > originalArray[j]) {
					int temp = originalArray[i];
					originalArray[i] = originalArray[j];
					originalArray[j] = temp;
				}

			}
		}

		int j = 0;
		ArrayList<Integer> uniqueIntegers = new ArrayList<Integer>();
		originalArray[j] = originalArray[0];
		uniqueIntegers.add(originalArray[0]);
		for (int i = 0; i < originalArray.length; i++) {
			if (originalArray[j] != originalArray[i]) {
				j++;
				originalArray[j] = originalArray[i];
				uniqueIntegers.add(originalArray[i]);

			}
		}

		int[] uniqueArray = toInt(uniqueIntegers);

		return uniqueArray;
	}

	/**
	 * @param uniqueIntegers
	 * @return
	 * 
	 *         Method to convert the Integer array to int primitive array
	 * 
	 */
	public static int[] toInt(Collection<Integer> uniqueIntegers) {
		int[] uniqueArray = new int[uniqueIntegers.size()];

		int i = 0;
		for (Integer val : uniqueIntegers)
			uniqueArray[i++] = val;

		return uniqueArray;
	}

	/**
	 * @param uniqueIntegers
	 * 
	 *            Method to print the array elements
	 * 
	 */
	public static void print(int[] uniqueIntegers) {

		for (int i = 0; i < uniqueIntegers.length; i++) {
			System.out.print(uniqueIntegers[i] + "\t");
		}

		System.out.println();

	}

}
