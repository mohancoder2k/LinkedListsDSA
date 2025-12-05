package LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l1 = new LL();
		l1.insertAtFirst(20);
		l1.insertAtFirst(15);
		l1.insertAtFirst(10);
		l1.insertAtFirst(5);
	//	l1.printList();
		
		LL l2 = new LL();
		l2.insertAtLast(5);
		l2.insertAtLast(10);
		l2.insertAtLast(15);
		l2.insertAtLast(20);
		l2.printList();
	//	l2.traverseFromLast(l2.head);
	//	l2.reverseList();
		// l2.printList();
		
		LL l3 = new LL();
		l3.insertAtLast(1);
		l3.insertAtLast(2);
		l3.insertAtLast(2);
		l3.insertAtLast(1);
		l3.printList();
		System.out.println(l3.palindrome());	
	}

}
