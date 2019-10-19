package com.javaprep.problems.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromASortedList {

	public static void main(String[] args) {

		Node head = makeList();
		//printList(head);
		removeDuplicatesFromSortedList(head);
		printList(head);

	}
	
	public static Node makeList() {
			
			
			Node node1 = new Node(1);
			Node node2 = new Node(1);
			Node node3 = new Node(2);
			Node node4 = new Node(2);
			Node node5 = new Node(3);
			//Node node6 = new Node(4);
			
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = null;
			//node6.next = null;
			
			return node1;
			
		}
		
		public static void printList(Node head) {
		
			while(head!=null) {
				System.out.println(head.val);
				head= head.next;
				
			}
			
		}
		
		public static void removeDuplicatesFromSortedList(Node head) {
		
			Node curr = head;
			Node prev = head;
			while(curr!=null) {
				
				if(curr!=null && curr.next!=null && (curr.val == curr.next.val)) {
                    curr.next = curr.next.next;
				}else {
                    curr = curr.next;
				}
				
			}
			
		}

}
