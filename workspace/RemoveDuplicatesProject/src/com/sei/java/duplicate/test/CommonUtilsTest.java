package com.sei.java.duplicate.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.sei.java.duplicate.utils.CommonUtils;

public class CommonUtilsTest extends CommonUtils {

	@Test
	public void removeDuplicatesTest() {
		
		int[] randomIntegers = { 1,3,4,5,34,34,232,12,11,2,3,4,5 };
		
		int [] uniqueIntegers = CommonUtils.removeDuplicates(randomIntegers);
		
		assertFalse(uniqueIntegers.length>randomIntegers.length);
		
		assertTrue (uniqueIntegers.length==9);
			
	}
	
	@Test
	public void removeDuplicatesListTest() {
		
		int[] randomIntegers = { 1,3,4,5,34,34,232,12,11,2,3,4,5 };
		
		int [] uniqueIntegers = CommonUtils.removeDuplicatesList(randomIntegers);
		
		assertFalse(uniqueIntegers.length>randomIntegers.length);
		
		assertTrue (uniqueIntegers.length==9);
			
	}
	
	@Test
	public void removeDuplicatesSetTest() {
		
		int[] randomIntegers = { 1,3,4,5,34,34,232,12,11,2,3,4,5 };
		
		int [] uniqueIntegers = CommonUtils.removeDuplicatesSet(randomIntegers);
		
		assertFalse(uniqueIntegers.length>randomIntegers.length);
		
		assertTrue (uniqueIntegers.length==9);
			
	}
	
	@Test
	public void toIntTest() {
		
		ArrayList<Integer> randomIntegers = new ArrayList<Integer>();
		
		randomIntegers.add(1);
		randomIntegers.add(3);
		randomIntegers.add(4);
		randomIntegers.add(5);
		randomIntegers.add(34);
		randomIntegers.add(34);
		randomIntegers.add(232);
		randomIntegers.add(12);
		randomIntegers.add(11);
		randomIntegers.add(2);
		randomIntegers.add(3);
		randomIntegers.add(4);
		randomIntegers.add(5);
				
		int [] uniqueIntegers = CommonUtils.toInt(randomIntegers);
		
				
		assertTrue (uniqueIntegers.length==randomIntegers.size());
			
	}
	
	

}
