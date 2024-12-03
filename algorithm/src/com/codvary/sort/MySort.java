package com.codvary.sort;

public class MySort implements Sortable {

	private int[] arr;
	private String method;

	public MySort(int[] arr, String method) {
		this.arr = arr;
		this.method = method;
		print();
	}

	public void bubbleSort() {
		for(int i = 0; i < this.arr.length - 1; i++) {
			for(int j = 0; j < this.arr.length - i - 1; j++) {
				if(this.arr[j] > this.arr[j+1]) {
					int tVar = this.arr[j];
					this.arr[j] = this.arr[j + 1];
					this.arr[j + 1] = tVar;
				}
			}
		}
	}
	
	public void selectionSort() {
		for(int i = 0; i < this.arr.length; i++) {
			int iMin = i;
			for(int j = i + 1; j < this.arr.length; j++) {
				if(this.arr[iMin] > this.arr[j]) {
					iMin = j;
				}
			}
			int tVar = this.arr[iMin];
			this.arr[iMin] = this.arr[i];
			this.arr[i] = tVar;
		}
	}
	
	public void insertionSort() {
		for(int i = 1; i < this.arr.length; i++) {
			int key = this.arr[i];
			int j = i - 1;
			while(j >= 0 && key < this.arr[j]) {
				this.arr[j + 1] = this.arr[j];
				j--;
			}
			this.arr[j + 1] = key;
		}
	}

	@Override
	public void sort() {
		switch (method) {
		case "bs": {
			bubbleSort();
			break;
		}
		case "ss":{
			selectionSort();
			break;
		}
		case "is":{
			insertionSort();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + method);
		}
	}

	@Override
	public void print() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.print("[" + this.arr[i] + "]");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 9, 6, 7, 1, 3, 0, 4, 2, 8 };
		Sortable sorter = new MySort(arr, "is");
		sorter.sort();
		sorter.print();
	}

}
