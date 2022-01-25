package com.LinkedList;

public class SinglyLinkedList {
	
	LinkedList head;
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
 public void Display()
 {

 	LinkedList current = head;
 	while(current!=null)
 	{
 		System.out.print("|"+current.data+"| . |"+"--->");
 		current  = current.next;
 		
 	}
 	System.out.print("null");
 	
 }
 public int length()
 {
	 LinkedList current = head;
	 if(head==null)
		 return 0;
	 int count = 0;
	 while(current!=null)
	 {
		 count++;
		 current = current.next;
	 }
	 return count;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SinglyLinkedList s11 = new SinglyLinkedList();
s11.head = new LinkedList(10);
LinkedList second = new LinkedList(20);
LinkedList third = new LinkedList(30);
LinkedList fourth = new LinkedList(40);

s11.head.next = second;
second.next = third;
third.next = fourth;
fourth.next = null;

s11.Display();
System.out.println();
System.out.println("The Length Of an Given LinkedList is: "+s11.length());

	
	}

}
