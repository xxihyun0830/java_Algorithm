package stack;

import java.util.*;

public class top_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			list.add(m);
		}

		for (int m : list) {
			System.out.println("__________________________________________");
			System.out.println("____" + m);
			if (stack.isEmpty()) {
				stack.push(m);
				System.out.println("1.curr-m :" + m);
				System.out.println("1.curr-top :" +stack.peek());
				System.out.println(">>>>"+"0" + " -- Ã¹¹øÂ° ");
				
			} else {
				int top = stack.pop();
				if (top < m) {
					
					System.out.println("2.curr-m :" + m);
					System.out.println("2.curr-top :" +top);
					
					if(list.indexOf(m)==1 ) {
						System.out.println("----------"+"0");
						
					}else if (list.indexOf(top) > list.indexOf(m)) {
						System.out.println(">>>>"+(list.indexOf(top) + 1));
						
					} else if (list.indexOf(top) < list.indexOf(m)) {
						System.out.println("1. "+"0");
					}

					top = m;
					stack.push(top);

				}

				if (top > m) {
					System.out.println("4.curr-m :" + m);
					System.out.println("4.curr-top :" +top);
					
					System.out.println(">>>>"+(list.indexOf(top) + 1));
					stack.push(top);

				}

			}

		}

	}

}
