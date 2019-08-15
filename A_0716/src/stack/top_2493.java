package stack;

import java.util.*;

public class top_2493 {
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
				System.out.println(">>>>"+"0" + "--Ã¹¹øÂ° ");
				System.out.println("1.curr-m :" + m);
				System.out.println("1.curr-top :" +stack.peek());
				
			} else {
				int top = stack.pop();
				if (top < m) {
					
					System.out.println("2.curr-m :" + m);
					System.out.println("2.curr-top :" +top);
					
					if(list.indexOf(m)==0 ) {
						System.out.println(">>>>>>>"+"0");
						
					}else if (list.indexOf(top) > list.indexOf(m)) {
						System.out.println("2.list.indexOf(top) : " + list.indexOf(top));
						System.out.println("2.list.indexOf(m): " + list.indexOf(m));
						System.out.println(">>>>"+"0");
						
					} else if (list.indexOf(top) < list.indexOf(m)) {
						
						System.out.println("3.list.indexOf(top) : " + list.indexOf(top));
						System.out.println("3.list.indexOf(m): " + list.indexOf(m));
						System.out.println(">>>>"+(list.indexOf(top) + 1));
						

					}
					top = m;
					stack.push(top);
					
				}

				if (top > m) {
					System.out.println("4.curr-m :" + m);
					System.out.println("4.curr-top :" +top);
					System.out.println("4.list.indexOf(top) : " + list.indexOf(top));
					System.out.println("4.list.indexOf(m): " + list.indexOf(m));
					
					System.out.println(">>>>"+(list.indexOf(top) + 1));
					stack.push(top);

				}

			}

		}

	}

}
