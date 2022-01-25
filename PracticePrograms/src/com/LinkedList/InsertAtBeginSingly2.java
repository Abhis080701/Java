package com.LinkedList;

public class InsertAtBeginSingly2 {

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
	
	// Inserting the NewNode at the Begin Of An Singly LinkedList
	public void insertNode(int value) {
		Node newNode= new Node(value);
		newNode.next = head;
		head = newNode;
		
	}
	
	public void Display()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.print("| "+current.data+" | . |--->");
			current = current.next;
		}
		
		System.out.print("null");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InsertAtBeginSingly2 S = new InsertAtBeginSingly2();
for(int i=1;i<=10;i++)
     S.insertNode(i);

S.Display();
	}

}
