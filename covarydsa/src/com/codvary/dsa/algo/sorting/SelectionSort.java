package com.codvary.dsa.algo.sorting;

import com.codvary.dsa.algo.Sortable;

public class SelectionSort implements Sortable {

	private int[] arr;

	public SelectionSort(int[] arr) {
		this.arr = arr;
		for (int i = 0; i < this.arr.length - 1; i++) {
			System.out.print("[" + this.arr[i] + "]");
		}
		System.out.println();
	}

	@Override
	public void print() {
		for (int i = 0; i < this.arr.length - 1; i++) {
			System.out.print("[" + this.arr[i] + "]");
		}
		System.out.println();
	}

	@Override
	public void sort() {
		for(int i = 0; i <  this.arr.length; i++) {
			int iMin = this.arr[i];
			for(int j = i; j < this.arr.length; j++) {
				if(this.arr[iMin] > this.arr[j]) {
					iMin = j;
				}
			}
			int temp = this.arr[iMin];
			this.arr[iMin] = this.arr[i];
			this.arr[i] = temp;
		}
	}
}
