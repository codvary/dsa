package com.covary.dsa.linklist.SingleLinkList;

import com.covary.dsa.linklist.Node;
import com.covary.dsa.linklist.SingleLinkedList;

public class SingleLinkedListImpl implements SingleLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public SingleLinkedListImpl() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	@Override
	public void display() {
		if (this.head == null) {
			System.out.print("Empty List : Display");
		} else {
			Node iNode = this.head;
			while (iNode != null) {
				if (iNode.getNext() == null) {
					System.out.print("[" + iNode.getData() + "]");
				} else {
					System.out.print("[" + iNode.getData() + "] -> ");
				}
				iNode = iNode.getNext();
			}
		}
		System.out.println();
	}

	@Override
	public void addNode(int data, int location) {
		Node nNode = new Node(data);
		if (this.head == null) {
			this.head = nNode;
			this.tail = nNode;
		} else {
			if (location == 0) {
				nNode.setNext(this.head);
				this.head = nNode;
			} else if (location >= this.length) {
				this.tail.setNext(nNode);
				this.tail = nNode;
			} else {
				Node iNode = this.head;
				for (int i = 0; i < location - 1; i++) {
					iNode = iNode.getNext();
				}
				Node nxNode = iNode.getNext();
				nNode.setNext(nxNode);
				iNode.setNext(nNode);
			}
		}
		this.length += 1;
	}

	@Override
	public void removeNode(int location) {
		if (this.head == null) {
			System.out.println("Empty List : Remove");
		} else {
			if (location == 0) {
				if (this.head == this.tail) {
					this.head = null;
					this.tail = null;
				} else {
					this.head = this.head.getNext();
				}
			} else if (location >= this.length - 1) {
				if (this.head == this.tail) {
					this.head = null;
					this.tail = null;
				} else {
					Node iNode = this.head;
					while (iNode.getNext() != this.tail) {
						iNode = iNode.getNext();
					}
					iNode.setNext(null);
					this.tail = iNode;
				}
			} else {
				Node iNode = this.head;
				for (int i = 0; i < location - 1; i++) {
					iNode = iNode.getNext();
				}
				Node nxNode = iNode.getNext();
				iNode.setNext(nxNode.getNext());
			}
			this.length -= 1;
		}
	}

	@Override
	public boolean search(int data) {
		if (this.head == null) {
			System.out.println("Empty List : Search");
		} else {
			Node iNode = this.head;
			while (iNode != null) {
				if (iNode.getData() == data) {
					System.out.println("Found : [" + iNode.getData() + "]");
					return true;
				}
				iNode = iNode.getNext();
			}
			System.out.println("Not Found : [" + data + "]");
		}
		return false;
	}

}
