package com.LinkedList;

public class SinglyLinkedListcreation {
     LinkedList first;
     public static class LinkedList
     {
    	 
    	 int data;
    	 LinkedList next;
    	 public LinkedList(int data)
    	 { 
    		 this.data = data;
    		 this.next = null;
    	 }
     }
	public static void main()
{
	
	SinglyLinkedListcreation s11 = new SinglyLinkedListcreation();
	
	s11.first = new LinkedList(10);
	LinkedList second = new LinkedList(20);
	LinkedList third = new LinkedList(30);
	LinkedList fourth = new LinkedList(40);
	/*
	 *     first                     second                third               fourth
	 *       |                          |                    |                    |
	 *    | 10 | second | --->  | 20 | third | ---> | 30 | fourth  |  ---> | 40 | null |
	 * 
	 * 
	 */
   s11.first = second;
   second.next = third;
   third.next = fourth;
   fourth.next = null;
   
   System.out.println("The Singly Linked List is:  "+second.next);
	
	
}
}
