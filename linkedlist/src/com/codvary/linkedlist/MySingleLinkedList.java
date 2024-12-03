package com.codvary.linkedlist;

import com.codvary.linkedlist.SCLList.SingleCircularLinkedListImpl;

public class MySingleLinkedList {

	public static void main(String[] args) {

		//SingleLinkedList list = new SingleLinkedListImple();
		SingleLinkedList list = new SingleCircularLinkedListImpl();

		list.display();
		list.addNode(5, 0);
		list.addNode(4, 0);
		list.addNode(3, 0);
		list.addNode(2, 0);
		list.display();
		list.search(5);
		list.search(15);
		list.removeNode(15);
		list.display();

	}

}
