package com.abhishekbvs.sping.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	//sorting of array
	//search the element in the array
	//return the result
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int BinarySearch(int[] numbers, int numberToSearchFor) {
			
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//bubbleSort
		return 0;
	}
}
