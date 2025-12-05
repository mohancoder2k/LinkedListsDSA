package LinkedList;

public class LL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l2 = new LL();
		l2.insertAtLast(5);
		l2.insertAtLast(10);
		l2.insertAtLast(15);
		l2.insertAtLast(20);
		l2.insertAtLast(30);
	//	l2.insertCycle(50);
		//l2.printList();
		System.out.println("L2 has loop or not : " + l2.cycleOrNot());
		System.out.println("Cycle Start Node : " + l2.cycleStart());
		System.out.println("Middle element of the L2 : " + l2.MiddleElement());
		l2.printList();
		l2.deletefromNthNode(2);
		l2.printList();
	}

}
