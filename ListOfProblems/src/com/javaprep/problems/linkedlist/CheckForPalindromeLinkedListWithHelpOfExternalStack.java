package com.javaprep.problems.linkedlist;

import java.util.Stack;

public class CheckForPalindromeLinkedListWithHelpOfExternalStack {

	public static void main(String[] args) {

		Node head = makeList();
		printList(head);
		System.out.println("Is Palindrome: "+isPalindrome(head));
		
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
	
	
	public static boolean isPalindrome(Node head) {
		
		Stack<Integer> intStack = new Stack<Integer>(); 
		Node slowPtr = head;
		Boolean isPalindrome = true;
		
		while(slowPtr != null) {
			intStack.add(slowPtr.val);
			slowPtr = slowPtr.next;
		}
		
		while(head != null) {
			
			if(head!=null)
			if(head.val!=intStack.pop()) {
				isPalindrome = false;
				break;
			}
			head = head.next;
		}
		
		
		
		return isPalindrome;
	}

}

class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}