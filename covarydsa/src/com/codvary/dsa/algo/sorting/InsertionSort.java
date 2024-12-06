package com.codvary.dsa.algo.sorting;

import com.codvary.dsa.algo.Sortable;

public class InsertionSort implements Sortable {
	
	private int arr[];
	
	public InsertionSort(int[] arr) {
		this.arr = arr;
		print();
	}

	@Override
	public void print() {
		for(int i = 0; i < this.arr.length; i++) {
			System.out.print("["+this.arr[i]+"]");
		}
		System.out.println();
	}

	@Override
	public void sort() {
		for(int i = 1; i < this.arr.length; i++) {
			int k = i;
			int val = this.arr[i];
			while(k > 0 && val < this.arr[k - 1]) {
				this.arr[k] = this.arr[k - 1];
				k--;
			}
			this.arr[k] = val;
		}
	}

}
