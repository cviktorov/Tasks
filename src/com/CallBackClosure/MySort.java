package com.CallBackClosure;

public class MySort {

	private Sortable sortable;

	public MySort(Sortable sortable) {
		this.sortable = sortable;
	}

	public void Sort(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (sortable.greater(arr[i], arr[j])) {

					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;

				}
			}

		}
	}
}
