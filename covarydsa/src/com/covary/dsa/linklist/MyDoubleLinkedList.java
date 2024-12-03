package com.covary.dsa.linklist;

import com.covary.dsa.linklist.DoubleLinkList.DoubleLinkedListImpl;

public class MyDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedListImpl();
		list.display();
		list.addNode(70, 0);
		list.addNode(50, 0);
		list.addNode(10, 0);
		list.display();
		list.displayReverse();
		list.addNode(20, 1);
		list.addNode(30, 2);
		list.addNode(60, 4);
		list.display();
		list.displayReverse();
		list.search(50);
		list.search(150);
		list.removeNode(0);
		list.removeNode(3);
		list.removeNode(15);
		list.display();
		list.displayReverse();
		list.removeNode(2);
		list.removeNode(0);
		list.removeNode(10);
		list.display();
		list.displayReverse();
	}

}
