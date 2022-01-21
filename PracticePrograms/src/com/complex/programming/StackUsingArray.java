package com.complex.programming;

import java.util.Scanner;

public class StackUsingArray {
	int top;
	int size;
	int arr[];

	StackUsingArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	
	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == size - 1);
	}

	public void push(int ele) {
		if (!isFull()) {
			top++;
			arr[top] = ele;
			System.out.println("Element is push: " + ele);
		} else {
			System.out.println("Cannot insert the element the Stack is Full");
		}
	}

	public int pop() {
		if (!isEmpty()) {

			int topele = top;
			top--;
			System.out.println("Element is pop: " + arr[topele]);
			return arr[topele];
		} else {
			System.out.println("Stack is Empty:");
			return -1;
		}
	}
	public void full()
	{
		if(isFull())
		{
			System.out.println("The Stack is OverFlow");
		}
		else
		{
			System.out.println("The Stack is Not OverFlow");
		}
	}
	public void Empty()
	{
		if(isEmpty())
		{
			System.out.println("The Stack is UnderFlow");
		}
		else
		{
			System.out.println("The Stack is Not UnderFlow");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Creating the Object of an class
		StackUsingArray arr = new StackUsingArray(10);
		arr.full();
		arr.Empty();
		System.out.println("Enter the "+arr.size+"Elements into the Stack");
		Scanner sc = new Scanner(System.in);
	
		for (int i = 0; i < arr.size; i++) {
			int num = sc.nextInt();
			arr.push(num);
		}
		System.out.println(" ---------------------------- ");
//		arr.pop();
//		arr.pop();
		arr.full();
		arr.Empty();
//System.out.println(arr);

	}

}
