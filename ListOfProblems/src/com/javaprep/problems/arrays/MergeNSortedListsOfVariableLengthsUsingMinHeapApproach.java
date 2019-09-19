package com.javaprep.problems.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/*
 * Input:
 * [10, 20, 30, 40]
   [15, 25, 35]
   [27, 29, 37, 48, 93]
   [32, 33]
   Output:
   10 15 20 25 27 29 30 32 33 35 37 40 48 93 
 */
/*
 * For this we will create a min-heap using a priority queue. 
 * The operation would be quite simple, we first enter the first numbers of all the M arrays into the min-heap
 * when we poll the min-heap it'll give the least value
 * we'll then determine this value is from which array(out of those M arrays)
 * we'll insert the next element of this array into our min-heap
 * and we'll repeat the process of insertion and taking out till all the arrays are dry
 * As it is a min heap insert and retrieval operation it will take O(nlog(M))
 */
public class MergeNSortedListsOfVariableLengthsUsingMinHeapApproach {
	
	public static void main(String args[]) {
		
		List<List<Integer>> list = Arrays.asList(Arrays.asList(10, 20, 30, 40),
											Arrays.asList(15, 25, 35),
											Arrays.asList(27, 29, 37, 48, 93),
											Arrays.asList(32, 33));
		
		mergeLists(list);
	}
	
	public static void mergeLists(List<List<Integer>> list) {
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		// Adding the first N nodes with the 1st elements of each array into the min-heap
		for(int i=0;i<list.size();i++) {
			pq.add(new Node(list.get(i).get(0), i, 0));
		}
		
		while(!pq.isEmpty()) {
			
			//Polling for the min node
			Node min = pq.poll();
			
			System.out.println(min.getValue());
			
			//Make changes to the min and insert it
			// Make min the next element of it's array, use it's arrayNumber attribute to figure out which array it belongs to
			if( min.getIndex() + 1 < list.get(min.getArrayNumber()).size()) {
				
				min.setIndex(min.getIndex()+1);
				// mind you min.getIndex() is already increased don't increase it again
				min.setValue(list.get(min.getArrayNumber()).get(min.getIndex()));
				pq.add(min);
			}
		}
	}
}

class Node implements Comparable{

	int value; // this is value of this node
	int arrayNumber; // this will tell which array this value belongs to, should vary from 1 to N
	int index; // this will tell which element of the above array it is.
	
	
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public int getArrayNumber() {
		return arrayNumber;
	}


	public void setArrayNumber(int arrayNumber) {
		this.arrayNumber = arrayNumber;
	}


	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}


	public Node(int value, int arrayNumber, int index) {
		this.value = value;
		this.arrayNumber = arrayNumber;
		this.index = index;
	}


	@Override
	public int compareTo(Object o) {
		Node n = (Node)o;
		return value - n.getValue();
	}
	
}
