package com.codvary.dsa.algo;

import com.codvary.dsa.algo.sorting.BubbleSort;
import com.codvary.dsa.algo.sorting.InsertionSort;
import com.codvary.dsa.algo.sorting.SelectionSort;

public class MySorter {

	public static Sortable getInstance(int[] arr, String sorter) {
		switch (sorter) {
		case "bb": {
			return new BubbleSort(arr);
		}
		case "ss": {
			return new SelectionSort(arr);
		}
		case "is": {
			return new InsertionSort(arr);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + sorter);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 6, 2, 7, 9, 0, 4, 5, 8 };
		Sortable sortable = MySorter.getInstance(arr, "is");
		sortable.sort();
		sortable.print();
	}

}
