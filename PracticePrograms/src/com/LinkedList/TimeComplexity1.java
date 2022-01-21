package com.LinkedList;

public class TimeComplexity1 {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
int n = 10,a=0;
System.out.println("n  | i  |  j  |  a");
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				a = a+i+j;
				System.out.println(n+"  | "+j+"  |  "+i+"  |  "+a);
			}
			
		}
		
		
	}

}
