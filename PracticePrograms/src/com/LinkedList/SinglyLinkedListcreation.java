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
     public void display()
     {
    	 LinkedList current = first;
    	 while (current!=null) {
	              System.out.print(current.data+"--->");
	              current = current.next;
		}
    	 System.out.print("null");
     }
     
     public  int length(){
    	 if(first==null)
    	 {
    		return 0; 
    	 }
    	 int count = 0;
    	 LinkedList current = first;
    	 while (current!=null) {
		
		   count++;
		   current = current.next;
		}
    	 return count;
     }
	public static void main(String []args)
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
	
	
   s11.first.next = second;
   second.next = third;
   third.next = fourth;
   fourth.next = null;
   
   s11.display();
   System.out.println();
   System.out.println("Length is: "+s11.length());
  // System.out.println("The Singly Linked List is:  "+s11.first.data+"--->"+second.data+"--->"+third.data+"--->"+fourth.data);
 // System.out.println(System.identityHashCode(second.next));
	
	
}
}
