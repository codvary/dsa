package com.codvary.linkedlist;

public interface SingleLinkedList {
	
	public void display();
	
	public void addNode(int data, int location);
	
	public void removeNode(int location);
	
	public boolean search(int data);

}
