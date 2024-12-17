package com.igr.sll;

import java.util.Scanner;

public class Singlylinklist {

	SLLNode head;
	Scanner scan = new Scanner(System.in); // taking the scanner class as a input

	void insertLastnode(int data) {
		SLLNode newNode = new SLLNode(); // creating a node in the memory
		newNode.data = data;            // assigning data to that node

		if (head == null) { // checking if the list is empty or not
			head = newNode; // if the list is empty create a node in it
		} else {
			SLLNode temp = head;
			while (temp.next != null) { // moving the loop till till we get the node next part null
				temp = temp.next;

			}
			temp.next = newNode;
		}
	}

	void insertFirstnode(int data) {
		SLLNode newNode = new SLLNode(); // creating a node in the memory
		newNode.data = data; // assigning data to that node
		if (head == null) { // checking if the list is empty or not
			head = newNode; //// if the list is empty create a node in it
		} else {
			newNode.next = head; // assigning the newnode next part as head
		}
		head = newNode; // now the head will point to the newnode
	}

	void insertMiddlenode(int data) {
		SLLNode newNode = new SLLNode(); // creating a node in the memory
		newNode.data = data; // assigning data to that node
		SLLNode temp = head; // assigning a temp variable to head
		System.out.println("Enter the Index");
		int index = scan.nextInt(); // taking the int index as a input
		for (int i = 0; i < index; i++) { // going to that index where we want to put the node
			temp = temp.next; // it will move till that index
		}
		newNode.next = temp.next; // assigning new node next part as temps next part
		temp.next = newNode; // assigning temp.next as the newnode

	}

	void findLoc() {
		Scanner scan = new Scanner(System.in); // taking scanner class as a input
		System.out.println("Enter the value");
		int item = scan.nextInt(); // taking the int item as a input
		SLLNode temp = head; // assigning a temp variable to head
		int i = 0; // starting the index from 0
		while (temp != null) { // moving the loop till we get null
			if (temp.data == item) { // If the data we are inserting is equal to the data in the node then it wil
										// give
										// the index
				System.out.println("The loc is at" + (i + 1));
				return;
			}
			temp = temp.next;
			i++;
		}
	}

	void deletelastnode() {
		SLLNode temp = head; // assigning head to temp variable
		if (head == null) { // checking if the list is empty or not
		}
		while (temp.next.next != null) { // moving the loop till the second last node of the list
			temp = temp.next;
		}
		temp.next = null; // making the temps next part null means the last node of the list
	}

	void deleteFirstnode() {
		if (head == null) { // checking if the list is empty or not
			System.out.println("List is empty");
		} else {
			head = head.next; // assigning head.next value to head
		}
	}

	void reverseList() {
		SLLNode prevNode = null; // taking a prev node as null
		SLLNode currNode = head; // making the curent node as head
		SLLNode temp; // taking a temp varibale to move forward in the list

		while (currNode != null) {
			temp = currNode.next; // To maintain the Link List
			currNode.next = prevNode; // pointing the current back to the previous node
			prevNode = currNode; // making previous node the current node
			currNode = temp; // assigning the current node as temp
		}

		head = prevNode; // making the previous node as head
	}

	void display() {
		SLLNode temp = head; // assigning head to temp variable
		while (temp != null) { // moving the loop till we get the null
			System.out.println(temp.data); // it will print the data
			temp = temp.next; // it will move forward
		}
	}
	// display reverse list method without using recursion
//	void displayReversList() {
//
//		if (head == null)
//			System.out.println("List is empty");
//
//		SllNode temp = head;
//		int countNode = 1;
//		while (temp.next != null) {
//			temp = temp.next;
//			countNode++;
//		}
//		System.out.println(countNode);
//		System.out.println(temp.data);
//		for (int i = 1; i < countNode; i++) {
//			temp = head;
//			for (int j = 1; j < countNode - i; j++) {
//				temp = temp.next;
//			}
//			System.out.println(temp.data);
//		}
//	}

	void displayRecursionReverseList() {

		displayReverselistRec(head); // calling the displayReverseList method

	}

	void displayReverselistRec(SLLNode start) {

		if (start == null) {
			System.out.println("ll is empty ");
			return;
		}

		if (start.next == null) { // checking the condition if the temp.next variable is null or not

			System.out.println(start.data);
		} else {
			displayReverselistRec(start.next);
			System.out.println(start.data);// this method will call itself till we reach the lastnode of the list
		}

		// printing the data
	}

	Singlylinklist recursionReverseLinkList(SLLNode start) {
		Singlylinklist slRev = new Singlylinklist();
		extracted(start, slRev);
		return slRev;
	}

	private void extracted(SLLNode firstNodeOfll, Singlylinklist slRev) {
		if (firstNodeOfll.next == null) { // checking the condition if the temp variable is null or not
			slRev.insertLastnode(firstNodeOfll.data);
		} else {
			extracted(firstNodeOfll.next, slRev);
			slRev.insertLastnode(firstNodeOfll.data);// this method will call itself till we reach the lastnode of the
														// list
		}
	}

}
