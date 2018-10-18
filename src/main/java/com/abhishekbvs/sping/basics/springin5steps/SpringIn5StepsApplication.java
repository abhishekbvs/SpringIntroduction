package com.abhishekbvs.sping.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
//		BinarySearchImpl  binarySearch1= new BinarySearchImpl(new QuickSort());
//		int result1 = binarySearch1.BinarySearch(new int[] {1,2,3},3);
//		System.out.println(result1);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.BinarySearch(new int[] {1,2,3},3);
		System.out.println(result);
	}
}
