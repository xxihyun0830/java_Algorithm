package stack;
import java.util.*;

public class top_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			list.add(m);
		}

		for (int m : list) {
			if (stack.isEmpty()) {
				stack.push(m);
				sb.append("0"+" ");
				
			} else {
				int top = stack.pop();
				if (top < m) {
					if(list.indexOf(m)==1 ) {
						sb.append("0"+" ");
						
					}else if (list.indexOf(top) > list.indexOf(m)) {
						sb.append(  (list.indexOf(top) + 1) +" ");
						
					} else if (list.indexOf(top) < list.indexOf(m)) {
						sb.append("0"+" ");
					}
					top = m;
					stack.push(top);
				}

				if (top > m) {
					sb.append(  (list.indexOf(top) + 1) +" ");
					stack.push(top);
				}
			}
		}
		
		System.out.println(sb.toString());
        sc.close();

	}

}
