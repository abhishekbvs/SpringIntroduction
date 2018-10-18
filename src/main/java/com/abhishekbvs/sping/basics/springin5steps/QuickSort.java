package com.abhishekbvs.sping.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm {
	public int[] sort(int[] num) {
		//logic
		return num;
	}
}
