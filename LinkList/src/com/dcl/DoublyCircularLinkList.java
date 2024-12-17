package com.dcl;

import java.util.Scanner;		

public class DoublyCircularLinkList {
	DCLNode head;
	Scanner scan = new Scanner(System.in);

	void insertAtFirst(int data) {
		DCLNode newNode = new DCLNode();
		newNode.data = data;
		if (head == null) {
			head = newNode;
			newNode.next = head;
			newNode.prev = head;
		} else {
			head.prev.next = newNode;
			newNode.prev = head.prev;
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	void insertAtEnd(int data) {
		DCLNode newNode = new DCLNode();
		newNode.data = data;
		head.prev.next = newNode;
		newNode.prev = head.prev;
		newNode.next = head;
		head.prev = newNode;
	}

	void insertAtMiddle(int data) {
		DCLNode newNode = new DCLNode();
		newNode.data = data;
		DCLNode temp = head;
		System.out.println("Enter the index");
		int index = scan.nextInt();
		for (int i = 0; i < index - 1 && temp.next != head; i++) {
			temp = temp.next;
		}
		newNode.prev = temp;
		newNode.next = temp.next;
		temp.next.prev = newNode;
		temp.next = newNode;
	}

	void deleteAtFirst() {
		if (head == null) {
			System.out.println("List is empty");
		}else {
			head.prev.next = head.next;
			head = head.next;
			head.prev = head.prev.prev;
		}
	}
	
	void deleteAtLast () {
		if (head == null) {
			System.out.println("List is empty");
		}else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}
	
	void deleteAtMiddle() {
		if (head == null) {
			System.out.println("List is empty");
		}else {
			DCLNode temp = head;
			System.out.println("Enter the index:");
			int index = scan.nextInt();
			for(int i=0; i<index-1 && temp.next != head; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	void display() {
		DCLNode temp = head;
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		do {
			System.out.println(temp.data);
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}

}
