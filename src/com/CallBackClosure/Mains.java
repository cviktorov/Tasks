package com.CallBackClosure;

import java.util.Arrays;

public class Mains {

	public static void main(String[] args) {
		SortOrder order = new SortOrder();
		
		MySort mysort = new MySort(order.downWard());
		Integer[] arr = {5,2,9,4,8,1,21,13};
		System.out.println(Arrays.asList(arr));
		mysort.Sort(arr);
		System.out.println(Arrays.asList(arr));
	}

}
