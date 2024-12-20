package com.covary.dsa.linklist.doublecircularlinklist;

import com.covary.dsa.linklist.DoubleLinkedList;
import com.covary.dsa.linklist.Node;

public class DoubleCircularLinkedList implements DoubleLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public DoubleCircularLinkedList() {
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
			while (iNode.getNext() != this.head) {
				System.out.print("[" + iNode.getData() + "] ->");
				iNode = iNode.getNext();
			}
		}
		System.out.println();
	}
	
	@Override
	public void displayReverse() {
		if (this.head == null) {
			System.out.print("Empty List : Display Reverse");
		} else {
			Node iNode = this.tail;
			while (iNode.getPrev() != this.tail) {
				System.out.print("[" + iNode.getData() + "] ->");
				iNode = iNode.getPrev();
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
			nNode.setNext(this.head);
			this.head.setPrev(nNode);
		} else {
			if (location == 0) {
				nNode.setNext(this.head);
				this.head.setPrev(nNode);
				this.head = nNode;
				this.head.setPrev(this.tail);
				this.tail.setNext(this.head);
			} else if (location >= this.length) {
				nNode.setNext(this.head);
				this.head.setPrev(nNode);
				this.tail.setNext(nNode);
				nNode.setPrev(this.tail);
				this.tail = nNode;
			} else {
				Node iNode = this.head;
				for(int i = 0; i < location - 1; i++) {
					iNode = iNode.getNext();
				}
				Node nxNode = iNode.getNext();
				nNode.setNext(nxNode);
				nxNode.setPrev(nNode);
				iNode.setNext(nNode);
				nNode.setPrev(iNode);
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
					this.head.setPrev(this.tail);
					this.tail.setNext(this.head);
				}
			} else if (location >= this.length - 1) {
				if (this.head == this.tail) {
					this.head = null;
					this.tail = null;
				} else {
					this.tail = this.tail.getPrev();
					this.tail.setNext(this.head);
					this.head.setPrev(this.tail);
				}
			} else {
				Node iNode = this.head;
				for(int i = 0; i < location - 1; i++) {
					iNode = iNode.getNext();
				}
				Node nxNode = iNode.getNext();
				iNode.setNext(nxNode.getNext());
				nxNode.getNext().setPrev(iNode);
			}
		}
		this.length -= 1;
	}

	@Override
	public boolean search(int data) {
		if (this.head == null) {
			System.out.println("Empty List : Search");
		} else {
			Node iNode = this.head;
			while (iNode.getNext() != this.head) {
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
