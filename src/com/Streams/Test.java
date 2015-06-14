package com.Streams;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Integer[] arr = { 6, 3, 4, 9, 12, 7 };
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		System.out.println(list.stream().filter(value -> value % 2 != 0)
				.reduce(0, (x, y) -> x + y));
		
		

	}

}
