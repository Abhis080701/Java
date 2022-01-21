package com.LinkedList;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double now = System.currentTimeMillis();
		TimeComplexity demo = new TimeComplexity();
		System.out.println(demo.findSum1(99999));
		System.out.println("Time Taken for findSum1: " + (System.currentTimeMillis() - now) + " millisecs");
		System.out.println(demo.findSum2(99999));
		System.out.println("Time Taken for findSum1: " + (System.currentTimeMillis() - now) + " millisecs");

	}

	public int findSum1(int n) {
		return n * (n + 1) / 2;
	}

	public int findSum2(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
