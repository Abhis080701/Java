package abhishek;

import java.util.*;

public class StackP1 {
	static void stack_push(Stack<Integer> stack, int num) {
		stack.push(num);
		System.out.println(num + " Is Push Into The Stack");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Of Element U want to Store");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Element" + (i + 1));
			int num = sc.nextInt();
			stack_push(stack, num);

		}
		stack.pop();
		Iterator<Integer> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
