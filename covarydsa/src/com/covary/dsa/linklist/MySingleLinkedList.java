package com.covary.dsa.linklist;

import com.covary.dsa.linklist.SingleCircularLinkList.SingleCircularLinkedListImpl;
import com.covary.dsa.linklist.SingleLinkList.SingleLinkedListImpl;

public class MySingleLinkedList {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleCircularLinkedListImpl();
		list.display();
		list.addNode(70, 0);
		list.addNode(50, 0);
		list.addNode(10, 0);
		list.addNode(20, 1);
		list.addNode(30, 2);
		list.addNode(60, 4);
		list.display();
		list.search(50);
		list.search(150);
		list.removeNode(0);
		list.removeNode(3);
		list.removeNode(15);
		list.removeNode(2);
		list.removeNode(0);
		list.removeNode(10);
		list.display();
	}

}
