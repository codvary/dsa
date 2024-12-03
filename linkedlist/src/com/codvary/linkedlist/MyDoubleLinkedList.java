package com.codvary.linkedlist;

import com.codvary.linkedlist.DCLList.DoubleCircularLinkedListImpl;

public class MyDoubleLinkedList {

	public static void main(String[] args) {

		//DoubleLinkedList list = new DoubleLinkedListImpl();
		DoubleLinkedList list = new DoubleCircularLinkedListImpl();
		list.display();
		list.displayReverse();
		list.addNode(5, 0);
		list.addNode(4, 0);
		list.addNode(3, 0);
		list.addNode(2, 0);
		list.display();
		list.displayReverse();
		list.search(5);
		list.search(15);
		list.removeNode(15);
		list.display();
		list.displayReverse();

	}

}
