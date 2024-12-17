package com.scl;

public class SCLTest {

	public static void main(String[] args) {
       SinglyCircular sll = new SinglyCircular();
//       sll.insertFirstNode(10);
       sll.insertLastNode(30);
//       sll.insertFirstNode(5);
       sll.insertLastNode(20);
       sll.insertLastNode(40);
       sll.insertLastNode(50);
//       sll.insertLastNode(60);
       sll.display();
//       sll.insertMiddleNode(24);
////       sll.display();
//       sll.deleteFirstNode();
//       sll.display();
//       sll.deleteLastNode();
//       sll.display();
//       sll.deleteMiddleNode();
       sll.reverse();
       sll.display();
	}

}
