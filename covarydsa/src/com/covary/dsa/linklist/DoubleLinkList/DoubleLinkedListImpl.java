package com.covary.dsa.linklist.DoubleLinkList;

import com.covary.dsa.linklist.DoubleLinkedList;
import com.covary.dsa.linklist.Node;

public class DoubleLinkedListImpl implements DoubleLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public DoubleLinkedListImpl() {
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
				this.head.setPrev(nNode);
				this.head = nNode;
				this.head.setPrev(null);
			} else if (location >= this.length) {
				this.tail.setNext(nNode);
				nNode.setPrev(this.tail);
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
					this.head.setPrev(null);
				}
			} else if (location >= this.length - 1) {
				if (this.head == this.tail) {
					this.head = null;
					this.tail = null;
				} else {
					this.tail = this.tail.getPrev();
					this.tail.setNext(null);
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

	@Override
	public void displayReverse() {
		if (this.head == null) {
			System.out.print("Empty List : Display");
		} else {
			Node iNode = this.tail;
			while (iNode != null) {
				if (iNode.getPrev() == null) {
					System.out.print("[" + iNode.getData() + "]");
				} else {
					System.out.print("[" + iNode.getData() + "] -> ");
				}
				iNode = iNode.getPrev();
			}
		}
		System.out.println();
		
	}

}
