package com.LinkedList.Implementation;

import java.net.StandardSocketOptions;

public class MyLinkedList {

	public static void main(String[] args) 
	{	
		InsertAtStart(5);
		InsertAtStart(10);
		InsertAtStart(15);
		InsertAtStart(20);

		PrintElements();
		
		
		
	}

	
	 static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		
	}
	 
	 public static Node head = null;
	 public static Node tail = null;
	 
	 
	 /*
	  * Insert element at the beginning
	  */
	 public static void InsertAtStart(int data)
	 {
		 Node NewNode = new Node(data);
		 
		 if(head == null)
		 {
			 head = NewNode;
			 tail = NewNode;
		 }
		 else
		 {
			 Node temp = head;
			 head = NewNode;
			 head.next = temp;
		 }
	 }
	 
	 /*
	  * Print elements
	  */
	
	 public static void PrintElements()
	 {
		 if(head == null)
		 {
			 System.out.println("List is empty");
		 }
		 else
		 {
			 Node pointer = head;
			 while(pointer != null)
			 {
				 System.out.println(pointer.data);
				 pointer = pointer.next;
			 }
		 }
	 }
	
	
}
