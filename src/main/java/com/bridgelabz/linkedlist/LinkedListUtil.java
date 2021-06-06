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
		System.out.println("\n");

		LinkedList linkedlist2 = new LinkedList();
		linkedlist2.append(56);
		linkedlist2.append(40);
		linkedlist2.append(70);

		linkedlist2.insertAfter(linkedlist2.head.next, 30);
		linkedlist2.printList();
	}
}