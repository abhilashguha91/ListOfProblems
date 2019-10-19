package com.javaprep.problems.linkedlist;

public class OddEvenPositionedLinkedListProblem {

	public static void main(String[] args) {

		Node head = makeList();
		printList(head);
		oddEvenIt(head);
		printList(head);

	}
	
	public static Node makeList() {
			
			
			Node node1 = new Node(1);
			Node node2 = new Node(2);
			Node node3 = new Node(3);
			Node node4 = new Node(4);
			Node node5 = new Node(5);
			Node node6 = new Node(6);
			
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = node6;
			node6.next = null;
			
			return node1;
			
		}
		
		public static void printList(Node head) {
		
			while(head!=null) {
				System.out.println(head.val);
				head= head.next;
				
			}
			
		}
		
		public static void oddEvenIt(Node head) {
			
			int i=1;
			Node curr = head;
			Node evenHead = null;
			Node currEven = null;
			Node lastOdd = head;
	        
			while(curr!=null){
	            
	            if(i%2!=0){
	               
                    lastOdd = curr;
	                
	            }else{
                    
                    lastOdd.next = curr.next;
	                if(evenHead == null){
	                    evenHead = curr;
	                    currEven = evenHead;
	                }else{
	                    currEven.next = curr;
	                    currEven = currEven.next;
                        
	                }
	               
	            }
	            
	            if(curr.next == null){
	                lastOdd.next = evenHead;
                    if(currEven!=null)currEven.next = null;
	                break;
	            }
	            
	            curr = curr.next;
	            i++;
	            
			}
		}

}
	