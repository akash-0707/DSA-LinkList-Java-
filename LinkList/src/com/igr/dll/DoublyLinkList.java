package com.igr.dll;

import java.util.Scanner;

public class DoublyLinkList {
	DLLNode head;
	Scanner scan = new Scanner(System.in); // taking the scanner class as a input

	void insertFirstNode(int data) {
		DLLNode newNode = new DLLNode(); // creating a node in the memory
		newNode.data = data; // assigning data to the node
		if (head == null) { // checking if the list is empty or not
			head = newNode; // if the list is empty then a create a node in it
		} else {
			newNode.next = head; // assigning the newnode next part as head
			head.prev = newNode; // assigning the head's prev part to the newnode as it as next as well as prev
									// reference
		}
		head = newNode; // pointing head to the newnode
	}

	void insertLastNode(int data) {
		DLLNode newNode = new DLLNode(); // creating a node in the memory
		newNode.data = data; // assigning data to the node
		if (head == null) {
			head = newNode; // if the list is empty then a create a node in it
		} else {
			DLLNode temp = head; // assigning a temp variable as a head
			while (temp.next != null) { // moving the loop till we get the null condition
				temp = temp.next;
			}
			temp.next = newNode; // the newnode value will be read and assign to the lastnode next part
			newNode.prev = temp; // pointing newnode prev part back to the temp
		}
	}

	void insertMiddleNode(int data) {
		DLLNode newNode = new DLLNode(); // creating a node in the memory
		newNode.data = data; // assigning data to the node
		DLLNode temp = head; // assigning a temp variable as a head
		System.out.println("Enter at a specific Index:");
		int index = scan.nextInt(); // taking int index as a input
		for (int i = 1; i < index; i++) { // going to that index using for loop where we want to add the node
			temp = temp.next;
		}
		newNode.next = temp.next; // assigning new node next part as temps next part
//        newNode.prev = temp;
//        temp.next.prev = newNode;
		temp.next = newNode; // assigning new node next part as temps next part
	}

	void deleteFirstNode() {
		if (head == null) { // checking if the list is empty or not
			System.out.println("List is empty:");
		} else {
			head = head.next; // assigning head the head.next value
			head.prev = null; // head's previous part will be null
		}
	}

	void deleteLastNode() {
		if (head == null) { // checking if the list is empty or not
			System.out.println("List is empty:");
		}
		DLLNode temp = head; // assigning a temp variable to head
		while (temp.next.next != null) { // moving the loop till the second last node of the list
			temp = temp.next;
		}
		temp.next = null; // making the temps next part null means the last node
	}

	void reverseLinkList() {
		System.out.println("The Reverse Link List is:");
		DLLNode prev = null; // taking a prev node as null
		DLLNode current = head;
		 // making the curent node as head
		DLLNode temp; // taking a temp varibale to move forward in the list
		while (current != null) {
			temp = current.next; // To maintain the Link List
			current.next = prev; // pointing the current back to the previous node
			prev = current; // making previous node the current node
			current = temp; // assigning the current node as temp
		}
		head = prev; // making the previous node as head
	}

	void findLoc() {
		Scanner scan = new Scanner(System.in); // taking the scanner input class
		System.out.println("Enter the Value");
		int item = scan.nextInt(); // taking the int item as the input
		DLLNode temp = head; // creating the temp variable as a head
		int i = 0; // starting from the index 0
		while (temp != null) { // moving the loop till we get null
			if (temp.data == item) { // If the data we are inserting is equal to the data in the node then it will
										// give the index

				System.out.println("The Item is at :" + (i + 1));
			}
			temp = temp.next;
			i++; // moving to the index
		}
	}

	void findNode() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the index");
		int index = scan.nextInt();
		DLLNode temp = head;
		int i = 1;
		while (temp != null) {
			if (i == index) {
				System.out.println("Value is:" + temp.data);
			}
			temp = temp.next;
			i++;
		}

	}

	void deleteRandomNode() {
		if (head == null) { // checking if the list is empty or not
			System.out.println("List is Empty:");
		} else {
			DLLNode temp = head; // // assigning a temp variable to head
			System.out.println("Enter the index where you want to delete:");
			int index = scan.nextInt(); // taking int index as a input
			for (int i = 1; i < index - 1; i++) { // going to that specific index where we want to delete the node
				temp = temp.next; // moving forward temp one by one
			}
			temp.next = temp.next.next; // assigning to temps next part the temps next next part (for eg:- temp is 1 and
										// giving it the next part means 2 node and its next means the 3 node so the 2
										// will be deleted)
		}
	}
	void show() {
		DLLNode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();

	}
	void displayRecursionReverseList() {
		DLLNode temp = head; // assigning a temp variable to head
		if (temp == null) { // checking the condition if temp is null or not if it is it null means there is
							// no node present
			System.out.println("list is empty");
		} else if (temp.next == null) {
			temp = temp.next; // checking if there is only one node present in the list

		} else {
			displayReverselist(temp); // calling the displayReverseList method
		}

	}

	void displayReverselist(DLLNode temp) {
		if (temp == null) { // checking the condition if the temp variable is null or not
			return;
		} else {
			displayReverselist(temp.next); // this method will call itself till we reach the lastnode of the list
		}

		System.out.println(temp.data); // printing the data
	}
}
	
	


