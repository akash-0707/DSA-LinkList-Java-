package com.dcl;

public class DCLTest {

	public static void main(String[] args) {
        DoublyCircularLinkList dcl = new DoublyCircularLinkList();
        dcl.insertAtFirst(10);
        dcl.insertAtFirst(20);
        dcl.display();
        dcl.insertAtEnd(30);
        dcl.display();
//        dcl.insertAtMiddle(43);
//        dcl.display();
//        dcl.deleteAtFirst();
//        dcl.display();
//        dcl.deleteAtLast();
//        dcl.display();
        dcl.deleteAtMiddle();
        dcl.display();
	}

}
