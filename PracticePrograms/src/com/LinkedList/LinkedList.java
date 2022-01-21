package com.LinkedList;

public class LinkedList {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList list = new LinkedList();
list.head  = new Node(1);
Node secondNode  = new Node(2);
Node thirdNode = new Node(3);
list.head.next = secondNode;

secondNode.next = thirdNode;
System.out.println(list.head.data+"->"+secondNode.data+"->"+thirdNode.data);
	}

}
