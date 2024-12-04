package com.codvary.dsa.algo.sorting;

import com.codvary.dsa.algo.Sortable;

public class BubbleSort implements Sortable{
	
	private int[] arr;
	
	public BubbleSort(int[] arr) {
		this.arr = arr;
		for(int i = 0; i < this.arr.length - 1; i++) {
			System.out.print("["+this.arr[i]+"]");
		}
		System.out.println();
	}

	@Override
	public void print() {
		for(int i = 0; i < this.arr.length - 1; i++) {
			System.out.print("["+this.arr[i]+"]");
		}
		System.out.println();
	}

	@Override
	public void sort() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(this.arr[j] > this.arr[j + 1]) {
					int temp = this.arr[j + 1];
					this.arr[j + 1] = this.arr[j];
					this.arr[j]= temp;
				}
			}
		}
	}

}
