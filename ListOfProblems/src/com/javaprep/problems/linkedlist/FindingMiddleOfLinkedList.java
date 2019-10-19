package com.javaprep.problems.linkedlist;

public class FindingMiddleOfLinkedList {

	public static void main(String[] args) {

		Node head = makeList();
		printList(head);
		findMiddle(head);

	}
	
	public static Node makeList() {
			
			
			Node node1 = new Node(1);
			Node node2 = new Node(2);
			Node node3 = new Node(3);
			Node node4 = new Node(4);
			Node node5 = new Node(5);
			
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = null;
			
			return node1;
			
		}
		
		public static void printList(Node head) {
		
			while(head!=null) {
				System.out.println(head.val);
				head= head.next;
				
			}
			
		}
		
		public static void findMiddle(Node head) {
			
			Node slow=head;
			Node fast=head;
			Node prev=null;
			while(fast != null && fast.next!=null) {
				
				fast = fast.next.next;
				prev = slow;
				slow = slow.next;
			}
			
			//even numbers
			if(fast==null) {
				System.out.println("["+prev.val+","+ slow.val+"]");
			}else {
				System.out.println("["+slow.val+"]");
			}
		}

}
