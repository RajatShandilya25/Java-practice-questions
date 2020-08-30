package com.LinkedList.Implementation;

public class LinkedList 
{
	public static void main(String[] args) 
	{
		
		AddNodeAtBeginning(5);
		AddNodeAtBeginning(10);
		AddNodeAtBeginning(15);
		AddNodeAtBeginning(20);
		LinkedListLength();

		PrintLinkedList();
		
	}
	
	static class Node
	{
		int Data;
		Node NextNode;
		
		public Node(int data)
		{
			this.Data = data;
			this.NextNode = null;
		}
	}

	
	public static Node head = null;
	public static Node tail = null;
	
	
	public static void AddNodeAtBeginning(int Data)
	{
		Node NewNode = new Node(Data);
		
		if(head == null)
		{
			head = NewNode;;
			tail = NewNode;
		}
		else
		{
			Node temp = new Node(Data);
			
			temp = head;
			head = NewNode;
			head.NextNode = temp;
		}
	}
	
	
	public static void LinkedListLength()
	{
		int Length =0;
		Node pointer = head;
		
		while(pointer != null)
		{
			Length++;
			pointer = pointer.NextNode;
		}
		System.out.println("Length of linked list is: " +Length);
	}
	
	
	
	public static void PrintLinkedList()
	{
		Node pointer = head;
		
		if(pointer == null)
		{
			System.out.println("List is empty");
		}
		while(pointer != null)
		{
			System.out.println(pointer.Data);
			pointer = pointer.NextNode;
		}
	}

}
