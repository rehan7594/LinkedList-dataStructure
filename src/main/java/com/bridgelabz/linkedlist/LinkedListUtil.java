package com.bridgelabz.linkedlist;

public class LinkedListUtil {
	public static  void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.push(70);
		linkedlist.push(30);
		linkedlist.push(56);

		linkedlist.printList();
		System.out.println("\n");

		LinkedList linkedlist1 = new LinkedList();
		linkedlist1.append(70);
		linkedlist1.append(30);
		linkedlist1.append(56);

		linkedlist1.printList();

	}
}