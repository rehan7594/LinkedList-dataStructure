package com.bridgelabz.linkedlist;

class LinkedList {
	Node head;

	class Node {

		int data;
		Node next;

		Node(int data){
			this.data = data;
			next =  null;
		}
	}

	public void push (int data) {
		Node newNode=new Node(data);
		newNode.next=head;

		head=newNode;

	}

	public void printList() {
		System.out.print("LinkedList:");
		Node temp=head;

		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head= newNode;
			return;
		}

		Node last= head;
		while(last.next != null) {
			last = last.next;
		}
		last.next=newNode;
	}

	public void insertAfter(Node prevNode, int data) {
		if(prevNode==null) {
			System.out.println("Previous node should not be null");
		}

		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	public boolean isEmpty() {
		return head == null;
	} 

	public int topValue() {
		if(!isEmpty()) 
			return head.data; 
		else
			return 0;
	}

	public void pop() {
		if (head == null) {
			System.out.println("head should not be null");
		}
		head=(head).next;	 	 
	}

}