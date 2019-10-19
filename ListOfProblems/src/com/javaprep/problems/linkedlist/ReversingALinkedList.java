package com.javaprep.problems.linkedlist;

import java.util.LinkedList;

/*
 * Input: Head of following linked list
	1->2->3->4->NULL
	Output: Linked list should be changed to,
	4->3->2->1->NULL
	
	Input: Head of following linked list
	1->2->3->4->5->NULL
	Output: Linked list should be changed to,
	5->4->3->2->1->NULL
	
	Input: NULL
	Output: NULL
	
	Input: 1->NULL
	Output: 1->NULL
 */

public class ReversingALinkedList {

	public static void main(String[] args) {

		Node head = makeList();
		printList(head);
		head = reverse(head);
		printList(head);
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
	
	
	
	public static Node reverse(Node head) {
		
		// we start with three individual pointers current previous and next
		Node current = head;
		Node next;
		Node previous = null;
		
		while(current != null) {
			
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		head = previous;
		return head;
	}

}

