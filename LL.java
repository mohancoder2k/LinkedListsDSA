package LinkedList;

public class LL {
		
	Node head;
	Node prev = null;
	public void insertAtFirst(int data) {
		Node nn = new Node(data);
		nn.next = head;
		head = nn;
	}
	
	public void insertCycle(int data) {
		Node nn = new Node(data);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
			temp.next = nn;
			nn.next = temp;
	}
	
	public boolean cycleOrNot() {
		Node slow = head;
		Node fast = head;
		while(slow.next != null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
	
	public Node cycleStart() {
		Node slow = head;
		Node fast = head;
		while(slow.next != null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		  // No cycle
	    if (fast == null || fast.next == null) {
	        return null;
	    }
		slow = head;
		while(slow == head) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	
	public int MiddleElement() {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	public void insertAtLast(int data) {
		Node nn = new Node(data);
		if(head == null) {
			head = nn;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
	}
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print("| " + temp.data + " | "  + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public void reverseList() {
		Node prevNode = null;
		Node temp = head;
		Node nxtNode = head;
		while(nxtNode != null) {
			nxtNode = temp.next;
			temp.next = prevNode;
			prevNode = temp;
			temp = nxtNode;
		}
		head = prevNode;
	}
	public boolean palindrome() {
		
		Node prevNode = null;
		Node temp = head;
		Node nxtNode = head;
		while(nxtNode != null) {
			nxtNode = temp.next;
			temp.next = prevNode;
			prevNode = temp;
			temp = nxtNode;
		}
		temp = prevNode;
		while(head != null || temp != null) {
			if(head.data == temp.data) {
				head = head.next;
				temp = temp.next;
			}else {
				return false;
			}
		}
		return true;
	}
	
 // 1-2-3-4-5
	// prev.next = temp.next;
	
	public void deletefromNthNode(int n) {
		Node dummy = new Node(-1);
		dummy.next = head;
		
		Node slow = dummy;
		Node fast = dummy;
		
		for(int i=0; i<n; i++) {
			fast = fast.next;
		}
		while(fast.next != null && fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		head = dummy.next;
	}
	
	public static Node mergeTwoSortedLists(Node L1, Node L2) {
		Node dum = new Node(-1);
		Node temp = dum;
		
		Node p1 = L1;
		Node p2 = L2;
		
		while(p1 != null && p2 != null) {
			 if (p1.data <= p2.data) {
	                temp.next = p1;
	                p1 = p1.next;
	            } else {
	                temp.next = p2;
	                p2 = p2.next;
	            }
			temp = temp.next;
		}
		if(p1 != null) {
			temp.next = p1;
		}else {
			temp.next = p2;
		}
		return dum.next;
	}
	
	/*
	 * public int traverseFromLast(Node head) { if(head == null) return 0;
	 * traverseFromLast(head.next); // System.out.print("| " + head.data + " | " +
	 * "->"); return head.data; }
	 */

}
