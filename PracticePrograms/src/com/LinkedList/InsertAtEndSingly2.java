package com.LinkedList;

public class InsertAtEndSingly2 {

	
	Node head;
	public static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
			
		}
		
		
		
	}
	
	public void insertAtEnd(int value)
	{
		Node NewNode = new Node(value);
		if(head==null)
		{
			head=NewNode;
			return;
		}
		Node current = head;
		while(current.next!=null)
		{
			current  = current.next;
			
		}
		// System.out.print(current.next)  its print null;
		current.next = NewNode;
	}
	
	public void Display()
	{
		Node current =head;
	    while(current!=null)
	    {
	    	System.out.print(" | "+current.data+" | . | -->>");
	    	current = current.next;
	    }
		System.out.print("null");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtEndSingly2 I = new InsertAtEndSingly2();
		
		I.insertAtEnd(1);
		I.insertAtEnd(2);
		I.insertAtEnd(3);
		I.insertAtEnd(4);
		I.insertAtEnd(5);
		
		I.Display();
		   
		
		
	}

}
