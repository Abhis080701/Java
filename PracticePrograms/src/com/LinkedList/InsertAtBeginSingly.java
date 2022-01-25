package com.LinkedList;

public class InsertAtBeginSingly {

	Node head;
	private static class Node{
		
		private int data;
		private Node next;
		
		public Node(int data)
		{
			
			this.data = data;
			this.next = null;
		}
		
	}
	public void insertAtBegin(int value)
	{
		Node newNode  = new Node(value);
		newNode.next = head;
		head = newNode;
		
	}
	public void Display()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.print(" | "+current.data+" | . |"+"--->");
			current = current.next;
		}
		System.out.println("null");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsertAtBeginSingly S = new InsertAtBeginSingly();
		S.insertAtBegin(1);
		S.insertAtBegin(2);
		S.insertAtBegin(3);
		S.insertAtBegin(4);
		S.insertAtBegin(5);
		S.Display();
		
	}

}
