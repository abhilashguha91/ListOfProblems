package com.javaprep.problems.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromAList {

	public static void main(String[] args) {

		Node head = makeList();
		//printList(head);
		removeDuplicates(head);
		printList(head);

	}
	
	public static Node makeList() {
			
			
			Node node1 = new Node(1);
			Node node2 = new Node(1);
			Node node3 = new Node(3);
			Node node4 = new Node(1);
			Node node5 = new Node(2);
			
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
		
		public static void removeDuplicates(Node head) {
		
			Set<Integer> set = new HashSet<Integer>();
			Node curr = head;
			Node prev = head;
			while(curr!=null) {
				
				if(set.contains(curr.val)) {
					prev.next = curr.next;
				}else {
					set.add(curr.val);
					prev = curr;
				}
				
				curr = curr.next;
				
			}
			
		}

}