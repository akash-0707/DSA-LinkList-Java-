package com.scl;

import java.util.Scanner;

public class SinglyCircular {
	SCLNode head;

	Scanner scan = new Scanner(System.in);

	void insertFirstNode(int data) {
		SCLNode newNode = new SCLNode(); // memory allocation
		newNode.data = data; // data assigned
		if (head == null) { // checking whether the list is empty or not
			head = newNode;
			newNode.next = head; // point back to itself to make list circular
		} else { // if list is not empty

			SCLNode temp = head; // head assigned to temporary node
			while (temp.next != head) { // checks whether the head is null or not
				temp = temp.next; // if head is not null then it wil move forward
			}
			temp.next = newNode; // temporary variables next part is assigned by newnode
			newNode.next = head; // the newnode that we created is pointing to head
			head = newNode; // head is assigned by newnode
		}
	}

	void insertLastNode(int data) {

		SCLNode newNode = new SCLNode();
		newNode.data = data;
		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			SCLNode temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
		}
	}

	void insertMiddleNode(int data) {
		SCLNode newNode = new SCLNode();
		newNode.data = data;
		SCLNode temp = head;
		if (head == null) {
			head = newNode;
			newNode.next = head;
		}
		System.out.println("Enter the index:");
		int index = scan.nextInt();
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	void deleteFirstNode() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		} else {
			SCLNode temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			head = head.next;
			temp.next = head;
		}
	}

	void deleteLastNode() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			SCLNode temp = head;
			while (temp.next.next != head) {
				temp = temp.next;
			}
			temp.next = head;
		}
	}

	void deleteMiddleNode() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			SCLNode temp = head;
			System.out.println("Enter the index");
			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	void reverse() {
		SCLNode temp = head;
		SCLNode prev = null;
		SCLNode current = head;
		if (head == null) {
			System.out.println("List is empty");
		}
		do {
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		} while (current != head);
		head.next = prev;
		head = prev;
	}

	

	void display() {

		SCLNode temp = head;
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		do {
			System.out.println(temp.data + " ");
			temp = temp.next;
		} while (temp != head);

		System.out.println();
	}

}
