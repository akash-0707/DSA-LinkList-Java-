package com.igr.sll;

public class SLLtest {

	public static void main(String[] args) {

		Singlylinklist sll = new Singlylinklist();
		sll.insertLastnode(40);
		sll.insertLastnode(60);
		sll.insertLastnode(80);
		System.out.println("Display list");
		sll.display();
		System.out.println("Display rev");
		sll.displayRecursionReverseList();
		System.out.println("Output of display reverse recursion");
		Singlylinklist newOne = sll.recursionReverseLinkList(sll.head);
		newOne.displayRecursionReverseList();
		
//		sll.insertFirstnode(20);
//		sll.display();
//		sll.insertMiddlenode(50);
//		sll.display();
//		sll.deletelastnode();
//		sll.display();
//		sll.deleteFirstnode();
//		sll.display();
//		sll.reverseList();
//		sll.display();
//		sll.findLoc();
//		sll.display();
	}

}
