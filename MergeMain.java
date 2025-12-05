package LinkedList;

public class MergeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l2 = new LL();
		l2.insertAtLast(5);
		l2.insertAtLast(10);
		l2.insertAtLast(15);
		l2.insertAtLast(20);
		l2.insertAtLast(30);
		
		LL l3 = new LL();
		l3.insertAtLast(15);
		l3.insertAtLast(20);
		l3.insertAtLast(25);
		l3.insertAtLast(40);
		l3.insertAtLast(60);
		
		 System.out.print("L2: ");
	        l2.printList();
	        System.out.print("L3: ");
	        l3.printList();

	        Node mergedHead = LL.mergeTwoSortedLists(l2.head, l3.head);

	        System.out.print("Merged: ");
	        Node cur = mergedHead;
	        while (cur != null) {
	            System.out.print(cur.data);
	            if (cur.next != null) System.out.print(" -> ");
	            cur = cur.next;
	        }
	        System.out.println();
	}

}
