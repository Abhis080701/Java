package com.LinkedList;

public class InsertAtEndSingly {
    Node head;
    
    public static class Node{
    	int data;
    	Node next;
    	public Node(int data)
    	{
    		this.data = data;
    		this.next = null;
    		
    	}
    	
    }
    
    public void InsertAtEnd(int value)
    {
    	Node NewNode =  new Node(value);
    	if(head==null)
    	{
    		head = NewNode;
    		return;
    	}
    	Node current = head;
    	while(current.next!=null)
    	{
    		current = current.next;
    		
    	}
    	current.next = NewNode;
    	
    }
    
    public void Display()
    {
    	Node current = head;
    	while(current!=null)
    	{
    		
    	System.out.print(" | "+current.data+" | . |--->");
    	current = current.next;
    	}
    	System.out.print("null")		;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtEndSingly I = new InsertAtEndSingly();
		for(int i=0;i<=10;i++)
		    	I.InsertAtEnd(i);
		 I.Display();
		
		
		
	}

}

/*
 * | 0 | . |---> | 1 | . |---> | 2 | . |---> | 3 | . |---> | 4 | . |---> | 5 | . |---> | 6 | . |---> | 7 | . |---> | 8 | . |---> | 9 | . |---> | 10 | . |--->null
*/